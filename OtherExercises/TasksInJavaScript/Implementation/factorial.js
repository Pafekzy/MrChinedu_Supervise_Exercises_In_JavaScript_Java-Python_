function factorial(number) {
    if (number < 0) return 0;
    if (number === 0) return 1;
    let result = 1;
    for (let i = 1; i <= number; i++) {
        result *= i;
    }
    return result;
}

module.exports = factorial;
