/**
 * DescribeProgramHere
 *
 * @author Mike Pratt -- A00320459
 * @version 1.0
 */

import java.util.Scanner;

public class Hailstone
{

    public static void main(String[] args)
    {

        int userNum, hailstoneNum;
        Scanner kbd = new Scanner (System.in);

        System.out.println("\n\nHailstone");
        System.out.println("---------\n");
        System.out.println("by Mike Pratt (A00320459)\n");


        System.out.println("Enter a whole number: ");
        userNum = kbd.nextInt();



        switch (userNum % 2)
        {
        case 0:
            hailstoneNum = userNum / 2;
            System.out.println("You entered " + userNum + "."
                               + "The next hailstone number after that is " + hailstoneNum + ".");
            break;
        default:
            hailstoneNum = (3 * userNum) + 1;
            System.out.println("You entered " + userNum + "."
                               + "The next hailstone number after that is " + hailstoneNum + ".");
            break;
        }
    }
}

