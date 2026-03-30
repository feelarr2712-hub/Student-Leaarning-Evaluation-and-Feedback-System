//Member1 
import java.util.Scanner;

public class Main
{
    public static void main(String[]args)
    {


        Student s = new Student();
        int choice ;

        System.out.println("----MENU-----");
        System.out.println("1. Add Student");
        System.out.println("2. Enter Marks");
        System.out.println("3. Calculate Result");
        System.out.println("4. Display Feedback");
        System.out.println("5. Exit");

        System.out.println("Enter your choice: ");
        Scanner in = new Scanner(System.in);
        choice = in.nextInt();


        switch(choice) {
            case 1: {
                System.out.println("Enter Name: ");
                s.Name = in.nextLine();

                System.out.println("Enter StudentID: ");
                s.StudentID = in.nextLine();

                System.out.println("Enter course: ");
                s.CourseName = in.nextLine(); }
                break;
            case 2: {
                System.out.println("Enter Assignment1: ");
                s.Assignment1 = in.nextInt();
                
                System.out.println("Enter Assignment2: ");
                s.Assignment2 = in.nextInt();
                
                System.out.println("Enter Assignment3: ");
                s.Assignment3 = in.nextInt();
                        
                System.out.println("Enter Exam: ");
                s.Exam = in.nextInt(); }
                break;
            case 3:
                System.out.println("calculate FinalScore");
                break;
            case 4:
                System.out.println("Display Feedback");
                break;
            case 5:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid input. /n Try again");
        }

    }
}
