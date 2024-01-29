// Explanation:
// 1.  Initialize three pointers i, j, and k to traverse arr1, arr2, and mergedArray, respectively.
// 2.  Use a while loop to compare elements from both arrays (arr1 and arr2) and populate the mergedArray in sorted order.
// 3.  Continue the loop until one of the arrays is exhausted.
// 4.  After the loop, copy any remaining elements from both arrays to the mergedArray if there are any.
// 5.  The resulting mergedArray contains all elements from arr1 and arr2 in sorted order.
// 6.  The main method demonstrates the usage of the mergeArrays function with two example arrays (arr1 and arr2). The merged array is then printed to the console.
// This approach ensures that the merged array is sorted without the need for additional sorting algorithms.

public class MergeSortedArrays {

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length; // Length of the first array
        int n2 = arr2.length; // Length of the second array

        int[] mergedArray = new int[n1 + n2]; // Resulting merged array

        int i = 0, j = 0, k = 0; // Pointers for arr1, arr2, and mergedArray

        // Traverse both arrays until one of them is exhausted
        while (i < n1 && j < n2) {
            // Compare elements from both arrays
            if (arr1[i] <= arr2[j]) {
                // If the element in arr1 is smaller or equal, add it to the merged array
                mergedArray[k] = arr1[i];
                i++; // Move the pointer in arr1
            } else {
                // If the element in arr2 is smaller, add it to the merged array
                mergedArray[k] = arr2[j];
                j++; // Move the pointer in arr2
            }
            k++; // Move the pointer in the mergedArray
        }

        // Copy any remaining elements from arr1 (if any)
        while (i < n1) {
            mergedArray[k] = arr1[i];
            i++;
            k++;
        }

        // Copy any remaining elements from arr2 (if any)
        while (j < n2) {
            mergedArray[k] = arr2[j];
            j++;
            k++;
        }

        return mergedArray;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8, 10};

        int[] mergedArray = mergeArrays(arr1, arr2);

        // Print the merged array
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }
}