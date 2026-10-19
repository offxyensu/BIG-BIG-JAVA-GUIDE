import java.util.Scanner;

public class ScannerUtility {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        //adds the scanner

        System.out.print("\nEnter your name: ");
        String name = scanner.nextLine();
        //scanner.nextLine() takes the input and safes it to 'name'

        //Example:
        System.out.println("Hello " + name + "");
        //takes 'scanner.nextLine()', defines it as name and gets added to the String

        System.out.print("\nEnter your age: ");
        int age = scanner.nextInt();
        //scanner.nextLine(), but with int

        System.out.println("You are " + age +  " years old!");

        System.out.print("Are you a Student? (true/false) ");
        Boolean trueFalse = scanner.nextBoolean();

        if(trueFalse) {
            System.out.println("You are a student!");
        }
        //if-commands stand ALONE! So be sure to close your brackets {}, then else-command
        else{
            System.out.println("You are NOT a student!");
        }

            /*HINWEIS:  falls scanner.nextLine nicht klappt, versuche 'scanner.nextLine();',
                        um scanner.nextLine zu resetten. */
        scanner.close();
    }


}
