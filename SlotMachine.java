import java.util.Random;
import java.util.Scanner;

public class SlotMachine {

    public static void main(String[] args) {

        // JAVA SLOT MACHINE

        // DECLARE VARIABLES

        Scanner scanner = new Scanner(System.in);
        int balance = 1000;
        int bet = 0;
        int payout;
        String[] row = {""};
        String playAgain;

        // DISPLAY WELCOME MESSAGE

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Welcome to the JAVA SLOT MACHINE");
        System.out.println("Symbols: 🍉[0x] 🍋[1x] 🍒[2.0x] 💎[5.0x] 🔔[10.0x] ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // PLAY IF BALANCE > 0

        while(balance > 0){
            System.out.println("Current balance €" + balance);
            // ENTER BET AMOUNT
            System.out.print("Place bet amount: ");
            bet = scanner.nextInt();
            scanner.nextLine();

            //      VERIFY IF BET > BALANCE
            if(bet > balance){
                System.out.println("INSUFFICENT FUNDS");
                continue;
            }
            else if(bet <= 0){
                //      VERIFY IF BET >= 0
                System.out.println("Bet must be greater than 0");
            }
            else{
                //      SUBTRACT BET FROM BALANCE
                balance -= bet;
            }

            System.out.println("Spinning...");
            row = Spinrow();
            printRow(row);
            payout = getPayout(row, bet);

            if(payout > 0){

                System.out.println("You won €" + payout);
                balance += payout;
            }
            else{
                System.out.println("Sorry, you have lost :<");
            }

            getPayout(row, bet);

            // ASK TO PLAY AGAIN

            System.out.print("Do you want to play again? (Y/N): ");
            playAgain = scanner.nextLine().toUpperCase();
            if(!playAgain.equals("Y"))   {
                break;
            }

        }
        scanner.close();
        System.out.println("Thank you for playing! Your final Balance is €" + balance);

    }

    // DISPLAY EXIT MESSAGE
    // SPIN ROW METHOD
    static String[] Spinrow(){

        String[] symbols = {"🍉", "🍋", "🍒", "💎", "🔔"};
        String[] row = new String[3];
        Random random = new Random();

        for(int i = 0; i < 3; i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        return row;
    }
    // PRINT ROW
    static void printRow(String[] row){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    }
    // GET PAYOUT
    static int getPayout(String[] row, int bet){

        if(row[0].equals(row[1]) && row[0].equals(row[2])){
            return switch (row[0]){
                case "🍉" -> 0;
                case "🍋" -> bet * 3;
                case "🍒" -> bet * 6;
                case "💎" -> bet * 15;
                case "🔔" -> bet * 300;
                default -> 0;
            };
        }
        else if(row[0].equals(row[1])){
            return switch (row[0]){
                case "🍉" -> 0;
                case "🍋" -> bet * 2;
                case "🍒" -> bet * 4;
                case "💎" -> bet * 10;
                case "🔔" -> bet * 20;
                default -> 0;
            };
        }
        else if(row[1].equals(row[2])){
            return switch (row[1]){
                case "🍉" -> 0;
                case "🍋" -> bet;
                case "🍒" -> bet * 2;
                case "💎" -> bet * 5;
                case "🔔" -> bet * 10;
                default -> 0;
            };
        }

        return 0;

    }
}
