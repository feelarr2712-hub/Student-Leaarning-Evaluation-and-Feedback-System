// Member 7

public class FeedbackGenerator {

    static String Feedback (double finalScore) {

        // Sample data (this will come from other members in real system)




        // Feedback logic
        if (finalScore >= 80) {
            return " - Excellent performance! Keep up the great work.";
        }
        else if (finalScore >= 70) {
            return " - Good, but there is room for improvement.";
        }
        else if  (finalScore >= 60) {
            return " - It's not bad ,but it's not good either.You can improve with more effort. ";
        }

        else if (finalScore >= 50) {
            return " - Fair performance. You should work harder to improve your results.";
        }
        else {
            return " - Poor performance. Immediate improvement is needed. Please seek help.";
        }

    }
}

