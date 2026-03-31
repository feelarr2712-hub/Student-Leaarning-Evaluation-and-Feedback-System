  // Member 6: Method for Grade Calculation

    public class FinalScore{

      public static double getfinalScore(double assignmentScore , double examScore )
      { double finalScore = assignmentScore + examScore;
       return finalScore; }

    public static String calculateGrade(double finalScore) {

          String grade;

        if (finalScore >= 80) {
            grade = "A (Excellent)";
        } else if (finalScore >= 70) {
            grade = "B (Good)";
        } else if (finalScore >= 60) {
            grade = "C (Satisfactory)";
        } else if (finalScore >= 50) {
            grade = "D (Pass)";
        } else {
            grade = "F (Fail - Needs Improvement)";
        }
        return grade;
    }
}

