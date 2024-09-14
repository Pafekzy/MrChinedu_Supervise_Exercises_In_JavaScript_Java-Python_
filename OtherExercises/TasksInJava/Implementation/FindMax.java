public class FindMax {
    public static int findMax(int[] numberArray) {
        int maxNumber = numberArray[0];
        for (int number : numberArray) {
            if (number > maxNumber) {
                maxNumber = number;
            }
        }
        return maxNumber;
    }
}
