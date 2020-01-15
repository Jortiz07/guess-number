package edu.cnm.deepdive;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

  private static Random random = new Random();
  private static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    boolean playAgain;

    do {
      int secret;

      secret = 1 + random.nextInt(100);
      play(secret);
      System.out.println("Play again? (y/n)");
      String playAgainInput;
      while (!input.hasNextLine()){
          //Do nothing while scanner buffer is empty.
      }
      playAgainInput = input.nextLine().toLowerCase();
      playAgain = playAgainInput.length() > 0
          && playAgainInput.charAt(0) == 'y';
    } while (playAgain);
    System.out.println("Okay, bye-bye!");
  }

  public static void play(int secret) {
    boolean correct;

    System.out.println("Guess a number between 1 and 100!");
    do {
      int userGuess;

      userGuess = input.nextInt();
      if (secret == userGuess) {
        correct = true;
        System.out.println("Wow! You're really good at guessing ;D !!"
            + " The secret number was " + secret);
      } else {
        if (userGuess < secret) {
          System.out.println("Too low! Guess Higher!");
        } else {
          System.out.println("Too high! Guess lower!");
        }
        correct = false;
      }
    } while (!correct);
  }
}
