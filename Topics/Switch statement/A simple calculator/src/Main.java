import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number1 = scanner.nextLong();
        char operator = scanner.next().charAt(0);
        long number2 = scanner.nextLong();
        switch (operator) {
            case '+':
                System.out.println(number1 + number2);
                break;
            case '-':
                System.out.println(number1 - number2);
                break;
            case '*':
                System.out.println(number1 * number2);
                break;
            case '/':
                if(number2 == 0) {
                    System.out.println("Division by 0!");
                    break;
                }
                System.out.println(number1 / number2);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}