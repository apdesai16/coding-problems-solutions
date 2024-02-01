public class RemoveCharacter {

    // public static String removeSpecificCharacter(String input, char charToRemove) {
    //     StringBuilder result = new StringBuilder();

    //     for (char currentChar : input.toCharArray()) {
    //         if (currentChar != charToRemove) {
    //             result.append(currentChar);
    //         }
    //     }

    //     return result.toString();
    // }

    public static String removeSpecificCharacter(String input, char charToRemove) {
        // Use replace() to remove all occurrences of the specified character
        String result = input.replace(String.valueOf(charToRemove), "");

        return result;
    }

    public static String removeFirstOccurrence(String input, char charToRemove) {
        // Use replaceFirst() to remove the first occurrence of the specified character
        String result = input.replaceFirst(String.valueOf(charToRemove), "");

        return result;
    }

    public static void main(String[] args) {
        String originalString = "Hello, World!";
        char charToRemove = 'o';

        // Remove the specified character and print the result
        String stringWithoutChar = removeSpecificCharacter(originalString, charToRemove);
        System.out.println("Original: " + originalString);
        System.out.println("String without '" + charToRemove + "': " + stringWithoutChar);
    }
}
