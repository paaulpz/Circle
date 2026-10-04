package circle;

import java.util.InputMismatchException;
import java.util.Scanner;



/**
 * The Class Main.
 */
public class Main {

    
    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter x: ");
            double x = scanner.nextDouble();

            System.out.print("Enter y: ");
            double y = scanner.nextDouble();

            System.out.print("Enter radius: ");
            double radius = scanner.nextDouble();

            if (radius <= 0) {
                System.out.println("Radius must be greater than 0.");
                return;
            }

            Circle circle = new Circle(x, y, radius);

            System.out.println("Diameter: " + circle.diameter());
            System.out.println("Circumference: " + circle.circumference());
            System.out.println("Area: " + circle.area());

        } catch (InputMismatchException e) {
            System.out.println("Please enter numbers.");
        }

        scanner.close();
    }
}