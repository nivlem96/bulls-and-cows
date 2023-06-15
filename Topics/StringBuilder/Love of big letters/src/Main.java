import java.util.Scanner;

class EvenUpperCase {

    public static String upperEvenLetters(String message) {
        StringBuilder builder = new StringBuilder(message);
        for (int i = 0; i < builder.length(); i++) {
            if (i % 2 == 0) {
                char ch = builder.charAt(i);
                builder.setCharAt(i, Character.toUpperCase(ch));
            }
        }
        return builder.toString();
    }

    // Don't change the code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.next();

        System.out.println(upperEvenLetters(message));
    }
}