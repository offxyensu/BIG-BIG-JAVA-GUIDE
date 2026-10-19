import java.util.Scanner;

public class CircleCalc {

    public static void main(String[] args){

        //circumference = 2 * Math.PI * radius;
        // area = Math.PI * Math.Pow(radius, 2);
        // volume = (4 / 3) * Math.PI * Math.pow(radius, 3)

        Scanner scanner = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.println("Enter the value of your radius: ");
        radius = scanner.nextDouble();;

            circumference = 2 * Math.PI * radius;
            System.out.printf("The circumference is %.2f\n", circumference);

            area = Math.PI * Math.pow(radius, 2);
            System.out.printf("The area is %.2f\n", area);

            volume = (4.0 / 3.0 ) * Math.PI * Math.pow(radius,  3);
            System.out.printf("The volume is %.2f\n", volume);



        scanner.close();


    }
}
