package Algorithms.Searching;

public class BinarySearch {
    public static int binarySearch(int array[], int x, int low, int high) {
        //Must be used only on sorted int arrays.
        //In this approach, the element is always searched in the middle of a portion of an array.
        // Binary search can be implemented only on a sorted list of items.

        // Repeat until the pointers low and high meet each other
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (x == array[mid])
                return mid;

            if (x > array[mid])
                low = mid + 1;

            else
                high = mid - 1;
        }

        return -1;
    }

}
