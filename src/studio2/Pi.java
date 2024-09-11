package studio2;

import java.util.Random;

public class Pi {
    public static void main(String[] args) {
        int totalThrows = 1000000; 
        int insideCircle = 0;

        Random rand = new Random();

        for (int i = 0; i < totalThrows; i++) {
            double x = rand.nextDouble(); 
            double y = rand.nextDouble();  

            if (x * x + y * y <= 1) {
                insideCircle++;
            }
        }

        double piEstimate = 4.0 * insideCircle / totalThrows;
        System.out.println("Estimated Pi: " + piEstimate);
    }
}
