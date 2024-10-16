function sumArrayWithValue(arr, valueToAdd) {
    let carry = valueToAdd;
    for (let i = arr.length - 1; i >= 0; i--) {
    
        let sum = arr[i] + carry;
        arr[i] = sum % 10;
        carry = Math.floor(sum / 10);
        if (carry === 0) {
            break;
        }
    }
    while (carry > 0) {
        arr.unshift(carry % 10);
        carry = Math.floor(carry / 10);
    }
    return arr;
}

module.exports = sumArrayWithValue;
