import java.util.Scanner;

public class EnhancedSwitches {

    public static void main(String[] args){

        //Enhanced switch = A replacement to many else if() statements


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day: ");
        String day = scanner.nextLine();

        switch (day){
            case "Monday" -> System.out.println("It is a weekday");
            case "Tuesday" -> System.out.println("It is a weekday");
            case "Wednesday" -> System.out.println("It is a weekday");
            case "Thursday" -> System.out.println("It is a weekday");
            case "Friday" -> System.out.println("It is a weekday");
            case "Saturday" -> System.out.println("It is the weekend");
            case "Sunday" -> System.out.println("It is the weekend");
            default -> System.out.println(day + "is not a day");

            //THIS SHIT IS GOATED


        }

        scanner.close();

    }
}
