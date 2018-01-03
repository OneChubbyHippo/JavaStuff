/**
 * Created by winniejeng on 1/3/18.
 */
import java.util.Scanner;
public class FutureInvestment {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the investment amount: ");
        double principal = in.nextDouble();

        System.out.println("Enter the monthly interest rate: ");
        double interestRate = in.nextDouble() / 100.0;

        System.out.println("Enter the number of years: ");
        double years = in.nextDouble();

        double accumulatedValue = (principal * Math.pow(1 + interestRate, years));

        System.out.println("Accumulated value is " + accumulatedValue);

    }
}
