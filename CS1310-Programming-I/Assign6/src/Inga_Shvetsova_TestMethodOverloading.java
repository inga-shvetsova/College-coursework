public class Inga_Shvetsova_TestMethodOverloading {
	/**Main Method */
	public static void main(String[] args) {
		//Invoke the min method with int parameters
		System.out.println("The minimum of 3 and 4 is " 
				+ min(3, 4));
		
		//Invoke the min method with the double parameters
		System.out.println("The minimum of 3.0 and 5.4 is "
				+ min(3.0, 5.4));
		
		//Invoke the min method with three double parameters
		System.out.println("The minimum of 3.0, 5.4, and 10.14 is "
				+ min(3.0, 5.0, 10.14));
	}
	
	/** Return the min of two int values */
	public static int min(int num1, int num2) {
		if (num1 < num2)
			return num1;
		else
			return num2;
	}
	
	/** Find the min of two double values */
	public static double min(double num1, double num2) {
		if (num1 < num2)
			return num1;
		else
			return num2;
	}
	
	/** Return the min of three double values */
	public static double min(double num1, double num2, double num3) {
		return min(min(num1, num2), num3);
	}
}