function isPalindrome(inputString) {

    const cleanedString = inputString.replace(/[^a-zA-Z0-9]/g, '').toLowerCase();
    const reversedString = cleanedString.split('').reverse().join('');
    
    return cleanedString === reversedString;
}

module.exports = isPalindrome;
