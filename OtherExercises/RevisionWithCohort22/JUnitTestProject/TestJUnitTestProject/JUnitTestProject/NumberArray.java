public class NumberArray {
    
    public int sortLargestElementNumber(int[] array) {
        int largest = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > largest) {
                largest = num;
            }
        }
        return largest;
    }

    public int sortSecondToTheLargestElementNumber(int[] array) {
        int largest = sortLargestElementNumber(array);
        int secondLargest = Integer.MIN_VALUE;

        for (int num : array) {
            if (num < largest && num > secondLargest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }

    public int[] displayBothElementNumbersInArray(int[] array) {
        if (array == null || array.length < 2) {
            return new int[0];  
        }

 
        int largest = sortLargestElementNumber(array);
        int secondLargest = sortSecondToTheLargestElementNumber(array);

        return new int[]{largest, secondLargest};
    }
}
