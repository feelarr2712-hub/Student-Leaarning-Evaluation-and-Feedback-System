//Member 
public class Student {

    // Attributes
    private String studentID;
    private String name;
    private String courseName;

    private double assignment1;
    private double assignment2;
    private double assignment3;
    private double examMark;
    private double finalScore;

    // Constructor
    public Student(String studentID, String name, String courseName,
                   double assignment1, double assignment2, double assignment3,
                   double examMark) {

        this.studentID = studentID;
        this.name = name;
        this.courseName = courseName;
        this.assignment1 = assignment1;
        this.assignment2 = assignment2;
        this.assignment3 = assignment3;
        this.examMark = examMark;

        calculateFinalScore();
    }

    // Method to calculate final score
    public void calculateFinalScore() {
        double assignmentAverage = (assignment1 + assignment2 + assignment3) / 3;

        // Example weighting:
        // 40% assignments + 60% exam
        this.finalScore = (assignmentAverage * 0.4) + (examMark * 0.6);
    }

    // Display method
    public void displayStudent() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Course: " + courseName);

        System.out.println("Assignment 1: " + assignment1);
        System.out.println("Assignment 2: " + assignment2);
        System.out.println("Assignment 3: " + assignment3);

        System.out.println("Exam Mark: " + examMark);
        System.out.println("Final Score: " + finalScore);
    }
}

public class Student {} 
