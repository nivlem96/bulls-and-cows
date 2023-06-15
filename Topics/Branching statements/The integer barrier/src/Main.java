import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int sum = 0;
        while (input != 0) {
            sum += input;
            if(sum >= 1000) {
                sum -= 1000;
                break;
            }
            input = scanner.nextInt();
        }
        System.out.println(sum);
    }
}