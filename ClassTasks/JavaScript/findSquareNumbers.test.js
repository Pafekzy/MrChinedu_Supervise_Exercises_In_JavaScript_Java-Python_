const findSquareNumbers = require('./findSquareNumbers');

test('finds squares of positive numbers', () => {
    const numbers = [2, 4, 6, 8, 10];
    expect(findSquareNumbers(numbers)).toEqual([4, 16, 36, 64, 100]);
});

test('finds squares of negative numbers', () => {
    const numbers = [-2, -4, -6];
    expect(findSquareNumbers(numbers)).toEqual([4, 16, 36]);
});

test('finds squares of mixed positive and negative numbers', () => {
    const numbers = [-3, 0, 3];
    expect(findSquareNumbers(numbers)).toEqual([9, 0, 9]);
});
