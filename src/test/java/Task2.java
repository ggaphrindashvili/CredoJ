import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("შეიყვანე ასო: ");

        char ch = scanner.next().charAt(0);


            switch (Character.toLowerCase(ch)) {
                case 'a':
                    case 'e':
                        case 'i':
                            case 'o':
                                case 'u':
                case 'A':
                    case 'E':
                        case 'I':
                            case 'O':
                                case 'U':
                                    System.out.printf(ch + "is a vowel");
                                    break;
                                    default:
                                        System.out.printf(ch + "is a consonant");
                                        break;
            }

    }
}
