import java.util.Scanner;

public class UsernameValidationTraining {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //username must be between 4-12 char
        //username must not contain spaces or underscore

        String username;

        System.out.println("Enter your name: ");
        username = scanner.nextLine();

        if(username.length() < 4 || username.length() > 12){
            System.out.println("Username must be between 4-12 character");
        }
        else if(username.contains(" ") || username.contains("_")){
            System.out.println("Username must not contain spaces or underscores");
        }
        else{
            System.out.println("Welcome " + username);
        }


        scanner.close();


    }
}
