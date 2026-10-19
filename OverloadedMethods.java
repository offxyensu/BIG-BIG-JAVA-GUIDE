public class OverloadedMethods {

    public static void main(String[] args) {

        // overloaded methods - methods with the same name, but different parameters

        String pizza = bakePizza("flat bread", "mozzarella", "pepperoni");
        System.out.println(pizza);


    }
    static String bakePizza(String bread){
        return bread + " pizza";
    }
    static String bakePizza(String bread, String cheese){
        return cheese + " " + bread + " pizza";
    }
    static String bakePizza(String bread, String cheese, String topping){
        return topping + " " + cheese + " " + bread + " pizza";
    }

    /*
    static double add(double a; double b){
        retun a + b;
    }
    static double add(double a; double b; double c){
        return a + b + c;
    }
    //Methods can share the same name, but not the same parameters
    static double add(double a; double b; double c, double d){
        return a + b + c + d
    }
    */
}
