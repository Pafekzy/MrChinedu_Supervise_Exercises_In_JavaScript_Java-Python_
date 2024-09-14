const countOddNumbers = require('../Implementation/countOddNumbers');

test('counts odd numbers in array', () => {
    expect(countOddNumbers([1, 2, 3, 4, 5])).toBe(3);
    expect(countOddNumbers([10, 15, 20, 25])).toBe(2);
    expect(countOddNumbers([2, 4, 6, 8])).toBe(0);
});
