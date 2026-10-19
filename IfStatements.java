import java.util.Scanner;

public class IfStatements {

    public static void main(String[] args){



    //GROUP 1: Int

        int age;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        age = scanner.nextInt();


        if(age >=67) {
            System.out.println("You are a senior");
        }
            else if(age >=18){
            System.out.println("You are an adult");
            }
            //if the conditions are meet/true
            else if(age < 0) {
            System.out.println("You have not been born yet");
            //If the first condition is not met, check for this condition and look if it is true
            }

            else if(age == 0){
            //double equal sign for comparison, as one equal sign is for assignment
            System.out.println("You are a baby");
            }
        else{
            System.out.println("You are a child");
        }
            //else, do this as action, usual the default if conditions are not meet

    //GROUP 2: STRINGS


        Scanner scanner1 = new Scanner(System.in);

    String name;

        System.out.println("Enter your name: ");
        name = scanner1.nextLine();

        if(name.isEmpty()){
            //string.isEmpty is looking wheter the name is filled or not
            System.out.println("You did not enter a name!");
        }
        else{
            System.out.println("Hello " + name + "!");
        }

        scanner.close();
        scanner1.close();
    }
}
