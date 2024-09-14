const sumEvenNumbers = require('../Implementation/sumEvenNumbers'); 

test('sums even numbers in array', () => {
    expect(sumEvenNumbers([1, 2, 3, 4, 5])).toBe(6); // 2 + 4 = 6
    expect(sumEvenNumbers([10, 15, 20, 25])).toBe(30); // 10 + 20 = 30
    expect(sumEvenNumbers([1, 3, 5])).toBe(0); // No even numbers
});
