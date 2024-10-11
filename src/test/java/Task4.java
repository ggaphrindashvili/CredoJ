import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("შეიყვანეთ გაცვლის კურსი (USD-EUR): ");
        double exchangeRate = scanner.nextDouble();

        System.out.print("შეიყვანეთ თანხა USD-ში: ");
        double amountUSD = scanner.nextDouble();

        System.out.print("შეიყვანეთ საკომისიო პროცენტი: ");
        double feePercentage = scanner.nextDouble();

        double eurReceived = amountUSD * exchangeRate * (1 - (feePercentage / 100));

        System.out.println("ევროში მიღებული თანხა: " + eurReceived);

    }
}
