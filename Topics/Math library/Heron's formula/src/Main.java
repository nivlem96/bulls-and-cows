import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double p = (a + b + c) / 2.0;
        System.out.println(Math.sqrt(p*(p-a)*(p-b)*(p-c)));
    }
}