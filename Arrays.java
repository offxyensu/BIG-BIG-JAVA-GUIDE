public class Arrays {

    public static void main(String[] args) {

        // array - a collection of values of the same data type
        // ----> variable that can store more than 1 value

        String[] fruits = {"apple", "banana", "orange", "coconut"};

        int numOfFruits = fruits.length; // gives the amount of arrays

        java.util.Arrays.sort(fruits); //alphabetically sorting
        java.util.Arrays.fill(fruits, "pineapple"); //fills array with term

        for(String fruit : fruits){  //enhanched loop
            System.out.println(fruit);

        }

        //System.out.println(fruits[3]);

    }
}
