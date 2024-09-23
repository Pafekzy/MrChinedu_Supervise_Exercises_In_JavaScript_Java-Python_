function countFrequency(numbersArray) {
    const elementCount = {};  

    for (const currentNumber of numbersArray) {
        if (elementCount[currentNumber] !== undefined) {
            elementCount[currentNumber] += 1; 
        } else {
            elementCount[currentNumber] = 1;   
        }
    }

    return elementCount;   
}

module.exports = countFrequency;   
