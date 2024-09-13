function sumEvenNumbers(numbers) {
    let totalEvenSum = 0;
    for (let index = 0; index < numbers.length; index++) {
        if (numbers[index] % 2 === 0) {
            totalEvenSum += numbers[index];
        }
    }
    return totalEvenSum;
}

function findMaxValue(numbers) {
    let maxValue = numbers[0];
    for (let index = 1; index < numbers.length; index++) {
        if (numbers[index] > maxValue) {
            maxValue = numbers[index];
        }
    }
    return maxValue;
}

function countOddNumbers(numbers) {
    let oddNumberCount = 0;
    for (let index = 0; index < numbers.length; index++) {
        if (numbers[index] % 2 !== 0) {
            oddNumberCount++;
        }
    }
    return oddNumberCount;
}

function isPrimeNumber(number) {
    if (number <= 1) return false;
    for (let divisor = 2; divisor * divisor <= number; divisor++) {
        if (number % divisor === 0) {
            return false;
        }
    }
    return true;
}

function findFirstDuplicate(numbers) {
    for (let i = 0; i < numbers.length; i++) {
        for (let j = i + 1; j < numbers.length; j++) {
            if (numbers[i] === numbers[j]) {
                return numbers[i];
            }
        }
    }
    return -1;
}

module.exports = {
    sumEvenNumbers,
    findMaxValue,
    countOddNumbers,
    isPrimeNumber,
    findFirstDuplicate
};
