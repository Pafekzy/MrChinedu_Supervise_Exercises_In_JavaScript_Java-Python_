const calculateTotalExpenses = require('./calculateTotalExpenses');

test('calculates total expenses', () => {
    const expenses = {
        groceries: 150,
        diningOut: 100,
        transportation: 50,
        entertainment: 80
    };
    expect(calculateTotalExpenses(expenses)).toBe(380);
});

test('handles zero expenses', () => {
    const expenses = {
        groceries: 0,
        diningOut: 0,
        transportation: 0,
        entertainment: 0
    };
    expect(calculateTotalExpenses(expenses)).toBe(0);
});

test('handles some categories missing', () => {
    const expenses = {
        groceries: 150,
        diningOut: 100
    };
    expect(calculateTotalExpenses(expenses)).toBe(250);
});
