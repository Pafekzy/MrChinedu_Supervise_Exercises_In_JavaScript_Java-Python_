const reverseArray = require('../Implementation/reverseArray');

test('reverses an array', () => {
    expect(reverseArray([1, 2, 3, 4])).toEqual([4, 3, 2, 1]);
    expect(reverseArray(['a', 'b', 'c'])).toEqual(['c', 'b', 'a']);
});
