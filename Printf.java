public class Printf {

    public static void main(String[] args){

        //print f() = placeholder for an output

        //%...
            // flags -
            // width
            // .precision
            // specifier
            // char -

        String name = "Yensu";
        char firstLetter = 'Y';
        int age = 19;
        double height = 2.19;
        boolean isEmployed = false;

            System.out.printf("Hello %s\n", name);
                //for strings, use %s
                //also, use \n!

            System.out.printf("You are %d years old\n", age);
                //for ints, use %d

            System.out.printf("You are %f tall\n", height);
                //for doubles, use %f

            System.out.printf("Employed: %b\n", isEmployed);
                //for boolean, use %b

            System.out.printf("%s is %d years old\n", name, age);
                //for multiple %, display it from left to right via comma!

        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54000.01;

            System.out.printf("%.2f\n", price1);
            System.out.println("%.(x)f will limit the digits after the decimal");

            System.out.printf("%+.2f\n", price2);
            System.out.println("using %+ alongside a positive int/double will add a + before it");

            System.out.printf("%,2f\n", price3);
            System.out.println("using %, will group three digits together");

            System.out.printf("%(.2f\n", price3);
            System.out.println("using %( will enclose negative numbers in brackets ()");

            System.out.printf("% .2f\n", price2);
            System.out.printf("% .2f\n", price3);
            System.out.println("Using %[space] will display a minus if negative or a space if positive");

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 789;

        System.out.printf("%04d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.println("using %0(x), you can 0-pad by a certain amount of x!");
        System.out.printf("%4d\n", id3);
        System.out.printf("%-4d\n", id4);
        System.out.println("using %(- if left-pad)(x) will empty-pad by a certain amount of x!");










    }
}
