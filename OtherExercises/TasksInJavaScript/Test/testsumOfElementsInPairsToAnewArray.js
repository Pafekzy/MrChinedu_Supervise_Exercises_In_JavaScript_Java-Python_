const sumOfElementsInPairsToAnewArray = require('./sumOfElementsInPairsToAnewArray');

test("sum two numbers",()=>{
  const inputNumbers = [2, 3, 4, 5, 6, 7];
  const expectedSumOutput = [5, 9, 15];
  
  const actualSumResult = sumOfElementsInPairsToAnewArray(inputNumbers);
  expect(actualSumResult).toBe(expectedSumOutput)
});