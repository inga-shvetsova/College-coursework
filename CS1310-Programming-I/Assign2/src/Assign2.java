import java.util.Scanner;

public class Assign2 {
    public static void main(String[] args) {
        // Creat a Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount, e.g., 120000.95: ");
        double investmentAmount = input.nextDouble();

        System.out.print("Enter annual interest rate, e.g., 7.25: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter number of years as an integer, e.g., 5: ");
        int numberOfYears = input.nextInt();


        double monthlyInterestRate = annualInterestRate /1200;
        double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);


        System.out.println("Accumulated value is $" + (int)(futureInvestmentValue * 100) / 100.0);

        input.close();

        
    }
}
