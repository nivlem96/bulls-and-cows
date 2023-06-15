package bullscows;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    private static final String possibleCharacters = "0123456789abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) {
        System.out.println("Please, enter the secret code's length:");
        try {
            int codeLength = scanner.nextInt();
            if (codeLength <= 0) {
                System.out.println("Error: can't generate a secret number with a length of " + codeLength + " because there won't be enough characters.");
                return;
            }else if (codeLength > 36) {
                System.out.println("Error: can't generate a secret number with a length of " + codeLength + " because there aren't enough unique digits.");
                return;
            }
            System.out.println("Please, enter the secret code's length:");
            int symbolLength = scanner.nextInt();
            if (symbolLength < codeLength) {
                System.out.println("Error: can't generate a secret number with a symbol length of " + codeLength + " because there won't be enough characters.");
                return;
            }else if (symbolLength > 36) {
                System.out.println("Error: can't generate a secret number with a symbol length of " + symbolLength + " because it exceeds the possible symbol length.");
                return;
            }
            String code = generateCode(codeLength, symbolLength);
            try{
                guessing(code, symbolLength);
                System.out.println("Congratulations! You guessed the secret code.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Error: Could not process input");
            return;
        }
    }

    public static String generateCode(int codeLength, int symbolLength) {

        ArrayList<Character> numbers = new ArrayList<Character>();
        StringBuilder code = new StringBuilder();
        StringBuilder secretCode = new StringBuilder();
        while (code.length() < codeLength) {
            Random rand = new Random();
            char ch = possibleCharacters.charAt(rand.nextInt(symbolLength));
            if (!numbers.contains(ch)) {
                numbers.add(ch);
                code.append(ch);
                secretCode.append('*');
                if (code.length() == codeLength) {
                    break;
                }
            }
        }
        secretCode.append(" (0-");
        if (symbolLength < 10) {
            secretCode.append(possibleCharacters.charAt(symbolLength - 1)).append(").");
        } else if (symbolLength == 10) {
            secretCode.append("9).");
        } else {
            secretCode.append("9), a-").append(possibleCharacters.charAt(symbolLength - 1)).append(").");
        }
        System.out.println("The secret is prepared: " + secretCode);
        return code.toString();
    }

    public static void guessing(String code, int symbolLength) throws Exception {
        int turn = 1;
        int bulls = 0;
        System.out.println("Okay, let's start a game!");
        String possibleCharacters = getPossibleString(symbolLength);
        while (bulls < code.length()) {
            int cows = 0;
            bulls = 0;
            System.out.println("Turn " + turn + ":");
            String guess = scanner.next();
            for (int i = 0; i < guess.length(); i++) {
                char ch = guess.charAt(i);
                if (possibleCharacters.indexOf(ch) == -1) {
                    throw new Exception("Error: " + guess + " isn't a valid number.");
                }else if (ch == code.charAt(i)) {
                    bulls++;
                } else if (code.indexOf(ch) != -1) {
                    cows++;
                }
            }
            System.out.print("Grade: ");
            if (cows == 0 && bulls == 0) {
                System.out.print("None. ");
            } else {
                if (bulls > 0 && bulls > 0) {
                    System.out.println(bulls + " bull(s) and " + cows + " cow(s).");
                } else if (bulls > 0) {
                    System.out.println(bulls + " bull(s).");
                } else if (cows > 0) {
                    System.out.println(cows + " cow(s).");
                }

            }
            turn++;
        }
    }

    public static String getPossibleString(int symbolLength) {
        return possibleCharacters.substring(0, symbolLength);
    }
}
