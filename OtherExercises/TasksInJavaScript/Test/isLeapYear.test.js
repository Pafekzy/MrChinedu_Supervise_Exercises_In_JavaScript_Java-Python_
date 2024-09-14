const isLeapYear = require('../Implementation/isLeapYear');

test('checks if a year is a leap year', () => {
    expect(isLeapYear(2000)).toBe(true);
    expect(isLeapYear(1900)).toBe(false);
    expect(isLeapYear(2020)).toBe(true);
    expect(isLeapYear(2023)).toBe(false);
});
