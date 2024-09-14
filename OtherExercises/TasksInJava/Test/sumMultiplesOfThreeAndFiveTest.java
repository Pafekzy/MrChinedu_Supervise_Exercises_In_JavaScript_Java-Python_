import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SumMultiplesOfThreeAndFiveTest {
    @Test
    public void testSumMultiplesOfThreeAndFive() {
        assertEquals(23, SumMultiplesOfThreeAndFive.sumMultiplesOfThreeAndFive(10));
        assertEquals(78, SumMultiplesOfThreeAndFive.sumMultiplesOfThreeAndFive(20));
    }
}
