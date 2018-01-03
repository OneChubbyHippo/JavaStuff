/**
 * Created by winniejeng on 1/1/18.
 */
import java.util.Scanner;

public class CashDrawer {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount of cash, to two decimal precision: ");
        double amount = input.nextDouble();

        System.out.println("Enter the price of the item, to two decimal precision: ");
        double price = input.nextDouble();

        int totalChange = (int)((amount - price)*100);

        int dollarChange = totalChange / 100;
        totalChange %= 100;

        int quarterChange = totalChange / 25;
        totalChange %= 25;

        int dimeChange = totalChange / 10;
        totalChange %= 10;

        int nickleChange = totalChange / 5;
        totalChange %= 5;

        int pennyChange = totalChange;

        System.out.println("Withdraw from the cash drawer: ");
        if ( dollarChange != 0)
        {
            System.out.println(dollarChange + " dollars ");
        }
        if ( quarterChange != 0)
        {
            System.out.println(quarterChange + " quarters ");
        }
        if( dimeChange !=0 )
        {
            System.out.println(dimeChange + " dimes ");
        }
        if( nickleChange != 0)
        {
            System.out.println(nickleChange + " nickles ");
        }
        if( pennyChange != 0)
        {
            System.out.println(pennyChange + " pennies");
        }


    }

}
