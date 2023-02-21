package Algos;

import java.awt.Color;

import Labyrinthe.ArrayList;
import Labyrinthe.GraphNode;
import Labyrinthe.Labyrinth;
import Labyrinthe.MyPair;
import Labyrinthe.PriorityQueue;
import Labyrinthe.Tuile;

public class Astar {
    private Labyrinth labyrinthe;

    public Astar(Labyrinth labyrinthe) {
        this.labyrinthe = labyrinthe;
    }

    public void setAll() {
        int nbDeplacementGaucheAvantTopLeftPourLaSortie = 0;
        int nbDeplacementHautAvantTopLeftPourLaSortie = 0;
        GraphNode<String> sortie = this.labyrinthe.getExit();
        while (sortie.getWest() != null) {
            nbDeplacementGaucheAvantTopLeftPourLaSortie += 1;
            sortie = sortie.getWest();
        }
        sortie = this.labyrinthe.getExit();
        while (sortie.getNorth() != null) {
            nbDeplacementHautAvantTopLeftPourLaSortie += 1;
            sortie = sortie.getNorth();
        }

        for (ArrayList<Tuile> row : this.labyrinthe.getLabyrinthe()) {
            for (Tuile tile : row) {
                for (ArrayList<GraphNode<String>> tileRow : tile.getMatrice()) {
                    for (GraphNode<String> node : tileRow) {
                        // Jutilisait les meme varible que pour le calcul de la sortie ici et donc les valeur faisait juste monter toujours
                        int nbDeplacementGaucheAvantTopLeftPourLeNode = 0;
                        int nbDeplacementHautAvantTopLeftPourLeNode = 0;
                        GraphNode<String> nodeTemp = node;
                        while (nodeTemp.getWest() != null) {
                            nbDeplacementGaucheAvantTopLeftPourLeNode += 1;
                            nodeTemp = nodeTemp.getWest();
                        }
                        nodeTemp = node;
                        while (nodeTemp.getNorth() != null) {
                            nbDeplacementHautAvantTopLeftPourLeNode += 1;
                            nodeTemp = nodeTemp.getNorth();
                        }
                        node.setParent(null);
                        node.setCost(0);
                        node.setPriorite(Double.POSITIVE_INFINITY);
                        // J'utilise pythagore pour trouver la distance a la sortie de chaque node et j'utilise cette valeur comme heuristique
                        int a = nbDeplacementGaucheAvantTopLeftPourLaSortie - nbDeplacementGaucheAvantTopLeftPourLeNode;
                        int b = nbDeplacementHautAvantTopLeftPourLaSortie - nbDeplacementHautAvantTopLeftPourLeNode;
                        int c = Math.abs(a+b);
                        c += Math.abs(node.distanceDeDroite() - this.labyrinthe.getExit().distanceDeDroite());
                        c += Math.abs(node.distanceDeGauche() - this.labyrinthe.getExit().distanceDeGauche());
                        c += Math.abs(node.distanceDuBas() - this.labyrinthe.getExit().distanceDuBas());
                        c += Math.abs(node.distanceDuHaut() - this.labyrinthe.getExit().distanceDuHaut());
                        node.setHeuristique(c);
                    }
                }
            }
        }
    }

    public void solve() {
        // Etape 1 - set all nodes to right values
        setAll();

        // Etape 2 - start prioritaire et outils de A*
        this.labyrinthe.getStart().setPriorite(0.0);
        this.labyrinthe.getStart().setCost(0);

        PriorityQueue<GraphNode<String>> ouverts = new PriorityQueue<>();
        PriorityQueue<GraphNode<String>> visites = new PriorityQueue<>();

        ouverts.add(new MyPair<GraphNode<String>>((int)this.labyrinthe.getStart().getPriorite(), this.labyrinthe.getStart()));
        // Etape 3
        while (!ouverts.isEmpty()) {
            GraphNode<String> current_node = ouverts.pop();
            visites.add(new MyPair<GraphNode<String>>((int)current_node.getPriorite(), current_node));
            current_node.setVisite(true);
            if (current_node.getButton() != null) {
                current_node.getButton().setBackground(Color.YELLOW);
            }


            for (GraphNode<String> voisin: current_node.getVoisins()) {
                if (voisin != null && !voisin.isWall()) {
                    if (voisin.getSpecial() == GraphNode.EXIT) {
                        voisin.setParent(current_node);
                        trace_path(voisin);
                        // est-ce que c'est parce que je continuait a checker les ouverts apres avoir trouver la sortie?
                        ouverts = new PriorityQueue<>();
                        break;
                    }
                    int oldCost = voisin.getCost();
                    int newCost = current_node.getCost() + 1;
                    if (ouverts.isIn(voisin) && newCost < oldCost) {
                        ouverts.remove(voisin);
                    }
                    if (visites.isIn(voisin) && newCost < oldCost) {
                        visites.remove(voisin);
                    }
                    if (!ouverts.isIn(voisin) && !visites.isIn(voisin)) {
                        voisin.setCost(newCost);
                        voisin.setPriorite(Double.valueOf(voisin.getCost() + voisin.getHeuristique()));
                        voisin.setParent(current_node);
                        ouverts.add(new MyPair<GraphNode<String>>((int)voisin.getPriorite(), voisin));
                    }
                }
            }
            ouverts.sortIt();
        }
    }

    public void trace_path(GraphNode<String> node) {
        GraphNode<String> current_node = node;
        while (current_node.getParent() != null) {
            if (current_node.getButton() != null) {
                current_node.getButton().setBackground(Color.PINK);
            }
            current_node = current_node.getParent();
        }
        // System.out.println("Found exit");
    }

    public static void main(String[] args) {
        Astar solver = new Astar(new Labyrinth());
        solver.solve();
    }
}