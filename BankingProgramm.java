import java.util.Scanner;

public class BankingProgramm {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //JAVA BANKING PROGRAMM

        //DECLARE VARIABLESS



        double balance = 0;
        boolean isRunning = true;
        int choice;

        // DISPLAY MENU

        while(isRunning){
            System.out.println("---------------");
            System.out.println("BANKING PROGRAM");
            System.out.println("---------------");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

       // GET AND PROCESS USERS CHOIDE

            switch(choice){
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance = balance - withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("invalid choice.");

            }



        }

        System.out.println("---------------------------");
        System.out.println("THank you! Have a nice day!");
        System.out.println("---------------------------");

        scanner.close();
    }

   // showBalance()

    static void showBalance(double balance){
        System.out.printf("%.2f€\n", balance);
    }

   // deposit()

    static double deposit(){

        double amount;

        System.out.print("Enter an amount to deposit: ");
        amount = scanner.nextDouble();

        if(amount < 0){

            System.out.println("amount cannot be negative");
            return 0;
        }
        else{
            return amount;
        }

    }

   // withdraw()

    static double withdraw(double balance){

        double amount;

        System.out.print("Enter amount to withdraw: ");
        amount = scanner.nextDouble();

        if(amount > balance){
            System.out.println("insufficient funds");
            return 0;
        }
        else if(amount < 0){
            System.out.println("amoutn cannot be negative");
            return 0;
        }
        else{
            return amount;
        }
    }

    // EXIT MESSAGE


}
