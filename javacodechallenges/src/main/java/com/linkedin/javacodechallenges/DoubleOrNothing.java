package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class DoubleOrNothing {

  public void playGame() {
    Scanner input = new Scanner(System.in);
    boolean playAgain = true;
    int currentPoints;
    while (playAgain) {
      boolean stillPlaying = true;
      currentPoints = 1;
      while (stillPlaying) {
        System.out.println(
            "You have " + currentPoints + " point. Double or Nothing (1) or leave with the points you have (0)?");
        int choice = Integer.parseInt(input.nextLine());
        switch (choice) {
          case 1:
            int random = (int) Math.floor(Math.random() * (10 - 1 + 1) + 1);
            if (random > 5) {
              currentPoints *= 2;
              System.out.println("You doubled your points!");
            } else {
              stillPlaying = false;
              System.out.println("You lost. Play again? (y/n)");
              char again = input.nextLine().toLowerCase().charAt(0);
              if (again == 'n') {
                playAgain = false;
              }
            }
            break;
          case 0:
            System.out.println("You leave with " + currentPoints + " points, well done!");
            playAgain = stillPlaying = false;
            break;
        }
      }

    }
    input.close();
  }
}