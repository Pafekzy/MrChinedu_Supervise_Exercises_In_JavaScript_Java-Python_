import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class IsLeapYearTest {
    @Test
    public void testIsLeapYear() {
        assertTrue(IsLeapYear.isLeapYear(2000));
        assertFalse(IsLeapYear.isLeapYear(1900));
        assertTrue(IsLeapYear.isLeapYear(2020));
        assertFalse(IsLeapYear.isLeapYear(2023));
    }
}
