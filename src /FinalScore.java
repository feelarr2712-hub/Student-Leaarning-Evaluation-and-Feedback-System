  // Member 6: Method for Grade Calculation

    public class FinalScore{

    public static String calculateGrade(double totalScore) {
        String grade;
        if (totalScore >= 80) {
            grade = "A (Excellent)";
        } else if (totalScore >= 70) {
            grade = "B (Good)";
        } else if (totalScore >= 60) {
            grade = "C (Satisfactory)";
        } else if (totalScore >= 50) {
            grade = "D (Pass)";
        } else {
            grade = "F (Fail - Needs Improvement)";
        }
        return grade;
    }
}
