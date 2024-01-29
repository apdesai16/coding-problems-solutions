// Explanation:
// 1.  Initialize two counters, openCount and closeCount, to keep track of the number of open and close parentheses.
// 2.  Iterate through each character in the array:
// 3.  If the character is an open parenthesis '(', increment openCount.
// 4.  If the character is a close parenthesis ')', increment closeCount.
// 5.  If closeCount becomes greater than openCount at any point, the parentheses are unbalanced.
// 6.  After iterating through the array, check if the number of open and close parentheses is the same. If they are equal, the parentheses are balanced.
// 7.  The main method demonstrates the usage of the isBalanced function with examples of a balanced and an unbalanced array.
// This algorithm ensures constant space usage as it only requires two integer variables to keep track of the counts. The time complexity is O(n), where n is the size of the array.

public class BalancedParenthesis {
    public static boolean isBalanced(char[] parentheses) {
        int openCount = 0;
        int closeCount = 0;

        for (char parenthesis: parentheses) {
            if (parenthesis == '(') {
                openCount++;
            } else if (parenthesis == ')') {
                closeCount++;

                // If closeCount exceeds openCount, unbalanced parentheses
                if (closeCount > openCount) {
                    return false;
                }
            }
        }

        // Check if the number of open and close parentheses is the same
        return openCount == closeCount;
    }

    public static void main(String[] args) {
        char[] balancedArray = {
            '(',
            '(',
            ')',
            ')',
            '(',
            ')'
        };
        char[] unbalancedArray = {
            '(',
            ')',
            ')',
            '('
        };

        System.out.println("Balanced Array: " + isBalanced(balancedArray));
        System.out.println("Unbalanced Array: " + isBalanced(unbalancedArray));
    }
}