public class MaxNumberFinder {
    public static void main(String[] args) {
        int[] numbers = {32, 42, 2, 52, 62};

        int maximumNum = numbers[0];  
	int countingLoopings = 1;

        for (int elementPosition = 1; elementPosition < numbers.length; elementPosition++) {
            if (maximumNum < numbers[elementPosition]) {
                maximumNum = numbers[elementPosition];
  		countingLoopings++ ;
            }
        }
	System.out.println(" The number of times looped is: " +countingLoopings);
        System.out.println(" The maximum number in the array is: " + maximumNum);
    }
}
