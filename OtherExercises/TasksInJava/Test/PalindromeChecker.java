public class PalindromeChecker {
    public static boolean isPalindrome(String inputString) {
        String cleanedString = inputString.toLowerCase();
        StringBuilder sanitizedString = new StringBuilder();
        for (char character : cleanedString.toCharArray()) {
            if (Character.isLetterOrDigit(character)) {
                sanitizedString.append(character);
            }
        }
        String finalString = sanitizedString.toString();
        int stringLength = finalString.length();
        for (int startIndex = 0, endIndex = stringLength - 1; startIndex < endIndex; startIndex++, endIndex--) {
            if (finalString.charAt(startIndex) != finalString.charAt(endIndex)) {
                return false;
            }
        }
        return true;
    }
}
