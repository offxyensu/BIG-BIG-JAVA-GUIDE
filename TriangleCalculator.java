import java.util.Scanner;

public class TriangleCalculator {

    public static void  main(String[] args){

        //Triangle Calc (Pythagoras formula: c = Math.sqrt(Math.pow(Adjacant Side + Opposite Sife, 2))

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        double adjacentSide;
        double oppositeSide;
        double hypotenouse;

        System.out.println("Enter your value of the adjacent side: ");
        adjacentSide = scanner.nextDouble();

        System.out.println("Enter your value of opposite side: ");
        oppositeSide = scanner.nextDouble();

        hypotenouse = Math.sqrt(Math.pow(adjacentSide + oppositeSide, 2));

        System.out.printf("The Hypotenouse is %.2f cm.", hypotenouse);


        scanner.close();
        scanner1.close();






    }
}
