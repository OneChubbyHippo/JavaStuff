/**
 * Created by winniejeng on 1/8/18.
 * Create a lottery machine that generates a random two-digit number,
 * prompts the user to guess the number of the digit,
 * and determines whether or not the user wins according to the following rule:
 * 1. If the input matches the lottery number in exact order, award $10,000
 * 2. If both digits of the input match both the digits of the lottery, award $3,000
 * 3. If one digit of the input matches a digit in the lottery, award $1,000
 * 4. If no digit of the input matches the lottery, no award
 */

import java.util.Scanner;

public class LotteryGame {
    public static void main(String[] args) {

        //Generate a lottery between 10 to 99
        int lottery;
        do
            {
                lottery = (int)(Math.random() * 100);
            } while (lottery < 10);

        //Prompt for user input
        System.out.println("Please enter a two-digit number for the lottery: ");
        Scanner in = new Scanner(System.in);

        //proof-check the input is between 10-99
        int input = in.nextInt();

        if (input < 10 || input > 99)
        {
            do {
                System.out.println("The lottery number has to be two digits. Try again: ");
                input = in.nextInt();
            } while (input < 10 || input > 99);
        }

        //Check to see if the user wins $10,000
        int lotteryDigit1 = lottery / 10;
        int lotteryDigit2 = lottery % 10;
        int inputDigit1 = input / 10;
        int inputDigit2 = input % 10;

        if (lottery == input)
        {
            System.out.println("Congratulations! The lottery number is " + lottery +
                    "! You've won $10,000");
        }
        else if (lotteryDigit1 == inputDigit2 && lotteryDigit2 == inputDigit1)
        {
            System.out.println("Great job! The lottery number is " + lottery +
                    "! You've won $3,000");
        }
        else if (lotteryDigit1 == inputDigit1 || lotteryDigit1 == inputDigit2
                || lotteryDigit2 == inputDigit1 || lotteryDigit2 == inputDigit2)
        {
            System.out.println("The lottery number is " + lottery +
                    "! You've won $1,000");
        }
        else
        {
            System.out.println("You did not win. The lottery number is " + lottery);
        }
//        System.out.println(lottery + " " + input);
//        System.out.println("done");

    }
}
