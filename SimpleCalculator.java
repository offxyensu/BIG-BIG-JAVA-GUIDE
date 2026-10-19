import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validOperation = true;
        //looks if the Operation does exist

        System.out.print("Enter first num: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, /, *. ^, % (mod): ");
        operator = scanner.next().charAt(0);
        //only takes the first char

        System.out.print("Enter second num: ");
        num2 = scanner.nextDouble();

        System.out.print(num1 + "" + " " + operator + " " + "" + num2 + " = ");

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '/' -> {
                if(num2 == 0){
                    System.out.println("Cannot divide by zero!");
                    validOperation = false;
                    //If num2 = 0, a text will be displayed as well as set validOperation to false
                }
                else{
                    result = num1 / num2;
                }
            }

            case '*' -> result = num1 * num2;
            case '^' -> result = Math.pow(num1, num2);
            case '%' -> result = num1 % num2;
            default -> {
                System.out.print("Invalid operator!");
                validOperation = false;
                //If the Operator is not in any of these cases, a text will be displayed as well as set validOperation to false
            }
        }

        if(validOperation){
            System.out.println(result);
            //if validOperation would be false, a result won't be displayed.
        }

        scanner.close();

    }
}
