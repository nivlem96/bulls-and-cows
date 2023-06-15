import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ticket = scanner.next();
        char[] characters = ticket.toCharArray();
        int sum1 = Character.getNumericValue(characters[0]) + Character.getNumericValue(characters[1]) + Character.getNumericValue(characters[2]);
        int sum2 = Character.getNumericValue(characters[3]) + Character.getNumericValue(characters[4]) + Character.getNumericValue(characters[5]);
        if(sum1 == sum2) {
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }
    }
}