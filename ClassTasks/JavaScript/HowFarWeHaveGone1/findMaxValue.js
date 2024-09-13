function findMaxValue(numbers) {
    let maxValue = numbers[0];
    for (let index = 1; index < numbers.length; index++) {
        if (numbers[index] > maxValue) {
            maxValue = numbers[index];
        }
    }
    return maxValue;
}

module.exports = findMaxValue;
