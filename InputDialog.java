/**
 * Created by winniejeng on 1/2/18.
 */
import javax.swing.JOptionPane;

public class InputDialog {
    public static void main(String[] args) {
        //Entere annual interest rate
        String annualInterestRateString = JOptionPane.showInputDialog
                ("Enter yearly interest rate, \ni.e. 9.25");

        //Convert string to double
        double annualInterestRate = Double.parseDouble(annualInterestRateString);

        //Obtain monthly interest rate
        double monthlyInterestRate = annualInterestRate / 1200;

        //Enter number of years
        String numberOfYearsString = JOptionPane.showInputDialog
                ("Enter the number of years, \ni.e. 5");

        //Convert numberOfYears from string to integer
        int numberOfYears = Integer.parseInt(numberOfYearsString);

        //Enter loan amount
        String loanAmountString = JOptionPane.showInputDialog
                ("Enter loan amount, \ni.e. 120000.95");

        //Convert loanAmount from String to Double
        Double loanAmount = Double.parseDouble(loanAmountString);

        //Calculate payment
        double monthlyPayment = loanAmount * monthlyInterestRate /
                ( 1 - 1 / Math.pow( 1 + monthlyInterestRate, numberOfYears *12));
        double totalPayment = monthlyPayment * numberOfYears *12;

        //format to keep two digits after decimal point
        monthlyPayment = (int)(monthlyPayment * 100) / 100.0;
        totalPayment = (int)(totalPayment * 100) / 100.0;

        //Display results
        String output = "The monthly payment is " + monthlyPayment + "\nThe total payment is " + totalPayment;
        JOptionPane.showMessageDialog(null, output);

    }
}
