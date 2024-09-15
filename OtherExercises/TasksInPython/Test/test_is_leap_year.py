import unittest
from is_leap_year import is_leap_year

class TestIsLeapYear(unittest.TestCase):
    def test_is_leap_year(self):
        self.assertTrue(is_leap_year(2020))
        self.assertFalse(is_leap_year(2019))
        self.assertTrue(is_leap_year(2000))
        self.assertFalse(is_leap_year(1900))

if __name__ == '__main__':
    unittest.main()
