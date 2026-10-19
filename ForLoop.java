import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args){

        // for loop = execute some code for a certain amount of time

        // for(counter/initiation of times; condition to run another cycle; increasement/update  of counter){}
        // short: initialization - condition - update

        for(int i = 0; i < 10; i ++){
            System.out.println(i);
            //You can also loop the index as well as change update
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter how many times you want to loop: ");
        int max = scanner.nextInt();

        for(int x = 0; x < max; x++){
            System.out.println(x);
        }

        scanner.close();


    }
}
