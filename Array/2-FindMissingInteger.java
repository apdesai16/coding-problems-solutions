// Explanation:
// 1.  Calculate Expected Sum: Use the formula (n * (n + 1)) / 2 to calculate the expected sum of the series from 1 to 10.
// 2.  Calculate Actual Sum: Sum all the elements in the given array.
// 3.  Find Missing Number: The missing number is the difference between the expected and actual sums.
// 4.  Print Result: Print the missing number.
// This approach works because the sum of an arithmetic series is well-defined, and the difference between the expected and actual sums corresponds to the missing number. It has a time complexity of O(n), where n is the size of the array.

public class FindMissingInteger {

    public static int findMissingNumber(int[] array) {
        // Calculate the expected sum of the series from 1 to 100
        int expectedSum = (10 * (10 + 1)) / 2;

        // Calculate the actual sum of the elements in the array
        int actualSum = 0;
        for (int num: array) {
            actualSum += num;
        }

        // The missing number is the difference between the expected and actual sums
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        // Example array with one missing integer
        int[] arrayWithMissingNumber = {
            1,
            2,
            3,
            4,
            5,
            6,
            7,
            8,
            0,
            10
        };

        // Find the missing integer
        int missingNumber = findMissingNumber(arrayWithMissingNumber);

        // Print the missing number
        System.out.println("Missing Number: " + missingNumber);
    }
}