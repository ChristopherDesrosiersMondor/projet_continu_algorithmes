package Algos;

import java.awt.Color;

import Labyrinthe.GraphNode;
import Labyrinthe.Labyrinth;
import Labyrinthe.Queue;

public class BreathFirstSearch {
    public static void searchWide(GraphNode<String> node) {
        Queue<GraphNode<String>> nextLevel = new Queue<>();
        nextLevel.add(node);

        while (nextLevel.getLength() > 0) {
            GraphNode<String> current = nextLevel.getFront().get_value();
            if (current.getSpecial() == GraphNode.EXIT) {
                System.out.println("Found exit");
                current.setVisite(true);
                if (current.getButton() != null) {
                    current.getButton().setBackground(Color.YELLOW);
                }
                BreathFirstSearch.trace_path(current);
                return;
            }
            for(GraphNode<String> voisin : current.getVoisins()) {
                // j'avais pas de condition pour voir si le voisin etait deja dans le queue faque des fois ca devenait trop gros
                // dou mon probleme avec le breath search  execution time
                if (voisin != null && !voisin.isWall() && !voisin.isVisite() && !nextLevel.isIn(voisin)) {
                    voisin.setParent(current);
                    nextLevel.add(voisin);
                }
            }
            current.setVisite(true);
            if (current.getButton() != null) {
                current.getButton().setBackground(Color.YELLOW);
            }
            nextLevel.remove();
        }
    }

    public static void trace_path(GraphNode<String> node) {
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
        Labyrinth test = new Labyrinth();
        BreathFirstSearch.searchWide(test.getStart());
    }
}
