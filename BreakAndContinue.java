public class BreakAndContinue {

    public static void main(String[] args){


        // break - breaks out of a loop
        // continue - skips the certain loop


        for(int i = 0; i < 10; i++){

            if(i == 5){
                break;
            }


            System.out.print(i + " ");
        }
        System.out.println(" ");

        for(int x = 0; x < 10; x++){
            if(x == 5){
                continue;
            }
            System.out.println(x + " ");

        }


    }


}
