import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);



        int guess;
        int attempts = 0;

        int min = 1;
        int max = 10;
        //default range

        boolean settings = false;
        String settingInput;


        System.out.println("NUMBER GUESSING GAME");
        System.out.println("Type 'S' to go to settings or simply press Enter to resume: ");
        settingInput = scanner.nextLine().toUpperCase();
        // Asks whether the user wants to acess settings via 's', if everything except that is pressed, it will skip this step and move on to the game


        if (settingInput.equals("S")) {
            settings = true;
        }
        else {
            settings = false;
        }
        //if s is pressed, it will continue to settings


        if (settings){

            System.out.println("SETTINGS:");

            System.out.println("set minimal value of range:");
            min = scanner.nextInt();
            //sets min up

            System.out.println("set maximum value of range");
            max = scanner.nextInt();
            //sets max up

            settingInput = "";
            //this resets the Input to properly close settings
            settings = false;
            //finally, settings are set to false to continue to the game
        }

        int randomNumber = random.nextInt(min, max + 1);
        System.out.printf("Guess a number between %d and %d\n", min, max + 1);
        //random number between min and max (+ 1 since max is exclusive) and gives the range to guess from

        do{
            System.out.println("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;
            //this increases the amount of attempts per guess

            if(guess < randomNumber){

                System.out.println("Too low, try again!");
            }       //if the number is too low, a hint will be given to raise the number
            else if(guess > randomNumber){

                 System.out.println("Too high, try again!");
            }      //if the number is too high, a hint will be given to lower the number
            else{
                System.out.println("You have guessed the number " + randomNumber+ " within " + attempts + " attempts!");
            }     //if the number has been guessed correctly, both the random number and the attempts will be displayed

        }while(guess != randomNumber);

        scanner.close();

    }
}
