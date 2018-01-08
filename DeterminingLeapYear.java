/**
 * Created by winniejeng on 1/8/18.
 */

import java.util.Scanner;

public class DeterminingLeapYear {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();

        boolean isLeapYear = (year % 4 == 0 || year % 400 == 0);
        System.out.println(year + " is a leap year? " + isLeapYear);
    }
}
