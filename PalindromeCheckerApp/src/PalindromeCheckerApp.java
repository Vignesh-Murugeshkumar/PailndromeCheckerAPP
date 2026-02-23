/**
 * ============================================================
 * MAIN CLASS -UC4: Character Array Based Palindrome Check
 * ===========================================================
 *
 * UC4: Character Array Based Palindrome Check
 *
 * Description:
 * this class converts the string to array and checks from the elements  from start character with ending char at the same time
 *
 * @author Vicky
 * @version 4.0
 */
public class PalindromeCheckerApp {
    public static void main(String[] args){

        String input = "radar";
        System.out.println("Input: " + input);

        char[] chars = input.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;   // move forward
            end--;     // move backward
        }

        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
