const factorial = require('../Implementation/factorial');

test('calculates factorial of a number', () => {
    expect(factorial(5)).toBe(120);
    expect(factorial(0)).toBe(1);
    expect(factorial(3)).toBe(6);
});
