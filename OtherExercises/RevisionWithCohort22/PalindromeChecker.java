import java.util.Scanner;

public class PalindromeChecker {

    // Strict Palindrome Number Check
    public void checkStrictPalindromeNumber(Scanner scanner) {
        System.out.print("Enter a number to check for strict palindrome: ");
        String input = scanner.nextLine();
        if (HelperMethods.isNumeric(input)) {
            if (HelperMethods.isStrictPalindrome(input)) {
                System.out.println(input + " is a strict palindrome.");
            } else {
                System.out.println(input + " is not a strict palindrome.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid numeric value.");
        }
    }

    // Strict Palindrome Word Check
    public void checkStrictPalindromeWord(Scanner scanner) {
        System.out.print("Enter a word or phrase to check for strict palindrome: ");
        String input = scanner.nextLine();
        if (HelperMethods.isStrictPalindrome(input)) {
            System.out.println("\"" + input + "\" is a strict palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a strict palindrome.");
        }
    }

    // Unstrict Palindrome Number Check
    public void checkUnstrictPalindromeNumber(Scanner scanner) {
        System.out.print("Enter a number to check for unstrict palindrome (ignoring case, spaces, and punctuation): ");
        String input = scanner.nextLine();
        if (HelperMethods.isNumeric(input)) {
            if (HelperMethods.isUnstrictPalindrome(input)) {
                System.out.println(input + " is an unstrict palindrome.");
            } else {
                System.out.println(input + " is not an unstrict palindrome.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid numeric value.");
        }
    }

    // Unstrict Palindrome Word Check
    public void checkUnstrictPalindromeWord(Scanner scanner) {
        System.out.print("Enter a word or phrase to check for unstrict palindrome (ignoring case, spaces, and punctuation): ");
        String input = scanner.nextLine();
        if (HelperMethods.isUnstrictPalindrome(input)) {
            System.out.println("\"" + input + "\" is an unstrict palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not an unstrict palindrome.");
        }
    }
}
