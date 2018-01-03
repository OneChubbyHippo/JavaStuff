/**
 * Created by winniejeng on 1/1/18.
 */

import java.util.Scanner;

public class ComputeLoan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter yearly interest rate percentage: ");
        double annualInterestRate = input.nextDouble();

        double monthlyInterestRate = annualInterestRate / 1200;
        System.out.println(monthlyInterestRate);

        System.out.println("Enter the number of years: ");
        int numberOfYears = input.nextInt();

        System.out.println("Enter the loan amount: ");
        double loanAmount = input.nextDouble();

        double monthlyPayment = (loanAmount * monthlyInterestRate) /
                (1 - 1/Math.pow( 1 + monthlyInterestRate, numberOfYears * 12));

        double totalPayment = monthlyPayment * numberOfYears * 12;

        System.out.println("The monthly payment is " + (int)(monthlyPayment * 100) / 100.0);
        System.out.println("The total payment is " + (int)(totalPayment * 100) / 100.0);
    }
}
