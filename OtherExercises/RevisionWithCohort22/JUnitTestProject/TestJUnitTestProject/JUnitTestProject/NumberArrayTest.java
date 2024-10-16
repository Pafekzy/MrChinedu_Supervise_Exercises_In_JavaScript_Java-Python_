import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberArrayTest {

    @Test
    public void testDisplayBothElementNumbersInArray_normalInput() {
        NumberArray numberArray = new NumberArray();
        int[] input = {2, 3, 5, 1, 7};
        int[] expectedOutput = {7, 5};
        assertArrayEquals(expectedOutput, numberArray.displayBothElementNumbersInArray(input));
    }

    @Test
    public void testDisplayBothElementNumbersInArray_negativeAndPositive() {
        NumberArray numberArray = new NumberArray();
        int[] input = {-10, -20, 5, 1, 7};
        int[] expectedOutput = {7, 5};
        assertArrayEquals(expectedOutput, numberArray.displayBothElementNumbersInArray(input));
    }

    @Test
    public void testDisplayBothElementNumbersInArray_duplicates() {
        NumberArray numberArray = new NumberArray();
        int[] input = {2, 3, 5, 5, 7, 7};
        int[] expectedOutput = {7, 5};
        assertArrayEquals(expectedOutput, numberArray.displayBothElementNumbersInArray(input));
    }

    @Test
    public void testDisplayBothElementNumbersInArray_twoElements() {
        NumberArray numberArray = new NumberArray();
        int[] input = {5, 7};
        int[] expectedOutput = {7, 5};
        assertArrayEquals(expectedOutput, numberArray.displayBothElementNumbersInArray(input));
    }

    @Test
    public void testDisplayBothElementNumbersInArray_identicalElements() {
        NumberArray numberArray = new NumberArray();
        int[] input = {3, 3, 3, 3};
        int[] expectedOutput = {3, 3};
        assertArrayEquals(expectedOutput, numberArray.displayBothElementNumbersInArray(input));
    }

    @Test
    public void testDisplayBothElementNumbersInArray_emptyArray() {
        NumberArray numberArray = new NumberArray();
        int[] input = {};
        int[] expectedOutput = {};
        assertArrayEquals(expectedOutput, numberArray.displayBothElementNumbersInArray(input));
    }
}
