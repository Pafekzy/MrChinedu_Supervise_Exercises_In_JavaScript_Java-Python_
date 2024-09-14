import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CountOddNumbersTest {
    @Test
    public void testCountOddNumbers() {
        assertEquals(3, CountOddNumbers.countOddNumbers(new int[]{1, 2, 3, 4, 5}));
        assertEquals(2, CountOddNumbers.countOddNumbers(new int[]{10, 15, 20, 25}));
        assertEquals(0, CountOddNumbers.countOddNumbers(new int[]{2, 4, 6, 8}));
    }
}
