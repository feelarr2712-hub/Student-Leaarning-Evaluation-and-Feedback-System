//Member1 

import java.util.Scanner;

public class Main {

     static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Student s = new Student();
        int choice;

        boolean name = false;
        boolean marks = false;
        boolean calculate = false;

        while (true) {
            System.out.println("----MENU-----");
            System.out.println("1. Add Student");
            System.out.println("2. Enter Marks");
            System.out.println("3. Calculate Result");
            System.out.println("4. Display Feedback");
            System.out.println("5. Exit");

            System.out.println("Enter your choice: ");

            choice = in.nextInt();
            in.nextLine();


            switch (choice) {
                case 1: {
                    System.out.println("Enter Name: ");
                    s.Name = in.nextLine();

                    System.out.println("Enter StudentID: ");
                    s.StudentID = in.nextLine();

                    System.out.println("Enter Course: ");
                    s.CourseName = in.nextLine();
                }
                name = true;
                break;
                case 2: {
                    if(!name) {
                        System.out.println("⚠ Please add student first!");
                        break; }

                    double assignment1;
                    do {
                        System.out.print("Enter Assignment1: ");
                        assignment1 = in.nextDouble();

                        if (!InputValidation.getValidmark(assignment1)) {
                            System.out.println("Invalid!. \n Try again.");
                        }

                    } while (!InputValidation.getValidmark(assignment1));

                    s.Assignment1 = assignment1;


                    double assignment2;

                    do {
                        System.out.print("Enter Assignment2: ");
                        assignment2 = in.nextDouble();

                        if (!InputValidation.getValidmark(assignment2)) {
                            System.out.println("Invalid!. \n Try again.");
                        }

                    } while (!InputValidation.getValidmark(assignment2));

                    s.Assignment2 = assignment2;


                    double assignment3;

                    do {
                        System.out.print("Enter Assignment3: ");
                        assignment3 = in.nextDouble();

                        if (!InputValidation.getValidmark(assignment3)) {
                            System.out.println("Invalid!. \n Try again.");
                        }

                    } while (!InputValidation.getValidmark(assignment3));

                    s.Assignment3 = assignment3;

                    double exam;

                    do {
                        System.out.print("Enter Exam: ");
                        exam = in.nextDouble();

                        if (!InputValidation.getValidmark(exam)) {
                            System.out.println("Invalid!. \n Try again.");
                        }

                    } while (!InputValidation.getValidmark(exam));

                    s.Exam = exam;
                }
                marks = true;
                break;
                case 3:
                    if(!marks) {
                        System.out.println("⚠ Please add student info first!");
                        break; }

                    // Assignment wight
                    double assignmentMarks = AssignmentEvaluation.getAssignment(s.Assignment1, s.Assignment2, s.Assignment3);
                    System.out.println("Assignment Average = " + assignmentMarks);

                    double assignmentScore = AssignmentEvaluation.getAssignment(s.Assignment1, s.Assignment2, s.Assignment3);
                    System.out.println("Assignment Score = " + assignmentScore + '%');

                    // Exam weight
                    double examScore = ExamEvaluation.getExam(s.Exam);
                    System.out.println("ExamScore = " + examScore + '%');

                    // Final Score
                    double finalScore = FinalScore.getfinalScore(assignmentScore, examScore);
                    s.finalScore = finalScore;
                    System.out.println("Student Score = " + finalScore + '%');

                    String grade = FinalScore.calculateGrade(s.finalScore);
                    s.grade = grade;
                    System.out.println("Grade : " + grade);

                    calculate = true;
                    break;
                case 4:
                    if(!calculate) {
                        System.out.println("There is nothing to show!");
                        break; }

                    String feedback = FeedbackGenerator.Feedback(s.finalScore);
                    s.feedback = feedback;
                    System.out.println("Feedback: " + feedback);

                    Display.displaySummary(s);
                    break;
                case 5:
                    System.out.println("Exit");
                    return;

                default:
                    System.out.println("Invalid input. /n Try again");


            }
        }
    }
}
