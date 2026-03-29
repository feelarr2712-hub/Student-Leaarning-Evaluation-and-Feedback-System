
//Member 3

public class InputValidation {


    static double Input() {

        double marks = 0;

        while (marks >= 0 && marks <= 100) {
           System.out.print(marks);
            marks++;
        }
        return marks;
    }

    static String Validate() {
        double marks = 0.0 ;
        if (marks > 100 || marks < 0) 
            System.out.println("Invalid , /n Try again") ;
        return"";
    }

}
