const isPrime = require('../Implementation/isPrime');

test('checks if a number is prime', () => {
    expect(isPrime(2)).toBe(true);
    expect(isPrime(4)).toBe(false);
    expect(isPrime(17)).toBe(true);
    expect(isPrime(18)).toBe(false);
});
