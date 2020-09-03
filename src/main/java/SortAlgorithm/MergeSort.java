package SortAlgorithm;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int s = Integer.MAX_VALUE;
        int[] array1 = { 30, 221, 253, 193, 28, 1341, 2334 };
        mergeSort(array1, 0);
        System.out.println(Arrays.toString(array1));
    }

    public static void mergeSort(int[] array, int startIndex) {
        int arrayLength = array.length;

        if (arrayLength <= 1) {
            return;
        }

        int middle = (startIndex + (arrayLength - startIndex)) / 2;
        int[] left = new int[middle];
        int[] right = new int[arrayLength - middle];

        for (int i = 0; i < middle; i++) {
            left[i] = array[i];
        }

        for (int j = middle; j < arrayLength; j++) {
            right[j - middle] = array[j];
        }

        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));

        mergeSort(left, 0);
        mergeSort(right, middle);
        merge(left, right, array);
    }

    public static void merge(int[] left, int[] right, int[] array) {
        int leftLength = left.length;
        int rightLength = right.length;

        int l = 0;
        int r = 0;
        int k = 0;

        while (l < leftLength && r < rightLength) {
            if (left[l] <= right[r]) {
                array[k] = left[l];
                l++;
            } else {
                array[k] = right[r];
                r++;
            }
            k++;
        }

        for (; l < leftLength; l++) {
            array[k] = left[l];
            k++;
        }

        for (; r < rightLength; r++) {
            array[k] = right[r];
            k++;
        }
    }
}
