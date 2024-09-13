const isPalindrome = require('./contain10.test/isPalindrome'); 
describe('Palindrome Tests', () => {
    test('should return true for palindrome number 121', () => {
        console.log('Running test: should return true for palindrome number 121');
        expect(isPalindrome(121)).toBe(true);
    });

    test('should return false for non-palindrome number 123', () => {
        console.log('Running test: should return false for non-palindrome number 123');
        expect(isPalindrome(123)).toBe(false);
    });

   });
