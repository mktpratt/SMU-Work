/**
 * A collection of methods for drawing ferns.
 *
 * @author Mark Young
 * @version 1.0
 */

import java.util.Scanner;
import java.awt.*;
import javax.swing.*;

public class FernWindow extends JFrame
{
    public static final int BAR_HEIGHT = 30;

    // here is the program
    public static void main(String[] args)
    {
        Scanner kbd = new Scanner(System.in);

        // identify self
        System.out.println("\n\n"
                           + "Fern Drawing Program\n"
                           + "--------------------\n\n");

        // get window information
        System.out.print("How big should the window be (width height)? ");
        int width = kbd.nextInt();
        int height = kbd.nextInt();
        kbd.nextLine();
        // reasonable defaults for unreasonable users!
        if (width <= 0) width = 800;
        if (height <= 0) height = 600;

        // keep drawing ferns until user says to stop
        String resp;
        do
        {
            // get the fern's root
            System.out.println();
            System.out.print("Where should the root of the fern be? ");
            int x = kbd.nextInt();
            int y = kbd.nextInt();
            kbd.nextLine();

            // get the fern's angle of growth
            System.out.print("What angle should the fern grow at "
                             + "(180 = straight up)? ");
            int angle = kbd.nextInt();
            kbd.nextLine();

            // get the fern's height
            System.out.print("And what height should the fern be? ");
            int size = kbd.nextInt();
            kbd.nextLine();

            // make and show the window
            FernWindow win = new FernWindow(width, height, x, y, angle, size);
            win.setVisible(true);

            // ask if there's more
            System.out.print("another (y/n)> ");
            resp = kbd.nextLine().toUpperCase();
        }
        while (resp.startsWith("Y"));

        // because we created windows, Java needs to be told we're done!
        System.exit(0); // exit code 0 ==> all is OK
    }

    // ***** and here is the class ***** //

    // instance variables
    private Graphics canvas;
    private double rootX;
    private double rootY;
    private double rootAngle;
    private double fullSize;

    // constructor
    public FernWindow(int w, int h, double x, double y, double a, double s)
    {
        // set window title, size and background colour
        super("A Fern by MYoung");
        setSize(w, h+BAR_HEIGHT);
        setBackground(Color.BLACK);

        // save fern information -- so we can re-draw as required
        rootX = x;
        rootY = y;
        rootAngle = a;
        fullSize = s;
    }

    /** method to draw in the window */
    public void paint(Graphics g)
    {
        canvas = g;
        canvas.setColor(new Color(0, 127, 0));

        // draw the fern using the saved information
        drawFern(rootX, rootY+BAR_HEIGHT, rootAngle, fullSize);
    }

    /** method to draw the fern itself */
    public void drawFern(double x, double y, double angle, double size)
    {
        // draw the stem and remember where it ends
        double[] end;
        double length = size * 0.6;
        end = drawStem(x, y, angle, length);

        // if it's big enuf...
        if (size > 1.0)
        {
            // ... draw the fronds
            double smaller = size * 0.4;
            angle -= 10;
            drawFern(end[0], end[1], angle+60, smaller);
            drawFern(end[0], end[1], angle, smaller);
            drawFern(end[0], end[1], angle-60, smaller);
        }
    }

    /** method to draw the stem of the fern */
    public double[] drawStem(double x, double y, double angle, double length)
    {
        // figure out the end point of the required line
        double[] end = new double[2];
        double radians = Math.toRadians(angle);
        end[0] = x + Math.sin(radians) * length;
        end[1] = y + Math.cos(radians) * length;

        // draw the line from the start point to the end point
        drawLine(x, y, end[0], end[1]);

        // return the end point so fronds can grow from it
        return end;
    }

    /** method to draw a line */
    public void drawLine(double x1, double y1, double x2, double y2)
    {
        // round off end points to nearest integer values (pixel locations)
        int startX = (int)Math.round(x1);
        int startY = (int)Math.round(y1);
        int endX = (int)Math.round(x2);
        int endY = (int)Math.round(y2);

        // tell the canvas to draw the line between those pixels (it knows how)
        canvas.drawLine(startX, startY,  endX, endY);
    }
}

