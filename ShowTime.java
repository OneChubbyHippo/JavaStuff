/**
 * Created by winniejeng on 1/3/18.
 */
import java.util.Scanner;

public class ShowTime {
    public static void main(String[] args) {

        System.out.println("Enter the time zone offset to GMT: ");
        Scanner in = new Scanner(System.in);

        int offset = in.nextInt();

        long totalMillis = System.currentTimeMillis();

        long totalSeconds = totalMillis / 1000;

        long currentSeconds = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long currentMinutes = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        long currentHours = totalHours % 24;

        long localHours = currentHours += offset;

        if (localHours > 24)
        {
            localHours -= 24;
        }

        else if (localHours < 0)
        {
            localHours += 24;
        }

        System.out.println(localHours + ":" + currentMinutes + ":" + currentSeconds);

    }
}
