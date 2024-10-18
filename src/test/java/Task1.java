import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the score: ");
        int Grade = scanner.nextInt();

        if (Grade >= 90 && Grade <= 100) {
            System.out.println("Grade A: " + Grade);



        }else if (Grade >= 80 && Grade <= 89) {
            System.out.println("Grade B: " + Grade);

        }
        else if (Grade >= 70 && Grade <= 79) {
            System.out.println("Grade C: " + Grade);
        }
        else if (Grade >= 60 && Grade <= 69) {
            System.out.println("Grade D: " + Grade);
        }
        else if (Grade >= 1 && Grade <= 60) {
            System.out.println("Grade F: " + Grade);
        }
        scanner.close();
    }
}
