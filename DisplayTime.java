/**
 * Created by winniejeng on 1/1/18.
 */
import java.util.Scanner;

public class DisplayTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount of total seconds: ");
        int seconds = input.nextInt();

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        if (minutes == 1 || minutes == 0 && remainingSeconds != 1)
        {
            System.out.println(seconds + " seconds is equivalent to " + minutes +
                    " minute and " + remainingSeconds + " seconds");
        }

        else if (minutes != 1 && remainingSeconds == 1 || remainingSeconds == 0)
        {
            System.out.println(seconds + " seconds is equivalent to " + minutes +
                    " minutes and " + remainingSeconds + " second");
        }

        else if (remainingSeconds == 1 && minutes == 1)
        {
            System.out.println(seconds + " seconds is equivalent to " + minutes +
                    " minute and " + remainingSeconds + " second");
        }

        else
        {
            System.out.println(seconds + " seconds is equivalent to " + minutes +
                    " minutes and " + remainingSeconds + " seconds");
        }



    }
}
