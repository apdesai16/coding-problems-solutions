// Explanation:
// 1.  Null Check: Ensure that neither of the arrays is null.
// 2.  Length Check: If the lengths of the arrays are different, they cannot be equal.
// 3.  Element Comparison: Iterate through each element of the arrays and compare them. If any pair of corresponding elements is not equal, return false.
// 4.  Return Result: If all elements are equal, return true.
// 5.  The main method demonstrates the usage of the areArraysEqual function with two example arrays (arr1 and arr2). The result of the equality check is then printed to the console.
// This method ensures that the arrays are considered equal if they have the same length and contain the same elements in the same order. If the arrays contain objects or nested arrays, you might need a deeper equality check, but for primitive types or simple objects, this approach works well.

public class ArrayEquality {

    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        // Check if both arrays are not null
        if (arr1 == null || arr2 == null) {
            return false;
        }

        // Check if both arrays have the same length
        if (arr1.length != arr2.length) {
            return false;
        }

        // Check each element for equality
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        // If all elements are equal, return true
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {1, 2, 3, 4, 5, 6};

        // Check equality of arr1 and arr2
        boolean isEqual1 = areArraysEqual(arr1, arr2);
        System.out.println("arr1 and arr2 are equal: " + isEqual1);

        // Check equality of arr1 and arr3
        boolean isEqual2 = areArraysEqual(arr1, arr3);
        System.out.println("arr1 and arr3 are equal: " + isEqual2);
    }
}