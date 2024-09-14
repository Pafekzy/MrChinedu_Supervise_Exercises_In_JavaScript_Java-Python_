import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class IsPrimeTest {
    @Test
    public void testIsPrime() {
        assertTrue(IsPrime.isPrime(2));
        assertFalse(IsPrime.isPrime(4));
        assertTrue(IsPrime.isPrime(17));
        assertFalse(IsPrime.isPrime(18));
    }
}
