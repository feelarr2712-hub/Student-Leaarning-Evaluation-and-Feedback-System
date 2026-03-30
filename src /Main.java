//Member1 
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Student s = new Student();
        int choice;

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

                    System.out.println("Enter course: ");
                    s.CourseName = in.nextLine();
                }
                break;
                case 2: {
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
                break;
                case 3:
                    System.out.println("calculate FinalScore");
                    break;
                case 4:
                    System.out.println("Display Feedback");
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
