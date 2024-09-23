const { sum, subtract, evenNumbers } = require('../mathOperations'); // Adjust the path if needed

describe("Math Operations", () => {
    test("sum of 1 and 2 should be 3", () => {
        expect(sum(1, 2)).toBe(3);
    });

    test("subtracting 5 from 10 should be 5", () => {
        expect(subtract(10, 5)).toBe(5);
    });

    test("subtracting 3 from 8 should be 5", () => {
        expect(subtract(8, 3)).toBe(5);
    });

    test("evenNumbers should return even numbers from the array", () => {
        const input = [1, 2, 3, 4, 5, 6];
        const expectedOutput = [2, 4, 6];
        expect(evenNumbers(input)).toEqual(expectedOutput);
    });

    test("evenNumbers should return an empty array for input with no even numbers", () => {
        const input = [1, 3, 5];
        const expectedOutput = [];
        expect(evenNumbers(input)).toEqual(expectedOutput);
    });
});
