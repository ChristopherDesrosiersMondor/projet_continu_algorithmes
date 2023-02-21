package Algos;

import java.awt.Color;

import Labyrinthe.GraphNode;
import Labyrinthe.Labyrinth;

public class DepthFirstSearch {
    public static boolean found = false;
    public static void searchDeep(GraphNode<String> current) {
        if (DepthFirstSearch.found) {
            return;
        }

        if (current.getSpecial() == GraphNode.EXIT) {
            current.setVisite(true);
            if (current.getButton() != null) {
                current.getButton().setBackground(Color.YELLOW);
            }
            DepthFirstSearch.found = true;
            System.out.println("Found exit");
            DepthFirstSearch.trace_path(current);
            return;
        }

        current.setVisite(true);
        if (current.getButton() != null) {
            current.getButton().setBackground(Color.YELLOW);
        }
        
        for (GraphNode<String> voisin : current.getVoisins()) {
            if (voisin != null && !voisin.isWall() && !voisin.isVisite()) {
                voisin.setParent(current);
                DepthFirstSearch.searchDeep(voisin);
            }
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
        DepthFirstSearch.searchDeep(test.getStart());
    }
}
