public class HelperMethods {

    // Method to check if input is numeric
    public static boolean isNumeric(String input) {
        return input.matches("\\d+");
    }

    // Method to check for strict palindrome (exact reverse match)
    public static boolean isStrictPalindrome(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }

    // Method to check for unstrict palindrome (ignoring case, spaces, punctuation)
    public static boolean isUnstrictPalindrome(String input) {
        String cleanedInput = cleanInput(input);
        return isStrictPalindrome(cleanedInput);
    }

    // Method to clean input by removing spaces, punctuation, and normalizing case
    public static String cleanInput(String input) {
        return input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }
}
