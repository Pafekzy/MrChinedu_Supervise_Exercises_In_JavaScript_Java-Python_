function countOddNumbers(numbers) {
    let oddNumberCount = 0;
    for (let index = 0; index < numbers.length; index++) {
        if (numbers[index] % 2 !== 0) {
            oddNumberCount++;
        }
    }
    return oddNumberCount;
}

module.exports = countOddNumbers;
