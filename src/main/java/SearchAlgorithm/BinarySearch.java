package SearchAlgorithm;

/**This class is for testing basic algorithms
 * @author Zeyong Liu
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] array = { 10, 13, 19, 20, 24, 26, 30, 34, 35 };
        int from = 0, to = array.length - 1;

        int indexOf10 = binarySearch(array, 19, from, to); // 0
        System.out.println(indexOf10);
    }

    public static int binarySearch(int[] array, int elem, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2; // the index of the middle element

            if (elem == array[mid]) {
                return mid; // the element is found, return its index
            } else if (elem < array[mid]) {
                right = mid - 1; // go to the left subarray
            } else {
                left = mid + 1;  // go the the right subarray
            }
        }
        return -1; // the element is not found
    }
}
