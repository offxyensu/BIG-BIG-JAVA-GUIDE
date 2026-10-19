public class JavaMathClass {

    public static void main(String[] args){

        //The BUILD-IN value of PI:

        System.out.println("Using Math.PI, you can get Pi directly:");
        System.out.println(Math.PI);

        //The BUILD-IN value of e:

        System.out.println("Same goes for Euler's number via Math.E:");
        System.out.println(Math.E);

        //Calculating exponents:

        System.out.println("Using Math.pow(a, e), you get a^e:");
        double resultPow;
        resultPow = Math.pow(2 ,3);
        //Use double here, makes it easier
        System.out.println(resultPow);

        //Calculating Squareroot:

        System.out.println("You can also calculate the Squareroot of a number using Math.sqrt(), here it is 9");
        double resultSqrt;
        resultSqrt = Math.sqrt(9);
        System.out.println(resultSqrt);

        //Calculating the absolute value:

        System.out.println("The absolute value gives the total distance of x to 0, using negative numbers turns them positive: ");
        double resultAbs;
        resultAbs = Math.abs(-5);
        System.out.println("The absolute value of -5 is "+ resultAbs + ".");

        //Rounding up numbers:

        System.out.println("You can also round numbers.");
        double resultRound;
        resultRound = Math.round(3.12);
        System.out.println("3,12 is rounded to " + resultRound + ".");

        System.out.println("You can also round numbers upward specifically.");
        resultRound = Math.ceil(3.12);
        System.out.println("3,12 is rounded upward to " + resultRound + ".");

        System.out.println("You can also round numbers downwards specifically.");
        resultRound = Math.floor(3.12);
        System.out.println("3,12 is rounded downward to " + resultRound + ".");

        //Max. and Min. of ranges:


        int range;

        System.out.println("You can also find the Min. or Maximum of a range of numbers, here, it goes from 10 to 20: ");
        range = Math.max(10, 20);
        System.out.println(range);
        range = Math.min(10, 20);
        System.out.println(range);





    }
}
