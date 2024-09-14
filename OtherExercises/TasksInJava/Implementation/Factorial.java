public class FactorialCalculator {
    public static int calculateFactorial(int inputNumber) {
        if (inputNumber < 0) return 0;
        int factorialResult = 1;
        for (int currentNumber = 1; currentNumber <= inputNumber; currentNumber++) {
            factorialResult *= currentNumber;
        }
        return factorialResult;
    }
}
