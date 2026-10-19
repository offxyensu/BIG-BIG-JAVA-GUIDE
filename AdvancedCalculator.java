import java.util.Scanner;



public class AdvancedCalculator {



    public static Scanner scanner = new Scanner(System.in);



// ENHANCED CALCULATOR JAVA

    public static void main(String[] args) {







// DECLARE VARIABLES





        double[] numbers = {}; //This will hold all numbers to calculate

        String operator;

        String[] operators; // This will hold all operators to calculate

        String fill;



        int amountNumber; // declares the amount of numbers getting calculated

        int amountOperators; // declares the amount of operators (amount of numbers - 1)



// ASK FOR NUMBER



        System.out.print("How # numbers do you want to calculate?: ");

        amountNumber = scanner.nextInt();





        numbers = new double[amountNumber]; // numbers[] size can now hold all numbers in it

        amountOperators = amountNumber - 1; // now calculates the amount of operators required

        operators = new String[amountOperators]; // operators[] can now hold all operators in it





        for (int i = 0; i < numbers.length; i++) { // for each element within numbers[]



            System.out.print("Enter your number: ");

            numbers[i] = scanner.nextDouble(); // input will be assigned to numbers at the index of i

            scanner.nextLine(); // scanner.nextine() clears any \n just in case-





// ASK FOR OPERATOR

            if(i != numbers.length - 1){ // if i is not equal to the numbers.length - 1

// basically operators.length but I sat 1 hour for these 3 lines-



                System.out.print("Enter your Operator (+, -, *, /): ");

                operators[i] = scanner.nextLine(); // input will be assigned to operators at the index of i

            }

        }





        double finalResult = calculationResult(numbers, operators); // calling our calculationResult-method

// as well as giving it numbers and operators with it

        System.out.println("Result: " + finalResult); // result get printed

    }



// CALCULATION - METHOD

    static double calculationResult(double numbers[], String operator[]){ // static so it can uses numbers and operator



        double result = numbers[0]; // result is declared early so that the return as well as the switch can work



// LOOP

// FOR EACH ELEMENT IN BOTH ARRAYS



        for(int i = 0; i < operator.length; i++){ // for each element in operator

// ENHANCED SWITCHES

            switch (operator[i]){ // switch for operator at the index of i

                case "+" -> result += numbers[i + 1]; // adds

                case "-" -> result -= numbers[i + 1]; // substracts

                case "*" -> result *= numbers[i + 1]; // multiplies

                case "/" -> result /= numbers[i + 1]; // divides

                default -> System.out.println("INVALID OPERATOR"); // if anything else has been written as operator

// now it would say that it is invalid

            }

        }

        return result; // returns result

    }



}