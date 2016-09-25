/**
 * Simulate a bouncing ball with gravity
 *
 * @author Mike Pratt -- A00320459
 * @version 1.0
 */

import java.util.Scanner;

public class BouncingBall
{
    public static final double GRAVITATIONAL_PULL = 9.81;

    public static void main(String[] args)
    {
        double ballVelocity, ballHeight = 0;
        int seconds = 0;

        Scanner kbd = new Scanner (System.in);

        System.out.println("\n\nBouncing Ball Simulation");
        System.out.println("------------------------\n");
        System.out.println("by Mike Pratt (A00320459)\n");
        System.out.println("This program simulates a bouncing ball\n");
        System.out.print("Enter the initial (upward) velocity for" +
                         " the ball (in m/s): ");

        ballVelocity = kbd.nextDouble();
        kbd.nextLine();
        System.out.println();
        if (ballVelocity > 0)
        {
            for (int bounce = 1; bounce <= 5; bounce++)
            {
                while (ballHeight >= 0)
                {
                    System.out.println("Height at " + seconds + " seconds: " +
                                       ballHeight);
                    ballHeight += ballVelocity;
                    ballVelocity -= GRAVITATIONAL_PULL;
                    seconds++;
                }
                System.out.println("\nBounce #" + bounce + " at " + seconds
                                   + " seconds.\n\nPress Enter...");
                kbd.nextLine();
                ballVelocity *= -0.5;
                ballHeight *= -0.5;
            }
            System.out.println("The total time for five bounces was " +
                               seconds + " seconds.\n");
        }
        else
            System.out.println("You did not enter an"
                               + "upward velocity.\n");
    }
}

