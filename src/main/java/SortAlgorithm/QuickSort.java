package SortAlgorithm;

import java.util.*;

public class QuickSort {

    public static void main(String[] args) {
        int[] array = { 7, 2, 1, 4, 6, 8, 5, 3, 4};
        quicksort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public static void quicksort(int[] array, int start, int end) {
        if (start < end) {
            int pIndex = partition(array, start, end);
            quicksort(array, start, pIndex - 1);
            quicksort(array, pIndex + 1, end);
        }
    }

    public static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int pIndex = start;

        for (int i = start; i < end; i++) {
            if (array[i] <= pivot) {
                int cache = array[i];
                array[i] = array[pIndex];
                array[pIndex] = cache;
                pIndex++;
            }
        }
        int pIndexCache = array[pIndex];
        array[pIndex] = array[end];
        array[end] = pIndexCache;

        return pIndex;
    }
}
