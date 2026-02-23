import java.util.Stack;

/**
 * ============================================================
 * MAIN CLASS -UC5: Stack-Based Palindrome Checker
 * ===========================================================
 *
 * UC5: Stack-Based Palindrome Checker
 *
 * Description:
 * this class converts the string to array and checks from the elements  from start character with ending char at the same time
 *first it push the string to stack
 * then it pops the value and checks whether the string is palindrome or not
 * @author Vicky
 * @version 5.0
 */
public class PalindromeCheckerApp {
    public static void main(String[] args){

        String input = "noon";
        System.out.println("Input: " + input);
        boolean isPalindrome = true;
        Stack<Character> stack= new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);}
        for(char c: input.toCharArray()){
            if(c!= stack.pop()){
                isPalindrome=false;
                break;

            }

        }

        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
