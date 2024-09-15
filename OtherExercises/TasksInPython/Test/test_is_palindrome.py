import unittest
from is_palindrome import is_palindrome

class TestIsPalindrome(unittest.TestCase):
    def test_is_palindrome(self):
        self.assertTrue(is_palindrome('racecar'))
        self.assertFalse(is_palindrome('hello'))
        self.assertTrue(is_palindrome('A man, a plan, a canal, Panama'))

if __name__ == '__main__':
    unittest.main()
