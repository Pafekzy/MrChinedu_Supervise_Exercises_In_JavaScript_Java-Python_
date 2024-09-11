public class AllPatternInOneLineChap5 {
    public static void main (String[] args) {

	int fixedNum1 = 11;
	int fixedNum2 = 10;
	int fixedNum3 = 1;
	int fixedNum4 = 0;

	
	for (int outerCount = 10; outerCount >= 1 ; outerCount--){

	    for (int innerCount1 = 1; innerCount1 <= (fixedNum1 - outerCount); innerCount1++ ){ 
		System.out.print("* ");
	    }
	    for (int innerSpaceCount2 = 1; innerSpaceCount2 <= outerCount; innerSpaceCount2++ ){ 
		System.out.print("  ");
	    }
	    for (int innerCount3 = 1; innerCount3 <=  ((outerCount+1) - fixedNum3); innerCount3++ ){ 
		System.out.print("* ");
	    }
	    for (int innerSpaceCount4 = 1; innerSpaceCount4 <= (fixedNum1 - outerCount); innerSpaceCount4++ ){ 
		System.out.print("   ");
	    }
	    for (int innerSpaceCount5 = 1; innerSpaceCount5 <= (fixedNum1 - outerCount); innerSpaceCount5++ ){ 
		System.out.print(" ");
	    }
	    for (int innerSpaceCount6 = 1; innerSpaceCount6 <= outerCount; innerSpaceCount6++ ){ 
		System.out.print("* ");
 	    }
	    for (int innerSpaceCount6 = 1; innerSpaceCount6 <=  ((outerCount+1) - fixedNum3); innerSpaceCount6++ ){ 
		System.out.print("  ");
	    }
	    for (int innerSpaceCount7 = 1; innerSpaceCount7 <= (fixedNum1 - outerCount); innerSpaceCount7++ ){ 
		System.out.print("* ");
	    }







	    System.out.println();
	}
	

}
}