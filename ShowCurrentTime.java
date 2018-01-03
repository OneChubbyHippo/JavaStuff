/**
 * Created by winniejeng on 1/1/18.
 */
public class ShowCurrentTime {
    public static void main(String[] args) {

        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;

        long currentSeconds = (int)(totalSeconds % 60);

        long totalMinutes = totalSeconds / 60;

        long currentMinutes = (int)(totalMinutes % 60);

        long totalHours = totalMinutes / 60;

        long currentHours = (int)(totalHours % 24);

        System.out.println(currentHours + ":" + currentMinutes
                + ":" + currentSeconds + " GMT");
    }
}
