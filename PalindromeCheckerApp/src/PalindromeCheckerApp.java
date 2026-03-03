/**
 * =========================================================
 * MAIN CLASS - UseCase11PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 11: Object-Oriented Palindrome Service
 *
 * Description:
 * This class demonstrates palindrome validation using
 * object-oriented design.
 *
 * The palindrome logic is encapsulated inside a
 * PalindromeService class.
 *
 * This improves:
 * - Reusability
 * - Readability
 * - Separation of concerns
 *
 * @author vicky
 * @version 11.0
 */

import java.util.Scanner;

public class PalindromeCheckerApp {    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scanner.nextLine();
        PalindromeService service = new PalindromeService();
        boolean result = service.checkPalindrome(input);
        System.out.println("Is Palindrome? : " + result);
        scanner.close();
    }
}
class PalindromeService {
    public boolean checkPalindrome(String input) {
        int start = 0;
        int end = input.length() - 1;
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}