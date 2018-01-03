/**
 * Created by winniejeng on 1/2/18.
 */
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter an integer between 0 and 999: ");
        int number = in.nextInt();

        if (number < 0 || number > 999)
        {
            do
            {
                System.out.println("Erroneous input. " +
                        "Please enter an integer between 0 and 999: ");
                number = in.nextInt();
            } while (number < 0 || number > 999);
        }

        int hundredth = number / 100;
        number %= 100;
        int tenth = number / 10;
        int unit = number % 10;
        int sum = hundredth + tenth + unit;

        System.out.println("the sum of the digits " + hundredth + tenth + unit + " is " + sum);
    }

}
