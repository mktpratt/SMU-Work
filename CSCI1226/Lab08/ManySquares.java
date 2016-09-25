import java.util.Scanner;

/**
 * Draws one square of a length provided by the user.
 */
public class ManySquares
{
    public static void main(String[] args)
    {
        Scanner kbd = new Scanner(System.in);
        int length;

        // introduce self
        System.out.print("\n\n"
                         + "Square Drawing Program\n"
                         + "----------------------\n\n");

        // ask for length of side
        System.out.print("Enter a length: ");
        length = kbd.nextInt();
        kbd.nextLine();
        while (length > 0 )
        {
            // draw square
            for (int l = 1; l <= length; l++)
            {
                for (int s = 1; s <= length; s++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.print("Enter a length: ");
            length = kbd.nextInt();
            kbd.nextLine();
        }
        System.out.println();

    }
}

