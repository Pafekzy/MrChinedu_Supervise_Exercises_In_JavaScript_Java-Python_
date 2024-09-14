import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FindMaxTest {
    @Test
    public void testFindMax() {
        assertEquals(5, FindMax.findMax(new int[]{1, 2, 3, 4, 5}));
        assertEquals(-1, FindMax.findMax(new int[]{-1, -2, -3, -4, -5}));
        assertEquals(25, FindMax.findMax(new int[]{10, 15, 20, 25}));
    }
}
