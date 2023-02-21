package Algos;

import java.util.Random;

import Labyrinthe.LinkedList;
import Labyrinthe.Node;


public class QuickSort {

    // 1. methode et besoins
    public static LinkedList<Integer> sort(LinkedList<Integer> data) {
        // 2. Condition de sortie
        if (data.size <= 1) {
            return data;
        }

        // 3. Manipulations
        Node<Integer> pivot = data.end();

        LinkedList<Integer> petits = new LinkedList<>();
        LinkedList<Integer> grands = new LinkedList<>();

        grands.add(pivot.getValue());
        Node<Integer> current = data.begin();
        // condition por ne pas ajouter le pivot, il a deja ete placer.
        while (current.getNext() != null) {
            if (current.getValue() <= pivot.getValue()) {
                petits.add(current.getValue());
            } else {
                grands.add(current.getValue());
            }
            
            current = current.getNext();
        }

        // 4. Appels de recursions
        LinkedList<Integer> gauche = sort(petits);
        LinkedList<Integer> droite = sort(grands);

        return gauche.extend(droite);
    }

    public static LinkedList<Integer> test(LinkedList<Integer> control) {
        long startTime = System.currentTimeMillis();

        LinkedList<Integer> test = QuickSort.sort(control);

        long endTime = System.currentTimeMillis();

        System.out.println("Sorting executer en " + (endTime - startTime) + "ms");
        return test;
    }

    public static void main(String[] args) {
        LinkedList<Integer> toSort = new LinkedList<>();
        int nb_elements = 30000;
        for (int i = 0; i < nb_elements; i++) {
            int valeur = new Random().nextInt(100);
            toSort.add(valeur);
        }

        System.out.println("Unsorted" + toSort.slice(10));

        toSort = QuickSort.test(toSort);

        System.out.println("Sorted" + toSort.slice(10));
    }
}
