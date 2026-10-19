public class VariableScope {


    // LOCAL OVER CLASS
    // CLASSES CAN BE USED IN ALL METHODS IF NOT DEFINED VIA LOCAL
    static int x = 3; //CLASS

    public static void main(String[] args) {

        int x = 1; // LOCAL

        System.out.println(x);

        doSomething();

    }
    static void doSomething(){
        int x = 2; // Variables can exist with the same name, as long as they are in a different method
        System.out.println(x);

    }
}
