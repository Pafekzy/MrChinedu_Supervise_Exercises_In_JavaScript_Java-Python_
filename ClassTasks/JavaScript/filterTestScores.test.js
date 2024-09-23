const filterTestScores = require('./filterTestScores');

test('filters scores greater than or equal to 70', () => {
    const testScores = [60, 75, 85, 40, 55, 90, 78, 82, 67, 95];
    expect(filterTestScores(testScores)).toEqual([75, 85, 90, 78, 82, 95]);
});

test('filters scores with no passing marks', () => {
    const testScores = [40, 50, 65, 30, 20];
    expect(filterTestScores(testScores)).toEqual([]);
});

test('filters scores with all passing marks', () => {
    const testScores = [70, 75, 85, 90, 80];
    expect(filterTestScores(testScores)).toEqual([70, 75, 85, 90, 80]);
});
