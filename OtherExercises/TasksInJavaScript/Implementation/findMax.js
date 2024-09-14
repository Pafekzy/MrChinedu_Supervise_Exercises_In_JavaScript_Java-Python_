function findMax(numbers) {
    let max = numbers[0];
    for (let number of numbers) {
        if (number > max) {
            max = number;
        }
    }
    return max;
}

module.exports = findMax;
