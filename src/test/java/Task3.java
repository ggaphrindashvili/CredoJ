import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("შეიყვანეთ პირველი რიცხვი: ");
        int num1 = scanner.nextInt();

        System.out.print("შეიყვანეთ მეორე რიცხვი: ");
        int num2 = scanner.nextInt();

        System.out.print("შეიყვანეთ ოპერაცია (+, -, *, //): ");
        String operator = scanner.next();

        int result = 0;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "//":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("ნულზე გაყოფა შეუძლებელია.");
                    return;
                }
                break;
            default:
                System.out.println("არასწორი ოპერატორი.");
                return;
        }
        System.out.println("შედეგი: " + result);

    }
}
