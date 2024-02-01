public class PalindromeChecker {

    public static boolean isPalindrome(String input) {
        // Remove non-alphanumeric characters and convert to lowercase
        String cleanInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Compare the original and reversed strings
        return cleanInput.equals(new StringBuilder(cleanInput).reverse().toString());
    }

    public static void main(String[] args) {
        String palindromeString = "A man, a plan, a canal, Panama";
        String nonPalindromeString = "Hello, World!";

        // Check if the strings are palindromes and print the results
        boolean result1 = isPalindrome(palindromeString);
        boolean result2 = isPalindrome(nonPalindromeString);

        System.out.println("'" + palindromeString + "' is a palindrome: " + result1);
        System.out.println("'" + nonPalindromeString + "' is a palindrome: " + result2);
    }
}
