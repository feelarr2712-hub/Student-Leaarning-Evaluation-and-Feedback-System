public class FeedbackGenerator {

    public static void main(String[] args) {

        // Sample data (this will come from other members in real system)
        String name = "John";
        double finalScore = 78;

        // Feedback logic
        if (finalScore >= 85) {
            System.out.println(name + " - Excellent performance! Keep up the great work.");
        }
        else if (finalScore >= 70) {
            System.out.println(name + " - Good job! You are doing well, but there is room for improvement.");
        }
        else if (finalScore >= 50) {
            System.out.println(name + " - Fair performance. You should work harder to improve your results.");
        }
        else {
            System.out.println(name + " - Poor performance. Immediate improvement is needed. Please seek help.");
        }
    }
}

