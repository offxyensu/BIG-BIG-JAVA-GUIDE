import java.util.Scanner;

public class SearchArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] fruits = {"apple", "orange", "banana"};
        String target;

     //   int target = 2;

        System.out.print("Enter a fruit to search for: ");
        target = scanner.nextLine();
        boolean isFound = false;

        /*
        for(int i = 0; i < numbers.length; i++){
            if(target == numbers[i]){
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;

            }
        }
        */




        for(int i = 0; i < fruits.length; i++){
            if(fruits[i].equals(target)){
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;

            }
        }

        if(!isFound){
            System.out.println("Element not found within that list.");

        }

        scanner.close();
    }
}
