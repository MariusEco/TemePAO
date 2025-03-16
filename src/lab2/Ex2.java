package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {
    public static void bSort(int[] array) {
        int n = array.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length, n2 = arr2.length;
        int[] mergedArray = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }
        while (i < n1) {
            mergedArray[k++] = arr1[i++];
        }
        while (j < n2) {
            mergedArray[k++] = arr2[j++];
        }
        return mergedArray;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array1[] = {1,7,4,3,9,1}, array2[] = {6,4,2,8};
        bSort(array1);
        bSort(array2);
        System.out.println("Array1 sortat: " + Arrays.toString(array1));
        System.out.println("Array2 sortat: " + Arrays.toString(array2));
        int[] mergedArray = mergeSortedArrays(array1, array2);
        System.out.println(Arrays.toString(mergedArray));
        scanner.close();
    }
}