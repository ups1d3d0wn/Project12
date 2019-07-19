import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		int number1;
		int number2;
		int sum;

		Scanner input = new Scanner(System.in);
		System.out.println("enter number 1: ");
		number1 = input.nextInt();
		System.out.println("enter number 2: ");
		number2 = input.nextInt();

		sum = number1 + number2;
		System.out.println(sum);

	}
}