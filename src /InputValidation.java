//Member 3

import java.util.Scanner;


public class InputValidation {

   static void InputValidation()
    {
        double assignment = 0;
        double exam = 0;



        Scanner in = new Scanner(System.in);
        System.out.println("Enter assignment");
        assignment = in.nextDouble();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter student exam");
        exam = input.nextDouble();



        if (assignment < 0 || assignment > 100)
            System.out.println("Invalid,\nTry again");
        if (exam < 0 || exam > 100)
            System.out.println("Invalid \nTry again");
        else
            System.out.println("Loading...");



    }
}
