function calculateTotalExpenses(expenses) {
    let total = 0;
    for (const category in expenses) {
        total += expenses[category];
    }
    return total;
}

module.exports = calculateTotalExpenses;
