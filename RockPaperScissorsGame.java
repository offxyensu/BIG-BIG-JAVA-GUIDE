import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {

    public static void main(String[] args) {

        // ROCK PAPER SCISSORS GAME

        // DECLARE VARIABLES

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String comChoice;
        String playAgain = "y";
        String result = "";

        // GET CHOICE FROM USER

        do {
            System.out.print("Enter you move (rock/paper/scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") &&
                    !playerChoice.equals("paper") &&
                    !playerChoice.equals("scissors")) {
                System.out.println("invalid choice");
            }

            // GET RANDOM CHOICE FROM THE COM
            comChoice = choices[random.nextInt(0, 3)];
            System.out.println("Computer's choice: " + comChoice);

            // COMPARING WIN CONDITIONS

            if (playerChoice.equals(comChoice)){
                System.out.println("It is a tie!");
            }
            else if (playerChoice.equals("rock") && comChoice.equals("scissors")){
                System.out.println("You win!");
            }
            else if (playerChoice.equals("paper") && comChoice.equals("rock")){
                System.out.println("You win!");
            }
            else if (playerChoice.equals("scissors") && comChoice.equals("paper")){
                System.out.println("You win!");
            }
            else{
                System.out.println("You lose!");
            }

            // PLAY AGAIN REQUEST

            System.out.print("Want to play again? (y/n): ");
            playAgain = scanner.nextLine().toLowerCase();
        }while(playAgain.equals("y"));

        // GOODBYE MESSAGE
        System.out.println("Goodbye :D");

        scanner.close();
    }
}
