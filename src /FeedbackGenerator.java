//Member 7
public class Feedback {

    public static void giveFeedback(double finalMarks) {

        if (finalMarks >= 85) {
            System.out.println("Feedback: Excellent performance! Keep it up!");
        } 
        else if (finalMarks >= 70) {
            System.out.println("Feedback: Good job! You can do even better.");
        } 
        else if (finalMarks >= 50) {
            System.out.println("Feedback: Average performance. Need improvement.");
        } 
        else {
            System.out.println("Feedback: Poor performance. Work harder!");
        }
    }
}

