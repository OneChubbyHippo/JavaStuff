/**
 * Created by winniejeng on 1/8/18.
 */
import java.util.Scanner;

public class ISBNcheck {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        long isbn;

        do{
            System.out.println("Enter the first 9 digits of the ISBN: ");
            isbn = in.nextLong();
        } while(isbn > 999999999 || isbn < 10000000);

        //if the ISBN begins with the digit zero
        int d1;
        if(isbn > 10000000 && isbn < 99999999)
        {
            System.out.println("0" + isbn);
            d1 = 0;
        }

        else
        {
            System.out.println(isbn);
            //Find d1
            d1 = (int)(isbn / 100000000);
            isbn -= d1 * 100000000;
        }


        int checkSum;

        do{
            System.out.println("Enter the last digit of the ISBN: ");
            checkSum = in.nextInt();
        } while(checkSum > 9 || checkSum < 1);

        //Find d2
        int d2 = (int)(isbn / 10000000);
        if(d2 != 0)
        {
            isbn -= d2 * 10000000;
        }

        int d3 = (int)(isbn / 1000000);
        if(d3 != 0)
        {
            isbn -= d3 * 1000000;
        }

        int d4 = (int)(isbn / 100000);
        if(d4 != 0)
        {
            isbn -= d4 * 100000;
        }

        int d5 = (int)(isbn / 10000);
        if(d5 != 0)
        {
            isbn -= d5 * 10000;
        }

        int d6 = (int)(isbn / 1000);
        if(d6 != 0)
        {
            isbn -= d6 * 1000;
        }

        int d7 = (int)(isbn / 100);
        if(d7 != 0)
        {
            isbn -= d7 * 100;
        }

        int d8 = (int)(isbn / 10);
        if(d8 != 0)
        {
            isbn -= d8 * 10;
        }
        int d9 = (int)(isbn % 10);


        int ver = (d1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

        if (ver == checkSum)
        {
            System.out.println("The ISBN is correct");
        }
        else
        {
            System.out.println("Incorrect");
        }
    }
}
