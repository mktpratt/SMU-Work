import java.util.Scanner;
import java.awt.*;
import javax.swing.*;

/**
 * A window with a fern in it (and a program to create them)
 *
 * @author Mike Pratt
 * @version 1.0
 */

public class FernWindow extends JFrame
{

    // here is the program
    public static void main(String[] args)
    {
        Scanner kbd = new Scanner(System.in);

        System.out.println("\n\n"
                + "Fern Drawing Program\n"
                + "--------------------\n\n");

        System.out.print("How big should the window be (width height)? ");
        int width = kbd.nextInt();
        int height = kbd.nextInt(); kbd.nextLine();
        if (width <= 0) width = 800;
        if (height <= 0) height = 600;

        String resp;
        do
        {
            System.out.println();
            System.out.print("Where should the root of the fern be? ");
            int x = kbd.nextInt();
            int y = kbd.nextInt();  kbd.nextLine();

            System.out.print("What angle should the fern grow at "
                    + "(180 = straight up)? ");
            int angle = kbd.nextInt();  kbd.nextLine();

            System.out.print("And what height should the fern be? ");
            int size = kbd.nextInt();   kbd.nextLine();

            FernWindow win = new FernWindow(width, height, x, y, angle, size);
            win.setVisible(true);

            // ask if there's more
            System.out.print("another (y/n)> ");
            resp = kbd.nextLine().toUpperCase();
        } while (resp.startsWith("Y"));
        System.exit(0);
    }

    // here is the class
    private Graphics canvas;
    private double rootX;
    private double rootY;
    private double rootAngle;
    private double fullSize;

    public FernWindow(int w, int h, double x, double y, double a, double s)
    {
        super("A Fern by Mike Pratt");
        setSize(w, h);
        setBackground(Color.BLACK);
        rootX = x;
        rootY = y;
        rootAngle = a;
        fullSize = s;
    }

	public void paint(Graphics g) {
		canvas = g;
		canvas.setColor(new Color(0, 127, 0));
		drawFern(rootX, rootY, rootAngle, fullSize);
	}

	public void drawFern(double x, double y, double angle, double size) 
    {
	   double[] end;
	   double length = size * 0.5;
	   end = drawStem(x, y, angle, length);
	   if (size > 1.0) {
	       double smaller = size * 0.4;
	       drawFern(end[0], end[1], angle+60, smaller);
	       drawFern(end[0], end[1], angle, smaller);
	       drawFern(end[0], end[1], angle-60, smaller);
        }
	}

	public double[] drawStem(double x, double y, double angle, double length) {
	   double[] end = new double[2];
	   double radians = Math.toRadians(angle);
	   end[0] = x + Math.sin(radians) * length;
	   end[1] = y + Math.cos(radians) * length;
	   drawLine(x, y, end[0], end[1]);
	   return end;
	}

	public void drawLine(double x1, double y1, double x2, double y2) {
	   int startX = (int)Math.round(x1);
       int startY = (int)Math.round(y1);
       int endX = (int)Math.round(x2);
       int endY = (int)Math.round(y2);
	   canvas.drawLine(startX, startY,  endX, endY);
	}
}

