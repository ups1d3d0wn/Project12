

import java.util.Scanner;

public class Homework2 {
		public static void main(String[] args) {

			int lowerBound = 0;
			int upperBound = 100;
			int tries = 0;
			int guess;
			int userResponse;
			Scanner input = new Scanner(System.in);
			System.out.println("Choose a number from 1 to 100:\n");


			guess = (upperBound+lowerBound)/2;

			tries += 1;

			System.out.printf("Is your number %d\n", guess);
			System.out.print("[1] correct guess, \n[2] number is high, \n[3] number is lower:\n");
			userResponse = input.nextInt();

			while(userResponse != 1) {
				if(userResponse == 2) {
					lowerBound = guess;
				}
				if(userResponse == 3) {
					upperBound = guess;
				}

				guess = (upperBound+lowerBound)/2;
				tries += 1;

				System.out.printf("Is your number %d", guess);
				System.out.printf("[1] correct guess, \n[2] number is high, \n[3] number is lower:\n");
				userResponse = input.nextInt();
			}

			System.out.printf("I guessed your number in " + tries + " tries!\n");
		}

}
