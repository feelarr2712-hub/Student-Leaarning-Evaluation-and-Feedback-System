//Member 5

import java.util.Scanner;

public class ExamEvaluation {

 

   static int GetExam() {

       Scanner input = new Scanner(System.in);

 

       System.out.print("Enter ExamMarks: ");

       double ExamMarks = input.nextDouble();
 

       // Apply weightage

       double ExamPercentage = (ExamMarks * 0.6);

 

       System.out.println("Exam score: " + ExamPercentage + "%");

   }

}


  
