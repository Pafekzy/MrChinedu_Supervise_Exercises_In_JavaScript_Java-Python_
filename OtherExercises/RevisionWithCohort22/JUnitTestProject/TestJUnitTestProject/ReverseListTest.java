import static org.junit.jupiter.api.Assertions.assertNotNull;

import JUnitTestProject.ReverseList;
import org.junit.jupiter.api.Test;
public class ReverseListTest {

    @org.junit.Test
    @Test
    public void testIfItHasTheCapacityToCarryASimpleList() {
        ReverseList reverseList = new ReverseList();
        int[] inputList = {1, 2, 3, 4, 5}; 
        
        assertNotNull(inputList);
    }
}
