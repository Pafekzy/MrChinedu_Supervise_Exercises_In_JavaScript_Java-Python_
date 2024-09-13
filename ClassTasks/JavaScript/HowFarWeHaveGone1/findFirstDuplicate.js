function findFirstDuplicate(numbers) {
    for (let currentIndex = 0; currentIndex < numbers.length; currentIndex++) {
        for (let comparisonIndex = currentIndex + 1; comparisonIndex < numbers.length; comparisonIndex++) {
            if (numbers[currentIndex] === numbers[comparisonIndex]) {
                return numbers[currentIndex];
            }
        }
    }
    return -1;
}

module.exports = findFirstDuplicate;
