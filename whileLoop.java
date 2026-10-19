import java.util.Locale;
import java.util.Scanner;

public class whileLoop {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String name = "";

        while(name.isEmpty()){
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello " + name);

        String response = "";

        while(!response.equals("Q")){
            System.out.println("We are playing a game!");
            System.out.print("Press Q to quit: ");
            response = scanner.next().toUpperCase();

        }

        System.out.println("Congrats! You left the game!");

        int age = 0;

        System.out.println("Enter your age: ");
        age = scanner.nextInt();

        while(age < 0){
            System.out.println("Your age cannot be negative!");
            System.out.println("Enter your name again");
            age = scanner.nextInt();
        }

        System.out.println("You are " + age + " years old!");

        int number = 0;

        do{
            System.out.println("enter a number between 1 - 10: ");
            number = scanner.nextInt();

        }while (number < 1 || number > 10);

        System.out.println(number);





        scanner.close();


    }
}
