import java.util.Scanner;

/** draw some rectangles */
public class Rectangles
{
    public static void main(String[] args)
    {
        Scanner kbd = new Scanner(System.in);
        int height = 0, width = 0;

        // introduce yourself
        System.out.print("\n\n"
                         + "Drawing Rectangles\n"
                         + "------------------\n\n");

        do
        {
            // get height and width from user
            System.out.print("Enter the height and width of a rectangle: ");
            height = kbd.nextInt();
            if (height > 0)
            {
                width = kbd.nextInt();
            }
            kbd.nextLine();

            if (height >= 0 && width >= 0)
            {
                // draw the rectangle
                System.out.println("\n"
                                   + "Here is your rectangle:");
                drawRectangle(height, width);


                // leave blank lines at end
                System.out.print("\n\n");
            }
        }
        while (height >= 0 && width >= 0);

    }

    // draw one rectangle of the specified height and width
    private static void drawRectangle(int height, int width)
    {
        for (int h = 1; h <= height; h++)
        {
            for (int w = 1; w <= width; w++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

