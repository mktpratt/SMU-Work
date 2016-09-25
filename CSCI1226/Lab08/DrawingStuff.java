import java.util.Scanner;

/**
 * DO NOT MODIFY THIS PROGRAM
 *
 * @author Mark Young (A00000000)
 * @version 1.0
 */
public class DrawingStuff
{
    public static void main(String[] args)
    {
        Scanner kbd = new Scanner(System.in);
        Draw myDraw = new Draw();
        String myID;

        // print identification
        myID = myDraw.myIdentification();
        System.out.print("\n\n"
            + "Drawing Stuff\n"
            + "-------------\n\n"
            + "by " + myID + "\n");

        // draw 5x5 square
        System.out.println("\nA square:\n");
        myDraw.drawSquare(5);

        // draw 3x30 rectangle
        System.out.println("\nA 3 x 30 rectangle:\n");
        myDraw.drawRectangle(3, 30);

        // draw smaller square (2x2)
        System.out.println("\nA smaller square:\n");
        myDraw.drawSquare(2);

        // draw 10x3 rectangle
        System.out.println("\nA 10 x 3 rectangle:\n");
        myDraw.drawRectangle(10, 3);

        // thank user
        System.out.println("\nI, " + myID + ", "
            + "would like to thank you for using my program.\n");
    }
}

