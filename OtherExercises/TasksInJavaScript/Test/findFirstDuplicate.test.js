const findFirstDuplicate = require('../Implementation/findFirstDuplicate');

test('finds the first duplicate in array', () => {
    expect(findFirstDuplicate([1, 2, 3, 4, 5, 2])).toBe(2);
    expect(findFirstDuplicate([10, 20, 30, 20, 40])).toBe(20);
    expect(findFirstDuplicate([1, 2, 3, 4, 5])).toBe(-1);
});
