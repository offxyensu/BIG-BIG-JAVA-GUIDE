import java.util.Random;
import java.util.Scanner;

public class DiceRollingProgram {

    public static void main(String[] args) {

        // HAVE DICE ROLLER PROGRAM

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // DECLARE VARIABLES

        int numOfDice;
        int total = 0;

        // GET # OF DICE FROM THE USER

        System.out.println("Enter the # of dice/s to roll: ");
        numOfDice = scanner.nextInt();

        // CHECK IF # OF DICE > 0
        // ROLL ALL THE DICE
        // GET TOTAL

        if(numOfDice > 0){

            for(int i = 0; i < numOfDice; i++){

                int roll = random.nextInt(1, 7);
                printDie(roll);
                System.out.println("You rolled " + roll);
                total += roll;
            }
            System.out.println("Total: " + total);
        }
        else{
            System.out.println("# of dice must be greater than ß");
        }




        scanner.close();

    }
    // DISPLAY ASCII
    static void printDie(int roll){

        String dice1 = """
                        --------
                        |      |
                        |  1   |
                        |      |
                        --------
                        """;
        String dice2 = """
                        --------
                        |      |
                        |  2   |
                        |      |
                        --------
                        """;
        String dice3 = """
                        --------
                        |      |
                        |  3   |
                        |      |
                        --------
                        """;
        String dice4 = """
                        --------
                        |      |
                        |  4   |
                        |      |
                        --------
                        """;
        String dice5 = """
                        --------
                        |      |
                        |  5   |
                        |      |
                        --------
                        """;
        String dice6 = """
                        --------
                        |      |
                        |  6   |
                        |      |
                        --------
                        """;

        switch (roll){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("invalid roll");
        }


    }


}
