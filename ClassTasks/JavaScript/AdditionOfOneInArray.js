function sumArrayWithValue(arr, valueToAdd) {
    
    let carry = valueToAdd; 

    for (let indexValue = arr.length - 1; indexValue >= 0; indexValue--) {
        
        let sum = arr[i] + carry;

        arr[index] = sum % 10;

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
