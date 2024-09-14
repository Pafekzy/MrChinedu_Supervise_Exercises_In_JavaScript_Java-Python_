import java.util.HashSet;

public class FindFirstDuplicate {
    public static int findFirstDuplicate(int[] numberArray) {
        HashSet<Integer> seenNumbers = new HashSet<>();
        for (int number : numberArray) {
            if (seenNumbers.contains(number)) {
                return number;
            }
            seenNumbers.add(number);
        }
        return -1;
    }
}
