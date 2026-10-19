public class Substrings {

    public static void main(String[] args){

        String email = "Example@gmail.com";
        String domain;
        System.out.println(email);
        String username = email.substring(0, 7);
        System.out.println("string.substring(,) takes a part of the string withing a range, starting from 0. which can be used for alternative strings");

        System.out.println(username);

        System.out.println("This can be improved by string.substring(x, string.indexOf('y')");

        username = email.substring(0, email.indexOf("@"));

        domain = email.substring(email.indexOf("@") + 1);
                //that automatically counts one char up, not needing a starting point

        System.out.println(username);
        System.out.println(domain);






    }
}
