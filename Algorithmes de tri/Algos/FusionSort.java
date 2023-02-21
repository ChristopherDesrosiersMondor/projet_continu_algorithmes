package Algos;

import java.util.Random;

import Labyrinthe.ArrayList;


public class FusionSort {

    // Unsorted array
    // deux arrays moitie moitie
    // mergesort sur les deux arrays
    // merge au plus bas de la recursion entre les deux arrays left right dans la liste precedente
    public static void fusionSort(ArrayList<Integer> liste, int left, int right) {
        if (liste.size() == 1) {
            return;
        }

        int midPoint = (liste.size() - 1) / 2;

        ArrayList<Integer> leftListe = new ArrayList<>(liste.slice(left, midPoint));
        ArrayList<Integer> rightListe = new ArrayList<>(liste.slice(midPoint + 1, right));
        
        fusionSort(leftListe, 0, leftListe.size() -1);
        fusionSort(rightListe, 0, rightListe.size() -1);

        fusion(liste, leftListe, rightListe);
    }

    private static void fusion(ArrayList<Integer> liste, ArrayList<Integer> leftListe, ArrayList<Integer> rightListe) {
        int llIndex = 0;
        int rlIndex = 0;
        int listeIndex = 0;

        while (llIndex < leftListe.size() && rlIndex < rightListe.size()) {
            if (leftListe.get(llIndex) < rightListe.get(rlIndex)) {
                liste.set(listeIndex, leftListe.get(llIndex));
                llIndex += 1;
            }
            else {
                liste.set(listeIndex, rightListe.get(rlIndex));
                rlIndex += 1;
            }
            listeIndex += 1;
        }

        // si y reste des trucs dans une des deux listes on les ajoute a la fin
        while (llIndex < leftListe.size()) {
            liste.set(listeIndex, leftListe.get(llIndex));
            llIndex += 1;
            listeIndex += 1;
        }

        while (rlIndex < rightListe.size()) {
            liste.set(listeIndex, rightListe.get(rlIndex));
            rlIndex += 1;
            listeIndex += 1;
        }
    }

    public static void test(ArrayList<Integer> liste) {
        long startTime = System.currentTimeMillis();

        FusionSort.fusionSort(liste, 0, liste.size() - 1);;

        long endTime = System.currentTimeMillis();

        System.out.println("Sorting executer en " + (endTime - startTime) + "ms");
    }

    public static void main(String[] args) {
        ArrayList<Integer> toSort = new ArrayList<>(15);
        int nb_elements = 30000;
        for (int i = 0; i < nb_elements; i++) {
            toSort.add(new Random().nextInt(100));
        }
        toSort = new ArrayList<>(toSort);

        System.out.println("Unsorted" + toSort.slice(0, 20));

        FusionSort.test(toSort);

        System.out.println("Sorted" + toSort.slice(0, 20));
    }
}
