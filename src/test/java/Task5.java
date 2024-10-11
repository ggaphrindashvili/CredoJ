import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] scores = new double[5];
        double[] weights = new double[5];
        double weightedSum = 0;
        double totalWeights = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter score " + (i+1) + ": ");
            scores[i] = scanner.nextDouble();
            System.out.println("Enter weight for score " + (i+1) + ": ");
            weights[i] = scanner.nextDouble();

            weightedSum += scores[i] * weights[i];
            totalWeights += weights[i];
        }

        double weightedAverage = weightedSum / totalWeights;

        System.out.println("The weighted average is: " + weightedAverage);
        scanner.close();

    }
}
