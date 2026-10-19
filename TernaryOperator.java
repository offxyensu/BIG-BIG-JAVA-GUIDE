public class TernaryOperator {

    public static void main(String[] args){

       // ternary operator = Return 1 of 2 values if a condition is true

       // variable = (condition) ? ifTrue: ifFalse;

       int score = 50 ;

       String passOrFail = (score >= 60) ? "Pass" : "Fail";
        System.out.println("the ternary operator is a short if-command basically");
        System.out.println(passOrFail);

        //even or odd

        int number = 2;

        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";
        System.out.println(evenOrOdd);



    }
}
