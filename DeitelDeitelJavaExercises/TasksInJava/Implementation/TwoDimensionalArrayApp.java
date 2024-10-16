import java.util.Scanner;

// Define the class `TwoDimensionalArrayApp` to contain the entire program logic
public class TwoDimensionalArrayApp {

    private Scanner scanner;
    private static final int SIZE = 3;
    private int[][] array;

    // Constructor for initializing the scanner and the array
    public TwoDimensionalArrayApp() {
        initializeScanner();
        initializeArray();
    }

    private void initializeScanner() {
        scanner = new Scanner(System.in); // Initialize scanner for user input
    }

    private void initializeArray() {
        array = new int[SIZE][SIZE]; // Initialize the 3x3 array with default values (zeros)
    }

    // Main method to start the program
    public static void main(String[] args) {
        TwoDimensionalArrayApp app = new TwoDimensionalArrayApp();
        app.runProgram(); 
    }

    private void runProgram() {
        showInitialArray();
        promptUserToModifyArray();
        showFinalArray();
        closeScanner();
    }

    private void showInitialArray() {
        displayArray(); // Show initial empty array
    }

    private void showFinalArray() {
        displayArray(); // Show modified array after inputs
    }

    private void closeScanner() {
        scanner.close(); // Close the scanner object to release resources
    }

    // Display the contents of the array
    private void displayArray() {
        printNewLine();
        loopRowsToPrint();
    }

    private void printNewLine() {
        System.out.println();
    }

    private void loopRowsToPrint() {
        for (int row = 0; row < SIZE; row++) {
            printRow(row);
        }
    }

    private void printRow(int row) {
        loopColsToPrint(row);
        printNewLine();
    }

    private void loopColsToPrint(int row) {
        for (int col = 0; col < SIZE; col++) {
            printArrayValue(row, col);
        }
    }

    private void printArrayValue(int row, int col) {
        if (array[row][col] == 1) {
            printStar();
        } else {
            printEmptySpace();
        }
    }

    private void printStar() {
        System.out.print(" * ");
    }

    private void printEmptySpace() {
        System.out.print("   ");
    }

    // Method to prompt the user to modify the contents of the array
    private void promptUserToModifyArray() {
        displayModifyInstruction();
        loopRowsToModifyArray();
    }

    private void displayModifyInstruction() {
        System.out.println("Please enter 1 or 0 to modify each cell of the 3x3 array:");
    }

    private void loopRowsToModifyArray() {
        for (int row = 0; row < SIZE; row++) {
            modifyRow(row);
        }
    }

    private void modifyRow(int row) {
        loopColsToModify(row);
    }

    private void loopColsToModify(int row) {
        for (int col = 0; col < SIZE; col++) {
            modifyCell(row, col);
        }
    }

    private void modifyCell(int row, int col) {
        boolean isValidInput = false;
        while (!isValidInput) {
            isValidInput = getUserInputAndModify(row, col);
        }
    }

    private boolean getUserInputAndModify(int row, int col) {
        displayCellPrompt(row, col);
        return validateAndAssignValue(row, col, readUserInput());
    }

    private void displayCellPrompt(int row, int col) {
        System.out.print("Enter value for position [" + row + ", " + col + "]: ");
    }

    private int readUserInput() {
        return parseInput(scanner.nextLine());
    }

    private int parseInput(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            displayInvalidNumericMessage();
            return -1;
        }
    }

    private void displayInvalidNumericMessage() {
        System.out.println("Invalid input! Please enter a numeric value.");
    }

    private boolean validateAndAssignValue(int row, int col, int value) {
        if (isValidValue(value)) {
            assignValue(row, col, value);
            return true;
        } else {
            displayInvalidBinaryMessage();
            return false;
        }
    }

    private boolean isValidValue(int value) {
        return value == 1 || value == 0;
    }

    private void assignValue(int row, int col, int value) {
        array[row][col] = value;
    }

    private void displayInvalidBinaryMessage() {
        System.out.println("Invalid input! Please enter 1 or 0 only.");
    }
}
