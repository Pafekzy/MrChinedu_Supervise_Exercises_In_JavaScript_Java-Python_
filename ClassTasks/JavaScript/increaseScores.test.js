const increaseScores = require('./increaseScores');

test('increases all scores by 5 points', () => {
    const examGrades = [85, 92, 78, 88, 95];
    expect(increaseScores(examGrades)).toEqual([90, 97, 83, 93, 100]);
});

test('increases empty array of grades', () => {
    const examGrades = [];
    expect(increaseScores(examGrades)).toEqual([]);
});

test('increases scores with negative and zero values', () => {
    const examGrades = [0, -5, 50, 100];
    expect(increaseScores(examGrades)).toEqual([5, 0, 55, 105]);
});
