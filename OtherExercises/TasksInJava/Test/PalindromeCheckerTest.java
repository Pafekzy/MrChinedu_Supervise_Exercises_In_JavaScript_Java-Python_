import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class PalindromeCheckerTest {

    @Test
    public void testPalindromeWithNormalString() {
        assertTrue(PalindromeChecker.isPalindrome("racecar"), "The string 'racecar' should be a palindrome.");
    }

    @Test
    public void testPalindromeWithMixedCase() {
        assertTrue(PalindromeChecker.isPalindrome("RaceCar"), "The string 'RaceCar' should be a palindrome, case insensitive.");
    }

    @Test
    public void testPalindromeWithSpaces() {
        assertTrue(PalindromeChecker.isPalindrome("A man a plan a canal Panama"), "The string 'A man a plan a canal Panama' should be a palindrome, ignoring spaces.");
    }

    @Test
    public void testPalindromeWithSpecialCharacters() {
        assertTrue(PalindromeChecker.isPalindrome("Madam, in Eden I'm Adam!"), "The string 'Madam, in Eden I'm Adam!' should be a palindrome, ignoring special characters.");
    }

    @Test
    public void testNonPalindromeString() {
        assertFalse(PalindromeChecker.isPalindrome("hello"), "The string 'hello' should not be a palindrome.");
    }

    @Test
    public void testEmptyString() {
        assertTrue(PalindromeChecker.isPalindrome(""), "The empty string should be considered a palindrome.");
    }

    @Test
    public void testSingleCharacterString() {
        assertTrue(PalindromeChecker.isPalindrome("a"), "The single character 'a' should be a palindrome.");
    }
}
