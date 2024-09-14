const sumMultiplesOfThreeAndFive = require('../Implementation/sumMultiplesOfThreeAndFive');

test('sums multiples of 3 and 5 below a number', () => {
    expect(sumMultiplesOfThreeAndFive(10)).toBe(23);
    expect(sumMultiplesOfThreeAndFive(20)).toBe(78);
});
