/**
 * ============================================================
 * MAIN CLASS -Palindrome Check Using String Reverse
 * ===========================================================
 * use case 3- Reverse string based palindrome
 *
 * Description:
 * this class checks eheter a string is palindrome by reverse string based
 * the reverse dstring is checked with the original one
 * At this stage , the application
 *the application usesa a imple backward string matching and checks with the original string and validates it
 *
 * @author Vicky
 * @version 3.0
 */
public class PalindromeCheckerApp {
    public static void main(String[] args){
        String input="madam";
        String reversed="";
        for(int i=input.length()-1;i>=0;i--){
            reversed +=input.charAt(i);
        }
        if(reversed.equals(input)){
            System.out.println("it is palindrome ");

        }
        else{
            System.out.println("it is not palindrome");
        }

    }
}
