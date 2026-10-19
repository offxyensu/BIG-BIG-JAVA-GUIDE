import java.util.Scanner;

public class UsefulStringMethods {

    public static void main(String[] args) {

        String name = "Yensu";

        //string.length()
        int length = name.length();
        System.out.println("name.length shows the length of the words");
        System.out.println(length);

        //string.charAt()
        char letter = name.charAt(2);
        System.out.println("name.characterAt(x) shows the character at position x of the string (starting at 0)");
        System.out.println(letter);

        //string.indexOf()
        int index = name.indexOf("e");
        System.out.println("shows the first occourance of a character within a string (starting at 0)");
        System.out.println(index);

        //string.lastIndexOf()
        int lasIndex = name.lastIndexOf("u");
        System.out.println("shows the last occourance of a character within a string (starting at 0))");
        System.out.println(lasIndex);

        //string.toUpperCase()
        name = name.toUpperCase();
        System.out.println("name.toUpperCase() puts all chars in upper case");
        System.out.println(name);

        //string.toLowerCase()
        name = name.toLowerCase();
        System.out.println("name.toLowerCase() puts all chars in lower case");
        System.out.println(name);

        //string.trim()
        name = "   Yensu   ";
        name = name.trim();
        System.out.println("name.trim() removes the white space within a string");
        System.out.println(name);

        //name.replace(,)
        name = name.replace("s","x");
        System.out.println("name.replace('oldchar', 'newchar') replaces a char with a certain one");
        System.out.println(name);

        name = "Yensu";

        //name.isEmpty
        System.out.println("name.isEmpty returns a boolean whether the name is empty");
        System.out.println("The name is 'Yensu'");

        System.out.println(name.isEmpty());

        name = "";
        System.out.println("Name is now empty");
        System.out.println(name.isEmpty());

        name = "Yensu";

        //name.contains()
        System.out.println("name.contains('char') gives a boolean whether the character is contained within the string");
        System.out.println("/System.out.println(name.contains('Y')");
        System.out.println(name.contains("Y"));
        System.out.println("/System.out.println(name.contains('S')");
        System.out.println(name.contains("S"));
        System.out.println("As the 'S' is upper case, it is shown as false");

        //name.equals()
        System.out.println("name.equals checks if the string is equal to a certain word");
        System.out.println("This is more useful within a code (look at console)");

        String password;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name: ");
        name = scanner.nextLine();
        System.out.println("Enter password: ");
        password = scanner.nextLine();

        if(password.equalsIgnoreCase(name)){
            //-IgnoreCase ignores the Case when comparing
            System.out.println("Your password can not be the same as your name");
        }
        else{
            System.out.println("Your password has been saved");
        }
















    }
}
