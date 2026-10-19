public class AgeVerification {

    public static void main(String[] args) {

        int age = 15;

        if(ageCheck(age)){
            System.out.println("You may sign up");
        }
        else{
            System.out.println("You must be 18+ to sign up");
        }
    }
    static boolean ageCheck(int age){

        if(age >= 18){
            return true;
        }
        else{
            return false;
        }

    }
}
