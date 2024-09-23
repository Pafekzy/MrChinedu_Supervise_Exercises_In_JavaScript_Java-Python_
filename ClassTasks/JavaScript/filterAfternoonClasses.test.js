const filterAfternoonClasses = require('./filterAfternoonClasses');

test('filters afternoon classes', () => {
    const classTimings = ["9:00 AM", "11:00 AM", "1:00 PM", "3:00PM", "5:00PM"];
    expect(filterAfternoonClasses(classTimings)).toEqual(["1:00 PM", "3:00PM", "5:00PM"]);
});

test('handles no PM classes', () => {
    const classTimings = ["9:00 AM", "11:00 AM"];
    expect(filterAfternoonClasses(classTimings)).toEqual([]);
});

test('handles only PM classes', () => {
    const classTimings = ["1:00 PM", "3:00PM", "5:00PM"];
    expect(filterAfternoonClasses(classTimings)).toEqual(["1:00 PM", "3:00PM", "5:00PM"]);
});
