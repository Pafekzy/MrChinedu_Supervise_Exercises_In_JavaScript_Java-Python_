function sumOfElementsInPairsToAnewArray(numberArray) {
  let sumResultArray = [];
  
  for (let index = 0; index < numberArray.length; index += 2) {
      if (index + 1 < numberArray.length) {
          sumResultArray.push(numberArray[index] + numberArray[index + 1]);
      } 
      else {
          sumResultArray.push(numberArray[index]);  
      }
      }
  
  return sumResultArray;
 }

module.exports = sumOfElementsInPairsToAnewArray;
