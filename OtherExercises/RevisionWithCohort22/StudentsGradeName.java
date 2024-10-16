public class StudentsGradeName {
    public static void main (String[] args) {

        Object[][][] studentsData = {
            { {"Alice"}, {78, 89, 98, 30} },
            { {"Bob"}, {87, 78, 67, 47} },
            { {"Charlie"}, {99, 100, 100, 100} },
            { {"Diana"}, {92, 88, 90, 67} }
        };

        int studentIdNum = 1;

        for (Object[][] student : studentsData) {
            String studentName = (String) student[0][0];
            int[] grades = (int[]) student[1];
            
            int totalSubjectScores = 0;
            for (int subjectScore : grades) {
                totalSubjectScores += subjectScore;
            }

            double averageOfSubjectScores = (double) totalSubjectScores / grades.length;

            // Print the student's details, formatted to 2 decimal places
            System.out.printf("Student %d (%s) got a total score of %d from %d subject(s) and has an average score of: %.2f%n%n", 
                studentIdNum, studentName, totalSubjectScores, grades.length, averageOfSubjectScores);

            studentIdNum++;
        }
    }
}
