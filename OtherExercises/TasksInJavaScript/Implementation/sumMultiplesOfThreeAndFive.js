function sumMultiplesOfThreeAndFive(limit) {
    let sum = 0;
    for (let number = 1; number < limit; number++) {
        if (number % 3 === 0 || number % 5 === 0) {
            sum += number;
        }
    }
    return sum;
}

module.exports = sumMultiplesOfThreeAndFive;
