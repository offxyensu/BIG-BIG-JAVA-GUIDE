import java.util.Random;

public class RandomUtility {

    public static void main(String[] args){


    //Using Random with Ints:

        Random random = new Random();

        int number1;

        number1 = random.nextInt();

        System.out.println(number1);
        System.out.println("The normal randomizer goes around -2B and +2B");
        number1 = random.nextInt(1, 7);
        System.out.println(number1);
        System.out.println("The origin is inclusive within the range, while the bound is exclusive, so add +1 to the bound! (Here from 1 to 6, so [1 - 7])");

        int number2;
        int number3;

        number1 = random.nextInt();
        number2 = random.nextInt();
        number3 = random.nextInt();

        System.out.println("You cann do more random numbers by just using more ints!");
        System.out.println("random number 1: " + number1 + "!");
        System.out.println("random number 2: " + number2 + "!");
        System.out.println("random number 3: " + number3 + "!");

    //Using Random with Boolean:

        System.out.println("You can also randomize true/false!");

        boolean isTails;

        isTails = random.nextBoolean();

        if(isTails){
            System.out.println("TAILS");
        }
        else{
            System.out.println("HEAD");
        }

        isTails = random.nextBoolean();

        if(isTails){
            System.out.println("TAILS");
        }
        else{
            System.out.println("HEAD");
        }

        isTails = random.nextBoolean();

        if(isTails){
            System.out.println("TAILS");
        }
        else{
            System.out.println("HEAD");
        }



    }
}
