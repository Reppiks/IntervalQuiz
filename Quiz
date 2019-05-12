package IntervalQuiz;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int cycles = 0;
        int points = 0;

        do {

            QuizBuilder newScale = new QuizBuilder();

            int root = newScale.getRoot();
            int distance = newScale.getDistance();

            String rootName = newScale.getRootName(root);
            String intervalName = newScale.getIntervalName(distance);
            String answer = newScale.getAnswer(root, distance);

            String guess = "";
            boolean isCorrect = false;
            int attempt = 1;

            do {
                System.out.printf("What is a %s up from %s? %n", intervalName, rootName);

                if (input.hasNextLine()){
                    guess = input.nextLine();
                }
                else
                    System.out.println("Invalid entry. Please try again.");

                if (guess.toLowerCase().equals(answer.toLowerCase())){
                    isCorrect = true;
                    System.out.println("That's correct!");
                    points++;
                    System.out.println("Your score is " + points + " out of 5");
                }
                else if (attempt < 3){
                    System.out.println("Sorry, that is incorrect.");
                    System.out.println("Strike " + attempt);
                    System.out.println("Please try again");
                    attempt++;
                }

                else if (attempt == 3){
                    System.out.println("Strike " + attempt + " You're out.");
                    System.out.println();
                    System.out.println("Here's the answer: ");
                    System.out.printf("A %s up from %s is %s. %n", intervalName, rootName, answer);
                    isCorrect = true;
                    System.out.println("Your score is " + points + " out of 5");
                }
            }
            while(!(isCorrect));
            cycles++;
            if (cycles < 5)
                System.out.println("-----------Try another-----------");
        }
        while (cycles < 5);
        System.out.println("Good job. That's it for now.");
    }
}
