function sum(a, b) {
	return a + b;
}



function subtract(number1, number2) {
	return number1 - number2;
}

function evenNumbers(arr){
	let newArray = [];
	for(let number of arr){
	  if(number % 2 == 0) {
	  newArray.push(number)
	}
     }
     return newArray;
}

module.exports = {sum, subtract, evenNumbers};