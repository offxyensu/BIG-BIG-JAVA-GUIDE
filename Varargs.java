public class Varargs {

    public static void main(String[] args) {
            // varargs = methods on crack


        add(1, 2, 3, 4);
        System.out.println(average(1, 2, 3, 4));

    }
    static int add(int... numbers){
        int sum = 0;

        for(int number : numbers){
            sum += number;
        }

        return sum;
    }
    static double average(double ... numbers){

        double sum = 0;

        if(numbers.length == 0){
            return 0;
        }

        for(double number : numbers){
            sum += number;
        }

        return sum / numbers.length;

    }
}
