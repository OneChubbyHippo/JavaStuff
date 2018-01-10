/**
 * Created by winniejeng on 1/8/18.
 */
public class SortNumbers {
    public static void main(String[] args) {

        int num1 = (int)(Math.random() * 100);
        int num2;
        do {
            num2 = (int)(Math.random() * 100);
        } while (num1 == num2);

        int num3;
        do {
            num3 = (int)(Math.random() * 100);
        } while (num1 == num3);

        boolean oneBiggerThanTwo = num1 > num2;

        //if 1 > 2
        if (oneBiggerThanTwo == true)
        {
            boolean threeTheGreatest = num1 < num3;
            boolean twoTheSmallest = num2 < num3;

            //3 > 1 > 2
            if(threeTheGreatest == true && twoTheSmallest == true)
            {
                System.out.println(num3 + " > " + num1 + " > " + num2);
            }

            // 1 > 3 > 2
            else if (threeTheGreatest == false && twoTheSmallest == true)
            {
                System.out.println(num1 + " > " + num3 + " > " + num2);
            }

            //1 > 2 > 3 if threeTheGreatest = false and twoTheSmallest = false
            else
            {
                System.out.println(num1 + " > " + num2 + " > " + num3);
            }
        }

        else // 2 > 1 oneGreaterThanTwo = false
        {
            boolean twoTheGreatest = num2 > num3;
            boolean oneTheSmallest = num1 < num3;

            // 3 > 2 > 1
            if(twoTheGreatest == false && oneTheSmallest == true)
            {
                System.out.println(num3 + " > " + num2 + " > " + num1);
            }

            // 2 > 3 > 1
            else if(twoTheGreatest == true && oneTheSmallest == true)
            {
                System.out.println(num2 + " > " + num3 + " > " + num1);
            }

            // 2 > 1 > 3
            else
            {
                System.out.println(num2 + " > " + num1 + " > " + num3);
            }
        }

    }
}
