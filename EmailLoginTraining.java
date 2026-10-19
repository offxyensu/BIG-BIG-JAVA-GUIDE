import java.util.Scanner;

public class EmailLoginTraining {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;
        String password;

        System.out.print("Enter your email-adress: ");
        email = scanner.nextLine();

        username = email.substring(0, email.indexOf("@"));
        domain = email.substring(email.indexOf("@") + 1);

        if(email.contains("@") == false) {
            System.out.println("Your email-adress is invalid: must contain an @");
        }

        if(username.isEmpty()){
            System.out.println("Your email-adress is invalid: adress incomplete");
        }
        else{
            System.out.println(username);
        }

        if(domain.isEmpty()){
            System.out.println("Your email-adress is invalid: adress incomplete");
        }
        else {
            if(domain.contains(".") == false){
                System.out.println("Your email-adress is invalid: domain must contain a .");
            }
            else{
                System.out.println(domain);
            }
        }


        System.out.print("Enter your password: ");
        password = scanner.nextLine();


        if(password.equalsIgnoreCase(username)){
            System.out.println("Your password cannot be the same as your username.");
            if(password.equalsIgnoreCase(email)){
                System.out.println("Your password cannot be the same as your email.");
            }
        }
        else{
            if(password.equalsIgnoreCase(email)){
                System.out.println("Your password cannot be the same as your email.");
            }

        }




        scanner.close();

    }
}
