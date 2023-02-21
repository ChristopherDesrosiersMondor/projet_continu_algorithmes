package Algos;

public class TriABulles {
    public static void main(String[] args) {

        int[] intArray = { 16, -5, 32, 7, 1, -22, 5 };
        intArray = triABulle(intArray);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
    
    public static int[] triABulle(int[] intArray) {
        for (int dernierChiffreNonTrier = intArray.length - 1; dernierChiffreNonTrier > 0; dernierChiffreNonTrier--) {
            for (int i = 0; i < dernierChiffreNonTrier; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    echangerPosition(intArray, i, i + 1);
                }
            }
        }
        return intArray;
    }
    
    public static void echangerPosition(int[] array, int i, int j) {
        if(i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}