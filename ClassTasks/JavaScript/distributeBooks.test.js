const distributeBooks = require('./distributeBooks');

test('distributes books to members', () => {
    const members = ["Emily", "Jack", "Sophia", "Daniel"];
    const books = ["Book1", "Book2", "Book3", "Book4"];
    expect(distributeBooks(members, books)).toEqual([
        { member: "Emily", book: "Book1" },
        { member: "Jack", book: "Book2" },
        { member: "Sophia", book: "Book3" },
        { member: "Daniel", book: "Book4" }
    ]);
});

test('handles empty members list', () => {
    const members = [];
    const books = ["Book1", "Book2", "Book3", "Book4"];
    expect(distributeBooks(members, books)).toEqual([]);
});

test('handles extra books', () => {
    const members = ["Emily", "Jack", "Sophia", "Daniel"];
    const books = ["Book1", "Book2", "Book3", "Book4", "Book5"];
    expect(distributeBooks(members, books)).toEqual([
        { member: "Emily", book: "Book1" },
        { member: "Jack", book: "Book2" },
        { member: "Sophia", book: "Book3" },
        { member: "Daniel", book: "Book4" }
    ]);
});
