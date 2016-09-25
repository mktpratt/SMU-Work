import java.util.Scanner;
import java.util.Arrays;

/**
 * A program to print information on various Measurable objects
 *
 * @author Mark Young (A00000000)
 * @author Mike Pratt (A00320459)
 * @version 1.0
 */
public class FigureInfo
{
    public static final int NUM_SHAPES = 4;
    public static final int FIGS_PER_SHAPE = 3;
    public static final int TOTAL_FIGS = NUM_SHAPES * FIGS_PER_SHAPE;

    public static void main(String[] args)
    {
        Scanner kbd = new Scanner(System.in);

        // introduce yourself
        System.out.print("\n\n"
                         + "Sorted Figure Info\n"
                         + "------------------\n\n"
                         + "This program reads in the sizes of several shapes "
                         + "then prints out\ninformation about them "
                         + "in order from smallest to largest.\n\n"
                         + "by Mark Young (A00000000) and Mike Pratt (A00320459)\n\n");
        // TODO: delete this note when it's complete!
        System.out.print("NOTE:  currently INCOMPLETE\n\n");

        // declare variables
        double width;   // width of various figures
        double height;  // height of various figures
        int shapeCounter = 0;
        // TODO: make an array for up to TOTAL_FIGS measurable shapes
        Measurable[] shapes = new Measurable[TOTAL_FIGS];

        // get Rectangles (TODO: revise to read FIGS_PER_SHAPE of them)
        for (int i = 0; i < FIGS_PER_SHAPE; i++)
        {
            System.out.print("Enter the width and height of a rectangle: ");
            width = kbd.nextDouble();
            height = kbd.nextDouble();
            kbd.nextLine();
            Rectangle r = new Rectangle(width, height);
            // TODO: revise to add r to the array of measurable shapes
            shapes[shapeCounter] = r;
            shapeCounter++;
        }

        // get Ovals (TODO: revise to read FIGS_PER_SHAPE of them)
        for (int i = 0; i < FIGS_PER_SHAPE; i++)
        {
            System.out.print("Enter the width and height of an oval: ");
            width = kbd.nextDouble();
            height = kbd.nextDouble();
            kbd.nextLine();
            Oval o = new Oval(width, height);
            // TODO: revise to add o to the array of measurable shapes
            shapes[shapeCounter] = o;
            shapeCounter++;
        }
        // get Triangles (TODO: revise to read FIGS_PER_SHAPE of them)
        for (int i = 0; i < FIGS_PER_SHAPE; i++)
        {
            System.out.print("Enter the width and height of a triangle: ");
            width = kbd.nextDouble();
            height = kbd.nextDouble();
            kbd.nextLine();
            Triangle t = new Triangle(width, height);
            // TODO: revise to add t to the array of measurable shapes
            shapes[shapeCounter] = t;
            shapeCounter++;
        }

        // get Circles (TODO: revise to read FIGS_PER_SHAPE of them)
        for (int i = 0; i < FIGS_PER_SHAPE; i++)
        {
            System.out.print("Enter the diameter of a circle: ");
            width = kbd.nextDouble();
            kbd.nextLine();
            Circle c = new Circle(width/2.0);
            // TODO: revise to add c to the array of measurable shapes
            shapes[shapeCounter] = c;
            shapeCounter++;
        }

        // TODO: Sort the array
        Arrays.sort(shapes);

        // Print out the sorted array (TODO: revise to print array elements)
        System.out.println();
        System.out.println(figureInfoHeader());
        //System.out.println(className(c) + figureInfo(c));
        //System.out.println(className(o) + figureInfo(o));
        //System.out.println(className(t) + figureInfo(t));
        //System.out.println(className(c) + figureInfo(c));
        System.out.println();

    }

    // Create the header for the shape information table
    public static String figureInfoHeader()
    {
        return String.format("%-10s%10s%10s%20s%20s",
                             "Type",
                             "Width", "Height",
                             "Area", "Perimeter")
               + "\n"
               + String.format("%-10s%10s%10s%20s%20s",
                               "----------",
                               "-----", "------",
                               "---------", "---------");
    }

    // Create the data values for one row of the shape information table
    public static String figureInfo(Measurable m)
    {
        return String.format("%10.1f%10.1f%20.1f%20.1f",
                             m.getWidth(), m.getHeight(),
                             m.getArea(), m.getPerimeter());
    }

    // get the object's class name as a 10+ character wide String
    // (for the left column of the shape information table)
    public static String className(Object o)
    {
        return String.format("%-10s", o.getClass().getName());
    }
}
