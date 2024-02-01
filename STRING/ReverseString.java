public class ReverseString {

    public static String reverseWithStringBuilder(String input) {
        // Use StringBuilder to efficiently reverse the string
        return new StringBuilder(input).reverse().toString();
    }

    public static String reverseWithLoop(String input) {
        char[] characters = input.toCharArray();
        int left = 0;
        int right = characters.length - 1;

        // Swap characters from both ends towards the center
        while (left < right) {
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;

            left++;
            right--;
        }

        return new String(characters);
    }

    public static void main(String[] args) {
        String original = "Hello, World!";
        
        // Reverse the string using StringBuilder and print the result
        String reversed = reverseWithStringBuilder(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}
