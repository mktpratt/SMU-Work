import java.util.Scanner;

/**
 * A program to calculate the average of numbers entered by the user.
 *
 * @author Mark Young
 * Edited by Mike Pratt (2011-9-14) 
 * @version 1.0, 2009-05-05
 */

public class JavaAverage {
    public static void main(String[] args) {
        // Identify myself...
        System.out.print("\n\n\n\n\n\n\n\n\n\n"
         + "Sample Program (Java)\n"
         + "=====================\n\n"
         + "Finds the average of positive integers entered by the user.\n"
         + "Enter a negative number to stop input.\n\n\n\n");

        // Declare and initialize variables
        int sum = 0;
        int count = 0;
        int n;

        // Get the input from the user
        System.out.print("Enter a number: ");
        Scanner kbd = new Scanner(System.in);
        n = kbd.nextInt();
        while (n >= 0) {
            sum += n; count++;
            System.out.print("Enter another number or -1 to end: ");
            n = kbd.nextInt();
        }

        // Print the result
        System.out.print("\n\nAverage = "
         + (sum/count)
         + ".\n\n");
    }
}

