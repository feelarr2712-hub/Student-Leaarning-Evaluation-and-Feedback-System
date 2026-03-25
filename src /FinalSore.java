import java.util.Scanner; // Tani waa muhiim si Scanner-ku u shaqeeyo

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Member 3: Input
        System.out.print("Enter Student Name: ");
        String name = input.nextLine();

        System.out.print("Enter Assignment Marks (0-100): ");
        double assignmentMarks = input.nextDouble();

        System.out.print("Enter Exam Marks (0-100): ");
        double examMarks = input.nextDouble();

        // Member 4, 5 & 6: Calculate Final Score (Weightage: 40% Assignments, 60% Exam)
        double finalScore = (assignmentMarks * 0.4) + (examMarks * 0.6);

        // Member 6: Determine Grade
        String grade = calculateGrade(finalScore);

        // Member 8: Display Summary
        System.out.println("\n--- Academic Result Summary ---");
        System.out.println("Student Name : " + name);
        System.out.println("Final Score  : " + finalScore + "%");
        System.out.println("Final Grade  : " + grade);

        input.close();
    }

    // Member 6: Method for Grade Calculation
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
