/**
 * Created by winniejeng on 1/2/18.
 * Convert Celsius to Fahrenheit or vice versa
 */
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println
                ("To convert from Celsius to Fahrenheit, Enter 1" +
                        ",\nTo convert from Fahrenheit to Celsius, Enter 2");
        int option = input.nextInt();

        if (option != 1 && option != 2)
        {
            while (option != 1 && option != 2)
            {
                System.out.println("Erroneous option. Please enter again");
                option = input.nextInt();
            }
        }

        //Convert Celsius to Fahrenheit,
        if (option == 1)
        {
            System.out.println("Enter degree Celsius, i.e. 18.2: ");
            double celsius = input.nextDouble();
            double fahrenheit = celsius * (9.0/5) + 32;
            System.out.println(celsius + " degree Celsius is " +
                    (int)(fahrenheit * 100) / 100.0 + " degree Fahrenheit.");
        }

        else
        {
            System.out.printf("Enter degree Fahrenheit, i.e. 74.1: ");
            double fahrenheit = input.nextDouble();
            double celsius = ( fahrenheit - 32 ) * (5.0/9);
            System.out.println(fahrenheit + " degree Fahrenheit is " +
                    (int)(celsius * 100) / 100.0 + " degree Celsius.");
        }
    }

}
