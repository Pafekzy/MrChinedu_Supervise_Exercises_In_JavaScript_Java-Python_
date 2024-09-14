function sumEvenNumbers(numbers) {
    let sum = 0;
    for (let number of numbers) {
        if (number % 2 === 0) {
            sum += number;
        }
    }
    return sum;
}

module.exports = sumEvenNumbers; 
