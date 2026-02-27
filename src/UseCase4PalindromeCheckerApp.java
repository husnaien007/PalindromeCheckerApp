public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {

        // Declare and initialize the input string.
        String input = "radar";

        // Convert the string into a character array.
        char[] chars = input.toCharArray();

        // Initialize pointer at the beginning.
        int start = 0;

        // Initialize pointer at the end.
        int end = chars.length - 1;

        // Assume palindrome initially.
        boolean isPalindrome = true;

        // Continue comparison until pointers cross.
        while (start < end) {

            // Compare characters at start and end.
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }

            // Move pointers inward.
            start++;
            end--;
        }

        // Display output
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome ? : " + isPalindrome);
    }
}