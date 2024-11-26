package Algorithms.Sorting;

public class QuickSort {
   /* QuickSort is a sorting algorithm based on the Divide and Conquer that picks an element as a pivot and partitions
    the given array around the picked pivot by placing the pivot in its correct position in the sorted array.
    Quick Sort is a crucial algorithm in the industry, but there are other sorting algorithms that may be more
     optimal in different cases. To gain a deeper understanding of sorting and other essential algorithms,
      check out our course Tech Interview 101 – From DSA to System Design . This course covers almost every
      standard algorithm and more.
      Advantages of Quick Sort:
It is a divide-and-conquer algorithm that makes it easier to solve problems.
It is efficient on large data sets.
It has a low overhead, as it only requires a small amount of memory to function.
It is Cache Friendly as we work on the same array to sort and do not copy data to any auxiliary array.
Fastest general purpose algorithm for large data when stability is not required.
It is tail recursive and hence all the tail call optimization can be done.
Disadvantages of Quick Sort:
It has a worst-case time complexity of O(N 2 ), which occurs when the pivot is chosen poorly.
It is not a good choice for small data sets.
It is not a stable sort, meaning that if two elements have the same key, their relative order will not be preserved
 in the sorted output in case of quick sort, because here we are swapping elements according to the pivot’s position
 (without considering their original positions).
Applications of Quick Sort

"The DSA course helped me a lot in clearing the interview rounds. It was really very helpful in setting a strong
 foundation for my problem-solving skills. Really a great investment, the passion Sandeep sir has towards DSA/teaching
  is what made the huge difference." - Gaurav | Placed at Amazon

Before you move on to the world of development, master the fundamentals of DSA on which
 every advanced algorithm is built upon. Choose your preferred language and start learning today:

DSA In JAVA/C++
    */
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // This function takes last element as pivot,
    // places the pivot element at its correct position
    // in sorted array, and places all smaller to left
    // of pivot and all greater elements to right of pivot
    static int partition(int[] arr, int low, int high)
    {
        // Choosing the pivot
        int pivot = arr[high];

        // Index of smaller element and indicates
        // the right position of pivot found so far
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            // If current element is smaller than the pivot
            if (arr[j] < pivot) {

                // Increment index of smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    // The main function that implements QuickSort
    // arr[] --> Array to be sorted,
    // low --> Starting index,
    // high --> Ending index
    public static void quickSort(int[] arr, int low, int high)
    {
        if (low < high) {

            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(arr, low, high);

            // Separately sort elements before
            // partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    // To print sorted array
    public static void printArr(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
