import java.util.Arrays;

// Explanation:
// 1.  Count Occurrences: Count the number of occurrences of the element to be removed in the original array.
// 2.  Create New Array: Create a new array with a size equal to the original size minus the count of occurrences of the element to be removed.
// 3.  Copy Elements: Copy elements from the original array to the new array, excluding the elements to be removed.
// 4.  Return Result: Return the new array without the specified element.
// 5.  The main method demonstrates the usage of the removeElement function with an example array (originalArray). The result after removing a specific element is then printed to the console.

public class RemoveElementFromArray {

    public static int[] removeElement(int[] array, int elementToRemove) {
        // Check if the array is null or empty
        if (array == null || array.length == 0) {
            return array;
        }

        // Count occurrences of the element to remove
        int count = 0;
        for (int value: array) {
            if (value == elementToRemove) {
                count++;
            }
        }

        // If the element is not present, return the original array
        if (count == 0) {
            return array;
        }

        // Create a new array with size = original size - count
        int[] newArray = new int[array.length - count];
        int newArrayIndex = 0;

        // Copy elements to the new array, excluding the ones to be removed
        for (int value: array) {
            if (value != elementToRemove) {
                newArray[newArrayIndex++] = value;
            }
        }

        return newArray;
    }

    public static void main(String[] args) {
        int[] originalArray = {
            1,
            2,
            3,
            4,
            3,
            5
        };

        int elementToRemove = 3;

        int[] newArray = removeElement(originalArray, elementToRemove);

        // Print the original and modified arrays
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Array after removing " + elementToRemove + ": " + Arrays.toString(newArray));
    }
}