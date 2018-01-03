/**
 * Created by winniejeng on 1/2/18.
 */
import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the price. Enter 0 to indicate finished: ");
        double subtotal = input.nextDouble();

        if (subtotal == 0)
        {
            do
            {
                System.out.println("You cannot enter 0 for the first item. Please enter an actual price: ");
                subtotal = input.nextDouble();

            } while (subtotal == 0);
        }

        double newPrice;

        do {
            //Adding up prices until exit - 0
            System.out.println("Add more items. Enter 0 to indicate finished: ");
            newPrice = input.nextDouble();
            subtotal += newPrice;
        } while (newPrice != 0);

        System.out.println("$" + (int)(subtotal * 100) / 100.0 + " is your subtotal");

        double total = subtotal * 0.09 + subtotal;
        System.out.println("$" + (int)(total * 100) / 100.0 + " is your total after tax");
    }
}

