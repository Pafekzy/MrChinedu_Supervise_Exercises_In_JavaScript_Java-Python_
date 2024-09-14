import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ReverseArrayTest {
    @Test
    public void testReverseArray() {
        assertArrayEquals(new int[]{4, 3, 2, 1}, ReverseArray.reverseArray(new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[]{6, 5, 4}, ReverseArray.reverseArray(new int[]{4, 5, 6}));
    }
}
