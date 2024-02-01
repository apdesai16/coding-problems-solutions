// Explanation:

// printPermutations Method:
// This is the public method that initializes the recursive process.

// printPermutationsHelper Method:
// The recursive helper method generates permutations by swapping characters.
// It prints the current permutation when the start index reaches the end of the string.

// swap Method:
// A helper method to swap characters in the array.


public class StringPermutations {

    public static void printPermutations(String str) {
        printPermutationsHelper(str.toCharArray(), 0, str.length() - 1);
    }

    private static void printPermutationsHelper(char[] chars, int start, int end) {
        if (start == end) {
            System.out.println(new String(chars));
        } else {
            for (int i = start; i <= end; i++) {
                swap(chars, start, i);
                printPermutationsHelper(chars, start + 1, end);
                swap(chars, start, i); // Backtrack to restore the original order
            }
        }
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public static void main(String[] args) {
        String input = "abc";
        System.out.println("All Permutations of " + input + ":");
        printPermutations(input);
    }
}
