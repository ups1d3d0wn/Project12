/**
*@author Kevin Murphy
*@version 8/16/19
* Top: Working game of craps demonstrating random generation of integers within
*  speciofied parameters
*/

public class Craps {

  // create new datatype to track status
  private enum Status {CONTINUE, LOSE, WIN};

  // Constants used for craps rules
  private static final int SNAKE_EYES = 2;
  private static final int TREY = 3;
  private static final int SEVEN = 7;
  private static final int YO = 11;
  private static final int BOXCAR = 12;

  // Variables to track game status and my point
  private static Status gameStatus;;
  private static int myPoint;


  public static void main(String[] args) {

    // play round 1
    firstRound();
    // if no winner or loser then continue playing next rounds
    while (gameStatus == Status.CONTINUE) {
      nextRound();
    }
    // Print game results
    printResults();

  }

  // First round
  public static void firstRound() {
    // roll 2 dice
    int dieSum = Dice.rollD6(6);
    // if roll is SEVEN or YO
    if (dieSum == SEVEN || dieSum == YO) {
      // update game status to WIN
      gameStatus = Status.WIN;
    }
    else if (dieSum == SNAKE_EYES || dieSum == TREY || dieSum == BOXCAR) {
    // update game status to LOSE
      gameStatus = Status.LOSE;
    }
    else {
      // update game status to continue
      gameStatus = Status.CONTINUE;
      // rememnber myPoint
      myPoint = dieSum;
      nextRound();
    }
  }

    public static void nextRound() {
      // Roll Dice
      int dieSum = Dice.rollD6(2);
      // if dice roll is myPoint update the game status to WIN
    if (dieSum == myPoint) {
      gameStatus = Status.WIN;

    }

    else if (dieSum == SEVEN) {
      gameStatus = Status.LOSE;
    }
  }

    // print printResults
    public static void printResults() {
      if (gameStatus == Status.WIN) {
        System.out.print("You won!\n");
      }

    else if (gameStatus == Status.LOSE) {
        System.out.print("You Lose!\n");
    }
  }
}
