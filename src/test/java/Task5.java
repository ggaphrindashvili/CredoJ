import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Random random = new Random();

        int randomNumber = random.nextInt(50) + 1;

        Scanner scanner = new Scanner(System.in);

        int guess = 0;

        System.out.println("Guess the number between 1 and 50:");

        while (guess != randomNumber) {
            guess = scanner.nextInt();

            if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Correct! The number was " + randomNumber);
            }
        }
        scanner.close();
    }
}
