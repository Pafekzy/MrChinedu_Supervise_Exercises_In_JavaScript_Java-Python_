function sumEvenNumbers(numbers) {
    let totalEvenSum = 0;
    for (let index = 0; index < numbers.length; index++) {
        if (numbers[index] % 2 === 0) {
            totalEvenSum += numbers[index];
        }
    }
    return totalEvenSum;
}

module.exports = sumEvenNumbers;
