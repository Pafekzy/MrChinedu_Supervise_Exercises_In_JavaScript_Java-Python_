public class StudentsGrade {
    public static void main (String[] args) {

        int[][] multipleGrades = {
				    {90, 89, 98},
				    {87, 78, 67, 99},
				    {100, 100, 100, 100, 100},
				    {92, 88, 90, 67, 84, 56}
        };

        int studentIdNum = 1;

        for (int[] individualStudentGrade : multipleGrades) {
            System.out.println();

            int totalSubjectScores = 0;

            for (int subjectScore : individualStudentGrade) {
                totalSubjectScores += subjectScore;
            }

            double averageOfSubjectScores = (double) totalSubjectScores / individualStudentGrade.length;

            // Corrected printf: Replaced %s with %d for studentIdNum and totalSubjectScores
            System.out.printf("Student %d got a total score of %d from %d subject(s) and has an average score of: %.2f%n%n", 
                              studentIdNum, totalSubjectScores, individualStudentGrade.length, averageOfSubjectScores);

            studentIdNum++;
        }
    }
}
