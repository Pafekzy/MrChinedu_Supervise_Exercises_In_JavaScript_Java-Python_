public class StudentsGradeExplaination {
    public static void main(String[] args){


        int[][] classGrades = {
                                { 54,55,56,65,67 },
                                { 76,67,65,56,55 },
                                { 65,56,67,65,78 }
        };

         int studentIdNum = 1;

         for( int[]studentGrade : classGrades ) {             
             int studentTotalScore = 0;  
    
             for( int studentScore : studentGrade ){
                 studentTotalScore += studentScore;
             }
             
             double studentAverageScore =  ((double)studentTotalScore / studentGrade.length) ;   

             System.out.printf("Student %d got a total score of %d from %d subject(s) and has an average score of: %.2f%n%n", 
                                studentIdNum, studentTotalScore, studentGrade.length, studentAverageScore);          
                               
             studentIdNum++;
	}
}

}