function printPatternsOnSameLines() {
    let fixedNum1 = 11;
    let fixedNum2 = 1;

    for (let outerCount = 10; outerCount >= 1; outerCount--) {
        let rowPattern = "";
        for (let innerCount1 = 1; innerCount1 <= (fixedNum1 - outerCount); innerCount1++) {
            rowPattern += "* ";
        }
        for (let innerSpaceCount2 = 1; innerSpaceCount2 <= outerCount; innerSpaceCount2++) {
            rowPattern += "  ";
        }
        for (let innerCount3 = 1; innerCount3 <= (outerCount + 1 - fixedNum2); innerCount3++) {
            rowPattern += "* ";
        }
        for (let innerSpaceCount4 = 1; innerSpaceCount4 <= (fixedNum1 - outerCount); innerSpaceCount4++) {
            rowPattern += "   ";
        }
        for (let innerSpaceCount5 = 1; innerSpaceCount5 <= (fixedNum1 - outerCount); innerSpaceCount5++) {
            rowPattern += " ";
        }
        for (let innerSpaceCount6 = 1; innerSpaceCount6 <= outerCount; innerSpaceCount6++) {
            rowPattern += "* ";
        }
        for (let innerSpaceCount7 = 1; innerSpaceCount7 <= (outerCount + 1 - fixedNum2); innerSpaceCount7++) {
            rowPattern += "  ";
        }
        for (let innerSpaceCount8 = 1; innerSpaceCount8 <= (fixedNum1 - outerCount); innerSpaceCount8++) {
            rowPattern += "* ";
        }

        console.log(rowPattern);
    }
}

printPatternsOnSameLines();
