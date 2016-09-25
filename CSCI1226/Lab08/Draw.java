/**
 * DescribeProgramHere
 *
 * @author Mike Pratt -- A00320459
 * @version 1.0
 */

import java.util.Scanner;

public class Draw
{

    public String myIdentification()
    {
        return ("Mike Pratt (A00320459)");
    }
    public int drawSquare(int size)
    {
        for (int l = 1; l <= size; l++)
        {
            for (int s = 1; s <= size; s++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        return (0);
    }
    public int drawRectangle(int height, int width)
    {
        for (int l = 1; l <= height; l++)
        {
            for (int s = 1; s <= width; s++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        return (0);
    }
}

