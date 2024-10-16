import java.util.Scanner;

public class PalindromeApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PalindromeChecker checker = new PalindromeChecker();
        boolean continueChecking = true;
        
        System.out.println("Welcome to Joseph's MultiPalindrome Checker");
        
        while (continueChecking) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> checker.checkStrictPalindromeNumber(scanner);
                case 2 -> checker.checkStrictPalindromeWord(scanner);
                case 3 -> checker.checkUnstrictPalindromeNumber(scanner);
                case 4 -> checker.checkUnstrictPalindromeWord(scanner);
                case 0 -> {
                    System.out.println("Exiting the application. Thank you for using MultiPalindrome Checker!");
                    continueChecking = false;
                }
                default -> System.out.println("Invalid choice. Please select a valid option.");
            }
        }
        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("\nSelect a palindrome type to check:");
        System.out.println("1. Strict Palindrome Numbers");
        System.out.println("2. Strict Palindrome Words");
        System.out.println("3. Unstrict Palindrome Numbers");
        System.out.println("4. Unstrict Palindrome Words");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }
}
