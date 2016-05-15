import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");

		System.out.println("Please enter three different numbers to find largest of them");

		System.out.println("Please enter integer a:");
		int a = input.nextInt();

		System.out.println("Please enter integer b:");
		int b = input.nextInt();

		System.out.println("Please enter integer c:");
		int c = input.nextInt();

		if (a > b && a > c) {
			System.out.println("The bigger number is: " + a);

		} else if (b > a && b > c) {
			System.out.println("The bigger number is: " + b);

		} else if (c > a && c > b) {
			System.out.println("The bigger number is: " + c);

		} else {
			System.out.println("Entered numbers are not distinct.");
		}

		input.close();
	}
}
