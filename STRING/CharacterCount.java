// The countOccurrences method takes a string (input) and a target character (targetChar) as parameters.
// It initializes a counter (count) to zero.
// It uses a loop to iterate through each character in the input string.
// Inside the loop, it checks if the current character is equal to the target character, and if so, increments the counter.
// The final count is returned.

public class CharacterCount {

    public static int countOccurrences(String input, char targetChar) {
        int count = 0;

        // Iterate through each character in the string
        for (char currentChar : input.toCharArray()) {
            // Check if the current character matches the target character
            if (currentChar == targetChar) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String inputString = "Hello, World!";
        char targetCharacter = 'o';

        // Count the occurrences of the target character and print the result
        int occurrences = countOccurrences(inputString, targetCharacter);
        System.out.println("Number of occurrences of '" + targetCharacter + "': " + occurrences);
    }
}
