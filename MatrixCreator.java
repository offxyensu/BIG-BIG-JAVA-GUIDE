import java.util.Scanner;

public class MatrixCreator {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int rows;
        int collums;
        char symbol;

        System.out.print("Enter the number of rows: ");
        rows = scanner.nextInt();
        System.out.print("Enter the number of collums: ");
        collums = scanner.nextInt();
        System.out.print("Enter the symbol of use: ");
        symbol = scanner.next().charAt(0);

        for(int j = 0; j < rows; j++){
            for(int i = 0; i < collums; i++){
                System.out.print(symbol);
            }
            System.out.println();

        }

        scanner.close();

    }
}
