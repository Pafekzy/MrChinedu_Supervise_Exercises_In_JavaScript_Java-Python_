const isPalindrome = require('../Implementation/isPalindrome');

test('checks if a string is a palindrome', () => {
    expect(isPalindrome('racecar')).toBe(true);    
    expect(isPalindrome('hello')).toBe(false);        
});
