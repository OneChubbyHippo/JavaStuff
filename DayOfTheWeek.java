/**
 * Created by winniejeng on 1/2/18.
 * Q: If today is Tuesday, what is the day of the week in 100 days?
 */

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int day = -1;

        while (day < 0)
        {
            System.out.println("What is the starting day of the count? i.e. Tuesday: ");
            String dayString = in.next();

            if (dayString.equals("Monday") || dayString.equals("monday"))
            {
                day = 0;
                System.out.println(day);
            }
            else if (dayString.equals("Tuesday") || dayString.equals("tuesday"))
            {
                day = 1;
            }
            else if (dayString.equals("Wednesday") || dayString.equals("wednesday"))
            {
                day = 2;
            }
            else if (dayString.equals("Thursday") || dayString.equals("thursday"))
            {
                day = 3;
            }
            else if (dayString.equals("Friday") || dayString.equals("friday"))
            {
                day = 4;
            }
            else if (dayString.equals("Saturday") || dayString.equals("saturday"))
            {
                day = 5;
            }
            else if (dayString.equals("Sunday") || dayString.equals("sunday"))
            {
                day = 6;
            }
            else
            {
                System.out.println("Uh-oh. Check your spelling.");
            }

            System.out.println("Enter the number of days passed. i.e. 100: ");
            int daysPassed = in.nextInt();

            int newDay = (day + daysPassed) % 7;

            switch(newDay)
            {
                case 0: dayString = "Monday";
                break;
                case 1: dayString = "Tuesday";
                break;
                case 2: dayString = "Wednesday";
                break;
                case 3: dayString = "Thursday";
                break;
                case 4: dayString = "Friday";
                break;
                case 5: dayString = "Saturday";
                break;
                case 6: dayString = "Sunday";
                break;
                default: dayString = "Error";
                break;
            }

            System.out.println("After " + daysPassed + " days, it will be " + dayString);
        }



    }
}
