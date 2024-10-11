import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("შეიყვანეთ კონუსის რადიუსი (r): ");
        double r = scanner.nextDouble();

        System.out.print("შეიყვანეთ კონუსის სიმაღლე (h): ");
        double h = scanner.nextDouble();

        System.out.print("შეიყვანეთ კალთის სიმაღლე (s): ");
        double s = scanner.nextDouble();


        double surfaceArea = Math.PI * r * (r + s);

        double volume = (1.0 / 3) * Math.PI * Math.pow(r, 2) * h;

        System.out.println("კონუსსის ზედაპირის ფართობი: " + surfaceArea);
        System.out.println("კონუსის მოცულობა: " + volume);

    }
}
