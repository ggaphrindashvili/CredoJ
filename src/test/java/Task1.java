import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value for a (a ≠ 0): ");
        double a = scanner.nextDouble();
        System.out.print("Enter value for b (b ≠ 0): ");
        double b = scanner.nextDouble();
        System.out.print("Enter value for c (c ≥ 0): ");
        double c = scanner.nextDouble();

        if (a == 0 || b == 0 || c < 0) {
            System.out.println("Invalid input: a ≠ 0, b ≠ 0, and c ≥ 0 must hold.");
        } else {
            // Calculate the expression
            double numerator = Math.pow(a, 3) + Math.pow(b, 2) - Math.sqrt(c);
            double denominator = (a * b) + c;
            double x = numerator / denominator;
            // Output the result
            System.out.println("The result of the expression is: " + x);

            scanner.close();

        }
    }
}
