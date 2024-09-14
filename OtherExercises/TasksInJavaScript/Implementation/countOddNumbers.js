function countOddNumbers(numbers) {
    let count = 0;
    for (let number of numbers) {
        if (number % 2 !== 0) {
            count++;
        }
    }
    return count;
}

module.exports = countOddNumbers;
