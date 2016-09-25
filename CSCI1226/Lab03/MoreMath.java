import java.util.Scanner;
public class MoreMath 
{
    public static final double PI = 3.14159;
        public static void main(String[] args) 
        {
        Scanner kbd = new Scanner (System.in);
        double radius, area;
        System.out.println("Circle Measurements\n");
        System.out.print("Enter the radius of the circle: ");
        radius = kbd.nextDouble();
        if (radius > 0)
            {
            area = PI * Math.pow(radius,2);    // should be pi times radius squared
            System.out.println("    Radius: " + radius + " cm");
            System.out.println("    Area:   " + area + " cm squared");
            }
        else
            System.out.println("\nThe radius cannot be negative!");
        
        

        int x1, y1, x2, y2, roundedDistance;
        double distance;
        System.out.print("\nEnter the co-ordinates for the first point: ");
        x1 = kbd.nextInt();
        y1 = kbd.nextInt();
        kbd.nextLine();
        System.out.print("\nEnter the co-ordinates for the second point: ");
        x2 = kbd.nextInt();
        y2 = kbd.nextInt();
        kbd.nextLine();
        distance = Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2));;  /* should be:
                                    -------------------------
                                   /          2            2
                               \  /  (x  - x )  + (y  - y )
                                \/     1    2       1    2

                                     the square root of
                                        (x1 minus x2) squared
                                        plus
                                        (y1 minus y2) squared */
        roundedDistance = (int)Math.round(distance);
        System.out.println("\nPoint Measurements");
        System.out.println("    Point 1: (" + x1 + ", " + y1 + ")");
        System.out.println("    Point 2: (" + x2 + ", " + y2 + ")");
        System.out.println("    Distance: " + roundedDistance);
    }
}

