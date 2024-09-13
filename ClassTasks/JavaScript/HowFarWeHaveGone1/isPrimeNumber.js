function isPrimeNumber(number) {
    if (number <= 1) return false;
    for (let divisor = 2; divisor <= Math.sqrt(number); divisor++) {
        if (number % divisor === 0) return false;
    }
    return true;
}

module.exports = isPrimeNumber;
