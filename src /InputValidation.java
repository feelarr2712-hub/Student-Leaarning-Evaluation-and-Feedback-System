
//Member 3

import java.util.Scanner;


public class InputValidation
{

   Scanner in = new Scanner(System.in);

    System.out.println("Enter your assignment marks: ");
    System.out.print("Enter yor exam number");

    double marks = in.nextInt();

    static double Validate()
    {
        double marks = 0;

        while (marks >= 0 && marks <= 100)
            return marks;
    }
    static String Validate()
    {
        double marks = 0;
        if(marks < 0 || marks > 100)
            return "Invalid , /n Try again";
    }
}
