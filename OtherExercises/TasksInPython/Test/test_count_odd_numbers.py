import unittest
from count_odd_numbers import count_odd_numbers

class TestCountOddNumbers(unittest.TestCase):
    def test_count_odd_numbers(self):
        self.assertEqual(count_odd_numbers([1, 2, 3, 4, 5]), 3)
        self.assertEqual(count_odd_numbers([2, 4, 6]), 0)
        self.assertEqual(count_odd_numbers([]), 0)

if __name__ == '__main__':
    unittest.main()
