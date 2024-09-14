const findMax = require('../Implementation/findMax');

test('finds the largest number in array', () => {
    expect(findMax([1, 2, 3, 4, 5])).toBe(5);
    expect(findMax([-1, -2, -3, -4, -5])).toBe(-1);
    expect(findMax([10, 15, 20, 25])).toBe(25);
});
