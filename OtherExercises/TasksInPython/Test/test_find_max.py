import unittest
from find_max import find_max

class TestFindMax(unittest.TestCase):
    def test_find_max(self):
        self.assertEqual(find_max([10, 3, 15, 7, 8]), 15)
        self.assertEqual(find_max([-1, -5, -3]), -1)
        self.assertEqual(find_max([0]), 0)
        self.assertIsNone(find_max([]))

if __name__ == '__main__':
    unittest.main()
