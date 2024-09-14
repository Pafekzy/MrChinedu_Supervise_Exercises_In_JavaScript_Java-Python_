public class SumEvenNumbers {
    public static int sumEvenNumbers(int[] numberArray) {
        int sum = 0;
        for (int number : numberArray) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        return sum;
    }
}
