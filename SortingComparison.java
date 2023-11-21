/*

Result
 
Array size: 100
Insertion Sort Time: 0.0
Arrays.sort() Time: 0.001
InsertionSort is faster!


Array size: 1000
Insertion Sort Time: 0.004
Arrays.sort() Time: 0.0
ArraysSort is faster!


Array size: 10000
Insertion Sort Time: 0.015
Arrays.sort() Time: 0.006
ArraysSort is faster!


 */
import java.util.Arrays;

public class SortingComparison {

    public static void main(String[] args) {
        Compare(100);
        Compare(1000);
        Compare(10000);
    }

    // Insertion Sort implementation
    private static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
    // Compare insertionSort and Arrays.sort
    private static void Compare(int size) {
       int ArraySize = size;
        int[] array1 = new int[ArraySize];
        int[] array2 = new int[ArraySize];
        
        for (int i = 0; i < ArraySize; i++) {
            array1[i] = (int) (Integer.MAX_VALUE * Math.random());
            array2[i] = array1[i];
        }

        // Time and print the duration for Insertion Sort
        long startTimeInsertionSort = System.currentTimeMillis();
        insertionSort(array1);
        long endTimeInsertionSort = System.currentTimeMillis();
        long durationInsertionSort = endTimeInsertionSort - startTimeInsertionSort;

        System.out.println("Array size: " + ArraySize);
        System.out.println("Insertion Sort Time: " + durationInsertionSort/1000.0);

        // Time and print the duration for Arrays.sort()
        long startTimeArraysSort = System.currentTimeMillis();
        Arrays.sort(array2);
        long endTimeArraysSort = System.currentTimeMillis();
        long durationArraysSort = endTimeArraysSort - startTimeArraysSort;

        System.out.println("Arrays.sort() Time: " + durationArraysSort/1000.0);

        if (durationInsertionSort > durationArraysSort){
            System.out.println("ArraysSort is faster!");
        }else{
            System.out.println("InsertionSort is faster!");
        }
        System.out.println("\n");

    }
}
