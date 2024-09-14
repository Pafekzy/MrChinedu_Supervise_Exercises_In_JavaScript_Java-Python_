public class SumMultiplesOfThreeAndFive {
    public static int sumMultiplesOfThreeAndFive(int upperLimit) {
        int sum = 0;
        for (int number = 1; number < upperLimit; number++) {
            if (number % 3 == 0 || number % 5 == 0) {
                sum += number;
            }
        }
        return sum;
    }
}
