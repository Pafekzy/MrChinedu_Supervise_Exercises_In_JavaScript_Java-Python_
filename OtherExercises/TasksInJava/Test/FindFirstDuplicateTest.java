import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FindFirstDuplicateTest {
    @Test
    public void testFindFirstDuplicate() {
        assertEquals(2, FindFirstDuplicate.findFirstDuplicate(new int[]{1, 2, 3, 4, 5, 2}));
        assertEquals(20, FindFirstDuplicate.findFirstDuplicate(new int[]{10, 20, 30, 20, 40}));
        assertEquals(-1, FindFirstDuplicate.findFirstDuplicate(new int[]{1, 2, 3, 4, 5}));
    }
}
