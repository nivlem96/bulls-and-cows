import java.awt.geom.Point2D;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double vx = in.nextDouble(); // Example vector 1 with components (3, 4)
        double vy = in.nextDouble(); // Example vector 1 with components (3, 4)
        double ux = in.nextDouble(); // Example vector 1 with components (3, 4)
        double uy = in.nextDouble(); // Example vector 1 with components (3, 4)
        double num = (vx*ux + vy*uy);
        double den = (Math.sqrt(Math.pow(vx, 2) + Math.pow(vy, 2)) * (Math.sqrt(Math.pow(ux, 2) + Math.pow(uy, 2))) );
        double cos =  num / den;
        double acos = Math.acos(cos);
        double degrees = Math.toDegrees(acos);
        System.out.println(degrees);
    }
}