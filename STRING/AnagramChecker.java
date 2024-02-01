import java.util.Arrays;

// Sort both strings.
// If the sorted strings are equal, the original strings are anagrams.

public class AnagramChecker {

    public static boolean areAnagrams(String str1, String str2) {
        // Convert strings to char arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted char arrays
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        // Check if the strings are anagrams
        boolean result = areAnagrams(str1, str2);

        // Print the result
        System.out.println("Are '" + str1 + "' and '" + str2 + "' anagrams? " + result);
    }
}
