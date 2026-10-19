public class Countdown {

    public static void main(String[] args) throws InterruptedException{

        int start = 10;

        for(int i = start; i > 0; i--){

            System.out.println(i);
            Thread.sleep(1000);
            //thread.sleep(milliseconds) lets the programm have a break between each run for x milliseconds

        }
        System.out.println("HAPPY NEW YEAR");

    }
}
