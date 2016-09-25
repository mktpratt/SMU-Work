/**
 * DescribeProgramHere
 *
 * @author Mike Pratt -- A00320459
 * @version 1.0
 */

import java.util.Scanner;

public class Triangle
{

    public static void main(String[] args)
    {

        Scanner kbd = new Scanner (System.in);
        int triangleSize;
        System.out.print("\nEnter the size for a triangle: ");
        triangleSize = kbd.nextInt();
        for (int height = triangleSize; triangleSize > 0; triangleSize--)
        {
            System.out.println();
            for (int base = triangleSize; base > 0; base--)
            {
                System.out.print("*");
            }
        }
        System.out.println("\n");


    }
}

