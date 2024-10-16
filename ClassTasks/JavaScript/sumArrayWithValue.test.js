// sumArrayWithValue.test.js
const sumArrayWithValue = require('./sumArrayWithValue');

test('Adding 1 to [9, 9, 9] results in [1, 0, 0, 0]', () => {
    expect(sumArrayWithValue([9, 9, 9], 1)).toEqual([1, 0, 0, 0]);
});

test('Adding 1 to [1, 2, 3] results in [1, 2, 4]', () => {
    expect(sumArrayWithValue([1, 2, 3], 1)).toEqual([1, 2, 4]);
});

test('Adding 0 to [5, 5, 5] results in [5, 5, 5]', () => {
    expect(sumArrayWithValue([5, 5, 5], 0)).toEqual([5, 5, 5]);
});

test('Adding 15 to [9, 8, 7] results in [1, 0, 0, 2]', () => {
    expect(sumArrayWithValue([9, 8, 7], 15)).toEqual([1, 0, 0, 2]);
});
