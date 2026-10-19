public class NestedIfStatements {

    public static void main(String[] args){

        boolean isStudent = false;
        boolean isSenior = false;

        double price = 9.99;

        if(isStudent){
            //checks if isStudent is true
            if(isSenior){
                System.out.println("in the if(isStudent), it also checks if if(isSenior) is true as well");
                //if both boolean are true, it applies both discounts
                System.out.println("You get a senior discount of 20%");
                System.out.println("You get a student discount of 10%");
                price *= 0.7;
            }
            else{
                System.out.println("if if(isSenior) is false but if(isStudent) is true), only the Student discount is applied");
                System.out.println("You get a student discount of 10%");
                price *= 0.9;
            }

        }
        else{
            //if if(isStudent is false)
            if(isSenior){
                System.out.println("within if(isStudent) = false, it also looks if if(isSenior) is true amd provides a discount if true");
                System.out.println("You get a senior discount of 20%");
                price *= 0.8;
            }
            else{
                System.out.println("otherwise, the price stays the same");
                price *= 1;
            }
        }

        System.out.printf("The price of your ticket is %.2f", price);

    }
}
