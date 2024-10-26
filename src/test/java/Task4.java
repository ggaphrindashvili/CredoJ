import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        int sum = 0;
        int i = 2;

        while (i <= n) {
            sum += i;
            i += 2;
        }

        System.out.println("Sum of even numbers between 1 and " + n + " is: " + sum);
        scanner.close();
    }
}
