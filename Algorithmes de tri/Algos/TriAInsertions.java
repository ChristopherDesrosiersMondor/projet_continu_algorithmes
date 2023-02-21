package Algos;

public class TriAInsertions {
    public static void main(String[] args) {
        int[] intArray = { 16, -5, 32, 7, 1, -22, 5 };
        intArray = triAInsertion(intArray);
        
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }

    public static int[] triAInsertion(int[] intArray) {
        for (int premierIndexNonTrier = 1; premierIndexNonTrier < intArray.length; premierIndexNonTrier++) {
            int chiffreComparer = intArray[premierIndexNonTrier];
            int i;
            for (i = premierIndexNonTrier; i > 0 && intArray[i - 1] > chiffreComparer; i--) {
                intArray[i] = intArray[i - 1];
            }

            intArray[i] = chiffreComparer;
        }
        return intArray;
    }
}