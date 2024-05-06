import java.util.Scanner;

public class Assign5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter number
		System.out.print("Enter numbers: ");
		int max = input.nextInt();	// Assign the first number to max
		int count = 1;					// Assign 1 to count
		int number = 0;						// Holds future inputs

		// Assume that the input ends with number 0
		do {
			number = input.nextInt();
			if (number > max) {
				max = number;
				count = 1;
			}
			else if (number == max)
				count++;
		} while (number > 0);

		// Display to results
		System.out.println("The largest number is " + max);
		System.out.println(
			"The occurrence count of the largest number is " + count);

		input.close();
	}
}