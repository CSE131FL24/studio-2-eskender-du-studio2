package studio2;

import java.util.Random;

public class Pi {
    public static void main(String[] args) {
        int totalDarts = 10000; 
        int dartsInsideCircle = 0;
        Random rand = new Random();

        for (int i = 0; i < totalDarts; i++) {
            double x = rand.nextDouble();
            double y = rand.nextDouble();

            if (x * x + y * y <= 0.25) {
                dartsInsideCircle++;
            }
        }

        double piEstimate = (4.0 * dartsInsideCircle) / totalDarts;
        System.out.println("Estimated value of Pi: " + piEstimate);
    }
}
