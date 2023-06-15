import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random generator = new Random();
        int a = generator.nextInt(3);
        int b = generator.nextInt(2) + 1;
        int c = generator.nextInt(4);
        System.out.println(a + " " + b + " " + c);
    }
}