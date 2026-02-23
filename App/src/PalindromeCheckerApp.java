/**
 * ================================================================
 * MAIN CLASS-UC2: UseCAse2PalindromeCheckerApp
 * ===============================================================
 *
 * UC2: Print a Hardcoded Palindrome Result
 *
 * Description:
 * This class demonstrate basic palindrome validation
 * using hardcoded string value
 *
 * at this stage , the application :
 * -stores a predefined string
 * -compares character from both ends
 * displays the result to console
 *
 * @author Vicky
 * @version 2.0
 */



public class PalindromeCheckerApp {
    public static void main(String[] args) {

        String input = "madam";
        System.out.println("Input text: " + input);

        boolean isPalindrome = true;

        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is it Palindrome? : " + isPalindrome);
    }
}