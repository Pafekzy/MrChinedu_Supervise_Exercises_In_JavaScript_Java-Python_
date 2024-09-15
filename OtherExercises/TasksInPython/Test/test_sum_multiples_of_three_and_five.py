import unittest
from sum_multiples_of_three_and_five import sum_multiples_of_three_and_five

class TestSumMultiplesOfThreeAndFive(unittest.TestCase):
    def test_sum_multiples_of_three_and_five(self):
        self.assertEqual(sum_multiples_of_three_and_five(10), 23)
        self.assertEqual(sum_multiples_of_three_and_five(20), 78)
        self.assertEqual(sum_multiples_of_three_and_five(0), 0)

if __name__ == '__main__':
    unittest.main()
