function isPalindrome(string) {
    let cleanedString = string.replace(/[^a-zA-Z0-9]/g, '').toLowerCase();
    let reversedString = cleanedString.split('').reverse().join('');
    return cleanedString === reversedString;
}

module.exports = isPalindrome;
