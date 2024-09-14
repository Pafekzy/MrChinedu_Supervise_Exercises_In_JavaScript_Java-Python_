function findFirstDuplicate(numbers) {
    let seenNumbers = new Set();
    for (let number of numbers) {
        if (seenNumbers.has(number)) {
            return number;
        }
        seenNumbers.add(number);
    }
    return -1;
}

module.exports = findFirstDuplicate;
