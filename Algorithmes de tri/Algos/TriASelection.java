package Algos;

public class TriASelection {
    public static void main(String[] args) {
        int[] intArray = { 16, -5, 32, 7, 1, -22, 5 };
        intArray = triASelection(intArray);
        
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
    
    public static int[] triASelection(int[] intArray) {
        for (int dernierChiffreNonTrier = intArray.length - 1; dernierChiffreNonTrier > 0; dernierChiffreNonTrier--) {
            int plusGrandChiffre = 0;
            for (int i = 1; i < dernierChiffreNonTrier; i++) {
                if (intArray[i] > intArray[plusGrandChiffre]) {
                    plusGrandChiffre = i;
                }
            }
            echangerPosition(intArray, plusGrandChiffre, dernierChiffreNonTrier);
        }
        return intArray;
    }
    
    public static void echangerPosition(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}