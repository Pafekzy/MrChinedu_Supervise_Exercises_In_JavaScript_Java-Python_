import unittest
from reverse_array import reverse_array

class TestReverseArray(unittest.TestCase):
    def test_reverse_array(self):
        self.assertEqual(reverse_array([1, 2, 3]), [3, 2, 1])
        self.assertEqual(reverse_array([5, 4, 3, 2, 1]), [1, 2, 3, 4, 5])
        self.assertEqual(reverse_array([]), [])

if __name__ == '__main__':
    unittest.main()
