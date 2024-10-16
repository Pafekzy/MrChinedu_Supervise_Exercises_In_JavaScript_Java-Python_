import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeCheckerTest {

    PalindromeChecker palindromeChecker = new PalindromeChecker();

    // Test Cases for Strict Palindrome Number
    @Test
    public void testStrictPalindromeNumber_True() {
        assertTrue(HelperMethods.isStrictPalindrome("121"));
    }

    @Test
    public void testStrictPalindromeNumber_False() {
        assertFalse(HelperMethods.isStrictPalindrome("123"));
    }

    @Test
    public void testStrictPalindromeNumber_SingleDigit() {
        assertTrue(HelperMethods.isStrictPalindrome("5"));
    }

    @Test
    public void testStrictPalindromeNumber_LeadingZeros() {
        assertTrue(HelperMethods.isStrictPalindrome("000"));
    }

    // Test Cases for Strict Palindrome Word
    @Test
    public void testStrictPalindromeWord_True() {
        assertTrue(HelperMethods.isStrictPalindrome("radar"));
    }

    @Test
    public void testStrictPalindromeWord_False() {
        assertFalse(HelperMethods.isStrictPalindrome("hello"));
    }

    @Test
    public void testStrictPalindromeWord_MultipleWords() {
        assertFalse(HelperMethods.isStrictPalindrome("a man a plan a canal panama"));
    }

    @Test
    public void testStrictPalindromeWord_SingleLetter() {
        assertTrue(HelperMethods.isStrictPalindrome("a"));
    }

    // Test Cases for Unstrict Palindrome Number
    @Test
    public void testUnstrictPalindromeNumber_True() {
        assertTrue(HelperMethods.isUnstrictPalindrome("121"));
    }

    @Test
    public void testUnstrictPalindromeNumber_False() {
        assertFalse(HelperMethods.isUnstrictPalindrome("1234"));
    }

    @Test
    public void testUnstrictPalindromeNumber_SingleDigit() {
        assertTrue(HelperMethods.isUnstrictPalindrome("3"));
    }

    // Test Cases for Unstrict Palindrome Word
    @Test
    public void testUnstrictPalindromeWord_True() {
        assertTrue(HelperMethods.isUnstrictPalindrome("A man a plan a canal Panama"));
    }

    @Test
    public void testUnstrictPalindromeWord_False() {
        assertFalse(HelperMethods.isUnstrictPalindrome("Hello World"));
    }

    @Test
    public void testUnstrictPalindromeWord_IgnoreSpaces() {
        assertTrue(HelperMethods.isUnstrictPalindrome("Was it a car or a cat I saw"));
    }

    @Test
    public void testUnstrictPalindromeWord_WithPunctuation() {
        assertTrue(HelperMethods.isUnstrictPalindrome("No 'x' in Nixon"));
    }

    // Test Cases for Clean Input
    @Test
    public void testCleanInput_OnlyLettersAndNumbers() {
        assertEquals("hello123", HelperMethods.cleanInput("hello123"));
    }

    @Test
    public void testCleanInput_WithSpacesAndPunctuation() {
        assertEquals("hello123", HelperMethods.cleanInput(" hello 123! "));
    }

    @Test
    public void testCleanInput_OnlyPunctuation() {
        assertEquals("", HelperMethods.cleanInput("!@#$%^&*()"));
    }
}
