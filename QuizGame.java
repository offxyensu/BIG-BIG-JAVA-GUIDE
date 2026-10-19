import java.util.Scanner;

public class QuizGame {

    public static void main(String[] args) {

        //JAVA QUIZ GAME

            // QUESTIONS array[]

        String[] questions = {"WHAT GAME ALONGSIDE MINECRAFT JAVA ALSO HAS BEEN DEVELOPED WITH JAVA?",
                             "WHAT IS IMPORTANT AFTER USING A SCANNER?",
                             "WHAT DATATYPE IS REFERED TO WITH %d WITHIN PRINTF?",
                             "WHAT IS A POPULAR WAY OF APPLYING D.R.Y WHEN REQUIRING MANY IF-COMMANDS?",
                             "LASTLY : D.R.Y"};

            // OPTIONS array[][]

        String[][] options = {{"1. Schedule I", "2. Fortnite", "3. Slay the Spire"},
                              {"1. scanner.close();", "2. Scanner scanner = new Scanner(System.in);", "3. variable = scanner.next();"},
                              {"1. doubles", "2. integers", "3. strings"},
                              {"1. while-commands ", "2. print-commands ", "3. enhanced switches"},
                              {"1. Don't run away ", "2. Don't repeat yourself ", "3. Do repeated yoga"}};

            //DECLARE VARIABLES

        int[] answers = {3, 1, 2, 3, 2};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);

            //WELCOME MESSAGE

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Welcome to the Java Quiz Game");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            //QUESTION (loop)

        for(int i = 0; i < questions.length; i++){
            // for each time i is under the amount of questions
            System.out.println(questions[i]);
            // print out the question at the index of i and add 1 to i

                // OPTION

                for(String option : options[i]){
                    // for each element (String) in our array of options at the index of i
                    System.out.println(option);
                    // print out the element (String)
                }

                // GET GUESS FROM USER
                System.out.print("Enter your guess (1,2,3): ");
                guess = scanner.nextInt();

                // CHECK OUR GUESS
                if(guess == answers[i]){
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("CORRECT");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    score += 1;
                }
                else{
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("WRONG");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                }


        }

        System.out.println("You got " + score + " out of " + questions.length + " question/s right!");
            // DISPLAY FINAL SCORE

        scanner.close();

    }
}
