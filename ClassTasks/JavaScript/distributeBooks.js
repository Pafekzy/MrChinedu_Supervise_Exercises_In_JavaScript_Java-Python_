function distributeBooks(members, books) {
    let distribution = [];
    let i = 0;
    for (const member of members) {
        distribution.push({ member: member, book: books[i] });
        i++;
    }
    return distribution;
}

module.exports = distributeBooks;
