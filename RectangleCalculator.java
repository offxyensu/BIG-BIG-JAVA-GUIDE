import java.util.Scanner;

public class RectangleCalculator {

    public static void main(String[] args) {

        //Calculation of a rectangle:
        System.out.print("We are now calculating the area of a rectangle\n");

        Scanner scanner = new Scanner(System.in);
        double width = 0;
        double height = 0;
        double area = 0;

        System.out.print("Enter your width: ");
        width = scanner.nextDouble();

        System.out.print("Enter your height: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("The area of your rectangle is: " + area + "cm^2");

        scanner.close();


    }
}
