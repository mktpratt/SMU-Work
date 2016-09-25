/**
 * DescribeProgramHere
 *
 * @author Mike Pratt -- A00320459
 * @version 1.0
 */

import java.util.Scanner;

public class SquareInteger
{

    public static void main(String[] args)
    {

        Scanner kbd = new Scanner (System.in);

        System.out.println("N\tN squared");
        System.out.println("--\t----------");
        int n = 1;
        for (; n <= 20; n++)
        {
            System.out.println(n + "\t" + (int)Math.round(Math.pow(n,2)));
        }

    }
}

