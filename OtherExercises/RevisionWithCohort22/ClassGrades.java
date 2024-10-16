public class ClassGrades {
    public static void main (String[] args) {

        int[][] classGrades = {
                              {85,90,75,65,82,67,67},
                              {89,67,78,87,87},
                              {78,76,87,98,76,87,76},
                              {45,64,76,74,31,50,52},
                              {76,67,87,98,76}
        };

        int studentId = 1;
        for (int[] studentGrade : classGrades){

        int studentTotalScore = 0;

            for(int studentScore : studentGrade ){
                studentTotalScore += studentScore;     
                  }

            double averageStudentScore = ((double)studentTotalScore / studentGrade.length) ;
            
            System.out.printf("Student%d has a total of %d subjects, with a total score of %d, and finally an average of : %.3f %n%n ",
                              studentId,studentGrade.length,studentTotalScore, averageStudentScore);

	    studentId++ ;
        }

    }


}