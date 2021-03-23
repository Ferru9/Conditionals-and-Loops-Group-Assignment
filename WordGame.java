import java.util.Random;
import java.util.Scanner;

public class WordGame {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {

            wordCreator();

            System.out.println("Type Y to play again: ");
            String playAgain = scan.next();

            if (!playAgain.equals("Y")) {
                break;
            }

        }

        scan.close();

    }

    public static void wordCreator() {

        Scanner scan = new Scanner(System.in);
        
        int multiple = 1;
        int score = 0;
       

        Random rnd = new Random();
        char randomChar = (char) ('a' + rnd.nextInt(26)); // Chooses a random character as a starting letter
        System.out.println("Your word should start with the letter: " + randomChar); // Prints the starting letter
        System.out.println("If letters in your word are in ascending order, your score will be tripled.");

        System.out.println("Enter your word: "); // Asks to enter a word
        String input = scan.nextLine().toLowerCase(); // Scans the next input and stores it in a string variable
        char[] word = input.toCharArray();

        for (int i = 0; i < word.length; i++) {

            char arrayValue = word[i]; // Takes the value of the array
            int arrayInt = (int) arrayValue; // Transforms too ascii

            score = score + arrayInt; // add

        }

        if (word[0] == randomChar) { // checks if the user's word starts from a randomly generated character


            for (int i = 0; i < word.length; i++) {
                if (i + 1 == word.length) {

                    break;

                } else {
                    char arrayValue = word[i];
                    int first_letter = (int) arrayValue; // value of the first letter

                    int next_letter = 0;
                    char d = word[i + 1];
                    next_letter = (int) d; // value of the next letter

                    if (first_letter > next_letter) { // checks if the letters go in an ascending order
                        multiple = 3;

                    }

                    else {
                        multiple = 1;

                    }
                }

            }
        }

        else {
            System.out.println("Your word should have started from " + randomChar);

        }

        score = score * multiple;

        if (multiple == 1) {
            System.out.println("Your score is: " + score);
        } else if (multiple == 3) {
            System.out.println("The letters in your word are in ascending order, your score is: " + score);
        }

        scan.close();
    }
    
    
    
}
