import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TwoDimensionalArrayAppTest {
    private TwoDimensionalArrayApp app;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outContent));
        app = new TwoDimensionalArrayApp();
    }

    // 1. Test to check initialization of the array
    @Test
    public void testArrayInitialization_ShouldCreateZeroArray() {
        assertArrayEquals(new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}}, app.array);
    }

    // 2. Test for displaying the array
    @Test
    public void testDisplayArray_ShouldShowInitialArray() {
        app.displayArray();
        assertEquals("\n      \n      \n      \n", outContent.toString());
    }

    // 3. Test for displaying a row
    @Test
    public void testPrintRow_ShouldDisplayRowCorrectly() {
        app.printRow(0);
        assertEquals("      \n", outContent.toString());
    }

    // 4. Test for displaying a column value as star
    @Test
    public void testPrintArrayValue_ShouldShowStarForOne() {
        app.assignValue(0, 0, 1);
        app.printArrayValue(0, 0);
        assertEquals(" * ", outContent.toString());
    }

    // 5. Test for displaying a column value as empty space
    @Test
    public void testPrintArrayValue_ShouldShowEmptySpaceForZero() {
        app.printArrayValue(0, 0);
        assertEquals("   ", outContent.toString());
    }

    // 6. Test for modifying a cell with valid input
    @Test
    public void testModifyCell_ShouldAssignValueCorrectly() {
        app.assignValue(0, 0, 1);
        assertEquals(1, app.array[0][0]);
    }

    // 7. Test for invalid input handling when modifying a cell
    @Test
    public void testGetUserInputAndModify_InvalidInput_ShouldNotModifyCell() {
        app.assignValue(0, 0, 1);
        app.validateAndAssignValue(0, 0, -1); // Invalid value
        assertEquals(1, app.array[0][0]); // Value should remain unchanged
    }

    // 8. Test for reading user input
    @Test
    public void testReadUserInput_ShouldReturnParsedValue() {
        app.readUserInput(); // Simulate input
        assertEquals(1, app.readUserInput());
    }

    // 9. Test for handling non-numeric input
    @Test
    public void testParseInput_ShouldHandleNonNumericInput() {
        assertEquals(-1, app.parseInput("abc")); // Invalid input
    }

    // 10. Test for valid binary input
    @Test
    public void testValidateAndAssignValue_ValidInput_ShouldAssignValue() {
        app.validateAndAssignValue(0, 0, 1);
        assertEquals(1, app.array[0][0]);
    }

    // 11. Test for invalid binary input handling
    @Test
    public void testValidateAndAssignValue_InvalidInput_ShouldNotAssignValue() {
        app.assignValue(0, 0, 1);
        app.validateAndAssignValue(0, 0, 3); // Invalid value
        assertEquals(1, app.array[0][0]); // Value should remain unchanged
    }

    // 12. Test for displaying invalid numeric message
    @Test
    public void testDisplayInvalidNumericMessage_ShouldShowError() {
        app.displayInvalidNumericMessage();
        assertEquals("Invalid input! Please enter a numeric value.\n", outContent.toString());
    }

    // 13. Test for displaying invalid binary message
    @Test
    public void testDisplayInvalidBinaryMessage_ShouldShowError() {
        app.displayInvalidBinaryMessage();
        assertEquals("Invalid input! Please enter 1 or 0 only.\n", outContent.toString());
    }

    // 14. Test for prompt to modify array instruction
    @Test
    public void testDisplayModifyInstruction_ShouldShowPrompt() {
        app.displayModifyInstruction();
        assertEquals("Please enter 1 or 0 to modify each cell of the 3x3 array:\n", outContent.toString());
    }

    // 15. Test for looping through rows to modify array
    @Test
    public void testLoopRowsToModifyArray_ShouldCallModifyRow() {
        app.loopRowsToModifyArray();
        // Ensure each row is processed
        assertEquals(3, outContent.toString().split("\n").length - 1); // Number of rows
    }

    // 16. Test for prompting user for cell input
    @Test
    public void testDisplayCellPrompt_ShouldShowCorrectPrompt() {
        app.displayCellPrompt(1, 1);
        assertEquals("Enter value for position [1, 1]: ", outContent.toString());
    }

    // 17. Test for valid user input modification
    @Test
    public void testGetUserInputAndModify_ValidInput_ShouldReturnTrue() {
        app.getUserInputAndModify(1, 1); // Assuming valid input
        assertTrue(app.validateAndAssignValue(1, 1, 1)); // Test valid assignment
    }

    // 18. Test for invalid user input modification
    @Test
    public void testGetUserInputAndModify_InvalidInput_ShouldReturnFalse() {
        app.getUserInputAndModify(1, 1); // Assuming invalid input
        assertFalse(app.validateAndAssignValue(1, 1, 2)); // Test invalid assignment
    }

    // 19. Test for closing scanner
    @Test
    public void testCloseScanner_ShouldNotThrowException() {
        app.closeScanner();
        assertThrows(Exception.class, () -> app.scanner.nextLine()); // Should throw exception if scanner is closed
    }

    // 20. Test for showing final array
    @Test
    public void testShowFinalArray_ShouldDisplayModifiedArray() {
        app.assignValue(0, 0, 1);
        app.showFinalArray();
        assertEquals("\n * \n      \n      \n", outContent.toString()); // Check for displayed array
    }

    // 21. Test for modifying an array cell
    @Test
    public void testModifyCell_ShouldUpdateCellValue() {
        app.modifyCell(1, 1);
        assertEquals(1, app.array[1][1]); // Assuming valid input set to 1
    }

    // 22. Test for input validation for cell value
    @Test
    public void testValidateAndAssignValue_ZeroInput_ShouldReturnTrue() {
        assertTrue(app.validateAndAssignValue(2, 2, 0)); // Valid binary input
    }

    // 23. Test for printing a row of the array
    @Test
    public void testPrintRow_ShouldDisplayCorrectRowFormat() {
        app.assignValue(0, 0, 1);
        app.printRow(0);
        assertEquals(" * \n", outContent.toString());
    }

    // 24. Test for printing a new line
    @Test
    public void testPrintNewLine_ShouldPrintNewLine() {
        app.printNewLine();
        assertEquals("\n", outContent.toString());
    }

    // 25. Test for displaying instructions correctly
    @Test
    public void testDisplayInstructions_ShouldShowCorrectMessage() {
        app.displayModifyInstruction();
        assertEquals("Please enter 1 or 0 to modify each cell of the 3x3 array:\n", outContent.toString());
    }

    // 26. Test for handling input that is too high
    @Test
    public void testValidateAndAssignValue_InputTooHigh_ShouldReturnFalse() {
        assertFalse(app.validateAndAssignValue(1, 1, 2)); // Invalid input
    }

    // 27. Test for checking size of the array
    @Test
    public void testArraySize_ShouldBeThree() {
        assertEquals(3, app.array.length);
    }

    // 28. Test for ensuring the initial array is empty
    @Test
    public void testArrayShouldBeInitiallyEmpty() {
        assertArrayEquals(new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}}, app.array);
    }

    // 29. Test for valid input during cell modification
    @Test
    public void testModifyCell_WithValidInput_ShouldModifyCell() {
        app.validateAndAssignValue(1, 1, 1);
        assertEquals(1, app.array[1][1]);
    }

    // 30. Test for invalid input during cell modification
    @Test
    public void testModifyCell_WithInvalidInput_ShouldNotModifyCell() {
        app.validateAndAssignValue(1, 1, 2);
        assertEquals(0, app.array[1][1]);
    }

    // 31. Test for boundary conditions
    @Test
    public void testModifyCell_AtBoundary_ShouldModifyCell() {
        app.validateAndAssignValue(0, 0, 1);
        assertEquals(1, app.array[0][0]);
    }

    // 32. Test for accessing a cell out of bounds
    @Test
    public void testModifyCell_OutOfBounds_ShouldThrowException() {
        assertThrows(IndexOutOfBoundsException.class, () -> {
            app.validateAndAssignValue(3, 3, 1);
        });
    }

    // 33. Test for displaying a single value from the array
    @Test
    public void testDisplaySingleValue_ShouldShowCorrectValue() {
        app.validateAndAssignValue(0, 0, 1);
        app.displaySingleValue(0, 0);
        assertEquals(" * ", outContent.toString());
    }

    // 34. Test for updating multiple cells
    @Test
    public void testUpdateMultipleCells_ShouldUpdateAllCells() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                app.validateAndAssignValue(i, j, 1);
            }
        }
        assertEquals(1, app.array[2][2]); // Check last cell
    }

    // 35. Test for displaying the entire array
    @Test
    public void testDisplayEntireArray_ShouldShowAllValues() {
        app.validateAndAssignValue(0, 0, 1);
        app.displayEntireArray();
        assertEquals("\n * \n      \n      \n", outContent.toString());
    }

    // 36. Test for summing all elements
    @Test
    public void testSumOfElements_ShouldReturnTotalSum() {
        app.validateAndAssignValue(0, 0, 1);
        app.validateAndAssignValue(1, 1, 1);
        assertEquals(2, app.sumOfElements());
    }

    // 37. Test for resetting the array
    @Test
    public void testResetArray_ShouldSetAllValuesToZero() {
        app.validateAndAssignValue(0, 0, 1);
        app.resetArray();
        assertArrayEquals(new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}}, app.array);
    }

    // 38. Test for printing the array as string
    @Test
    public void testArrayAsString_ShouldReturnStringRepresentation() {
        app.validateAndAssignValue(0, 0, 1);
        assertEquals("[1, 0, 0], [0, 0, 0], [0, 0, 0]", app.arrayAsString());
    }

    // 39. Test for counting number of ones in the array
    @Test
    public void testCountOnes_ShouldReturnCorrectCount() {
        app.validateAndAssignValue(0, 0, 1);
        app.validateAndAssignValue(1, 1, 1);
        assertEquals(2, app.countOnes());
    }

    // 40. Test for counting number of zeros in the array
    @Test
    public void testCountZeros_ShouldReturnCorrectCount() {
        app.validateAndAssignValue(0, 0, 1);
        assertEquals(7, app.countZeros());
    }

    // 41. Test for getting the maximum value in the array
    @Test
    public void testMaxValue_ShouldReturnMax() {
        app.validateAndAssignValue(0, 0, 1);
        app.validateAndAssignValue(1, 1, 1);
        assertEquals(1, app.maxValue());
    }

    // 42. Test for checking if the array is full
    @Test
    public void testIsArrayFull_ShouldReturnFalse() {
        assertFalse(app.isArrayFull());
    }

    // 43. Test for checking if the array is empty
    @Test
    public void testIsArrayEmpty_ShouldReturnTrue() {
        assertTrue(app.isArrayEmpty());
    }

    // 44. Test for checking if the array contains a specific value
    @Test
    public void testContainsValue_ShouldReturnTrueForPresentValue() {
        app.validateAndAssignValue(0, 0, 1);
        assertTrue(app.containsValue(1));
    }

    // 45. Test for checking if the array does not contain a specific value
    @Test
    public void testContainsValue_ShouldReturnFalseForAbsentValue() {
        assertFalse(app.containsValue(2));
    }

    // 46. Test for filling the array with a specific value
    @Test
    public void testFillArray_ShouldFillAllCells() {
        app.fillArray(1);
        assertEquals(1, app.array[0][0]);
        assertEquals(1, app.array[1][1]);
        assertEquals(1, app.array[2][2]);
    }

    // 47. Test for transposing the array
    @Test
    public void testTransposeArray_ShouldTransposeValues() {
        app.validateAndAssignValue(0, 1, 1);
        app.transposeArray();
        assertEquals(1, app.array[1][0]);
    }

    // 48. Test for reversing the array
    @Test
    public void testReverseArray_ShouldReverseValues() {
        app.validateAndAssignValue(0, 0, 1);
        app.reverseArray();
        assertEquals(1, app.array[2][2]); // Check for reverse
    }

    // 49. Test for checking if two arrays are equal
    @Test
    public void testArraysEqual_ShouldReturnTrueForEqualArrays() {
        int[][] otherArray = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        assertTrue(app.arraysEqual(app.array, otherArray));
    }

    // 50. Test for checking if two arrays are not equal
    @Test
    public void testArraysEqual_ShouldReturnFalseForUnequalArrays() {
        app.validateAndAssignValue(0, 0, 1);
        int[][] otherArray = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        assertFalse(app.arraysEqual(app.array, otherArray));
    }

    // 51. Test for cloning the array
    @Test
    public void testCloneArray_ShouldReturnCloneOfArray() {
        app.validateAndAssignValue(0, 0, 1);
        int[][] clonedArray = app.cloneArray();
        assertArrayEquals(app.array, clonedArray);
    }

    // 52. Test for printing the cloned array
    @Test
    public void testPrintClonedArray_ShouldShowCorrectClone() {
        app.validateAndAssignValue(0, 0, 1);
        app.printClonedArray();
        assertEquals(" * ", outContent.toString());
    }

    // 53. Test for resetting array size
    @Test
    public void testResetArraySize_ShouldReturnToDefaultSize() {
        app.resetArraySize();
        assertArrayEquals(new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}}, app.array);
    }

    // 54. Test for ensuring the output is cleared after cleanup
    @Test
    public void testCleanupAfterOperations_ShouldResetOutput() {
        app.displayArray(); // Some operation
        app.cleanupAfterOperations();
        assertEquals("", outContent.toString()); // Output should be cleared after cleanup
    }

    // 55. Test for summarizing array state
    @Test
    public void testSummarizeArrayState_ShouldDisplaySummary() {
        app.validateAndAssignValue(0, 0, 1);
        app.summarizeArrayState();
        assertEquals("Array contains 1 ones and 8 zeros.\n", outContent.toString());
    }

    // 56. Test for input prompting with an invalid row index
    @Test
    public void testPromptInputForInvalidRowIndex_ShouldDisplayErrorMessage() {
        app.promptInputForRowIndex(-1);
        assertEquals("Invalid row index. Please enter a valid index between 0 and 2.\n", outContent.toString());
    }

    // 57. Test for input prompting with a valid column index
    @Test
    public void testPromptInputForColumnIndex_ShouldDisplayPromptForColumn() {
        app.promptInputForColumnIndex(0);
        assertEquals("Enter index for column 0: ", outContent.toString());
    }

    // 58. Test for input prompting with an invalid column index
    @Test
    public void testPromptInputForInvalidColumnIndex_ShouldDisplayErrorMessage() {
        app.promptInputForColumnIndex(-1);
        assertEquals("Invalid column index. Please enter a valid index between 0 and 2.\n", outContent.toString());
    }

    // 59. Test for assigning a value out of bounds
    @Test
    public void testAssignValue_OutOfBounds_ShouldReturnFalse() {
        assertFalse(app.validateAndAssignValue(3, 3, 1)); // Invalid indices
        assertFalse(app.validateAndAssignValue(-1, -1, 1)); // Invalid indices
    }

    // 60. Test for ensuring proper cleanup after operations
    @Test
    public void testCleanupAfterOperations_ShouldResetOutput() {
        app.displayArray(); // Perform an operation
        app.cleanupAfterOperations(); // Clean up
        assertEquals("", outContent.toString()); // Output should be cleared
    }

