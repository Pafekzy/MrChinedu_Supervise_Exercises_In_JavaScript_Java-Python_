const sumEvenNumbers = require('./sumEvenNumbers');
const findMaxValue = require('./findMaxValue');
const countOddNumbers = require('./countOddNumbers');
const isPrimeNumber = require('./isPrimeNumber');
const findFirstDuplicate = require('./findFirstDuplicate');

test('sumEvenNumbers should return the sum of even numbers', () => {
    expect(sumEvenNumbers([1, 2, 3, 4, 5])).toBe(6);
    expect(sumEvenNumbers([1, 3, 5])).toBe(0);
});

test('findMaxValue should return the highest number', () => {
    expect(findMaxValue([1, 2, 3, 4, 5])).toBe(5);
    expect(findMaxValue([10, 20, 5, 15])).toBe(20);
});

test('countOddNumbers should return the number of odd numbers', () => {
    expect(countOddNumbers([1, 2, 3, 4, 5])).toBe(3);
    expect(countOddNumbers([2, 4, 6])).toBe(0);
});

test('isPrimeNumber should correctly identify prime numbers', () => {
    expect(isPrimeNumber(5)).toBe(true);
    expect(isPrimeNumber(4)).toBe(false);
});

test('findFirstDuplicate should return the first duplicate number in the array', () => {
    expect(findFirstDuplicate([2, 1, 5, 7, 8, 5])).toBe(5);
    expect(findFirstDuplicate([1, 2, 3, 4])).toBe(-1);
});
