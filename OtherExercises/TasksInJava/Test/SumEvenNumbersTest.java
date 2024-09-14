import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SumEvenNumbersTest {
    @Test
    public void testSumEvenNumbers() {
        assertEquals(6, SumEvenNumbers.sumEvenNumbers(new int[]{1, 2, 3, 4, 5}));
        assertEquals(30, SumEvenNumbers.sumEvenNumbers(new int[]{10, 15, 20, 25}));
        assertEquals(0, SumEvenNumbers.sumEvenNumbers(new int[]{1, 3, 5}));
    }
}
