public class CountOddNumbers {
    public static int countOddNumbers(int[] numberArray) {
        int oddCount = 0;
        for (int number : numberArray) {
            if (number % 2 != 0) {
                oddCount++;
            }
        }
        return oddCount;
    }
}
