import java.util.Scanner;

public class weightConverterTraining {

    public static void main(String[] args){

        //WEIGHT CONVERTER

            //Variables
            Scanner scanner = new Scanner(System.in);
            double lbs;
            double kg;
            int choice;


            //Message

        System.out.println("Weight Conversion Program");
        System.out.println("1: lbs to kg");
        System.out.println("2: kg to lbs");

        System.out.println("Choose an option (1/2): ");
        choice = scanner.nextInt();


            //User choice

                //Option 1: lbs to kg

                if(choice == 1){
                    System.out.println("Enter your weight (lbs): ");
                    lbs = scanner.nextDouble();
                    kg = lbs * 0.453592;
                    System.out.println("Former weight; " + lbs + "lbs");
                    System.out.printf("New weight: %.2fkg", kg);
                }


                //Option 2: kg to lbs

                if(choice == 2){
                    System.out.println("Enter your weight (kg): ");
                    kg = scanner.nextDouble();
                    lbs = kg * 2.20462;
                    System.out.println("Former weight; " + kg + "kg");
                    System.out.printf("New weight: %.2flbs", lbs);
                }
                //else: print "not a valid option"

                else{
                    System.out.println("INVALID OPTION");
                }

            scanner.close();

    }
}
