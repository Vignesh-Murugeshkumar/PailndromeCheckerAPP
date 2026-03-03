/**
 * =========================================================
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 13: Performance Comparison
 *
 * Description:
 * This class measures and compares the execution
 * performance of palindrome validation algorithms.
 *
 * It:
 * - Uses different palindrome strategies
 * - Captures execution start and end time
 * - Calculates total execution duration
 * - Displays benchmarking results
 *
 * @author Vicky
 * @version 13.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Input given directly in code
        String input = "level";

        System.out.println("Input : " + input);

        // Strategy 1: Two Pointer Approach
        long start1 = System.nanoTime();
        boolean result1 = twoPointerCheck(input);
        long end1 = System.nanoTime();

        long duration1 = end1 - start1;

        // Strategy 2: Stack Approach
        long start2 = System.nanoTime();
        boolean result2 = stackCheck(input);
        long end2 = System.nanoTime();

        long duration2 = end2 - start2;

        System.out.println("Two Pointer Result : " + result1);
        System.out.println("Two Pointer Time   : " + duration1 + " ns");

        System.out.println("Stack Result       : " + result2);
        System.out.println("Stack Time         : " + duration2 + " ns");
    }

    // Two-pointer palindrome check
    private static boolean twoPointerCheck(String input) {

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

    // Stack-based palindrome check
    private static boolean stackCheck(String input) {

        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}