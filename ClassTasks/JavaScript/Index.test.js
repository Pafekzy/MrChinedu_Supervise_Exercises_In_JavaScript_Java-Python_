const {sum, subtract, evenNumbers} = require('./sum.js');
let numberOne = 2;
let numberTwo = 29;


test("sum two numbers",()=>{
	let result = sum(numberOne, numberTwo);
	let expected = 31;
	expect(result).toBe(expected)
}); 



test("subtract two numbers",()=> {
	let result = subtract(numberOne, numberTwo);
	let expected = -27;
	expect(result).toBe(expected)
});


test("evenNumbers",()=> {
	let arrayOfNumbers = [1, 2, 3, 4, 5, 6];
	let result = evenNumbers(arrayOfNumbers);
	expect(result).toEqual([2,4,6]);
});