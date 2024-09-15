import unittest
from find_first_duplicate import find_first_duplicate

class TestFindFirstDuplicate(unittest.TestCase):
    def test_find_first_duplicate(self):
        self.assertEqual(find_first_duplicate([1, 2, 3, 4, 2]), 2)
        self.assertEqual(find_first_duplicate([1, 2, 3, 4]), -1)
        self.assertEqual(find_first_duplicate([]), -1)

if __name__ == '__main__':
    unittest.main()
