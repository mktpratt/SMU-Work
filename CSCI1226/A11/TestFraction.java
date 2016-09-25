import java.util.Scanner;

/**
 * A program to test out my Fraction class
 *
 * @author A00000000 YOUNG, Mark
 * @version 3.00 2011-11-16
 */
public class TestFraction
{
    public static void main(String[] args)
    {
        System.out.print("\n\n"
            + "Fraction Tester\n"
            + "---------------\n\n"
            + "This program tests the functionality "
            + "of the Fraction class.\n\n");
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction(5);
        Fraction f3 = new Fraction(1, 2);
        Fraction f4 = new Fraction(-7, 3);
        Fraction f5 = new Fraction(f3);
        Fraction f6 = new Fraction(2, 4);
        Fraction f7 = new Fraction(2, 0);
        Fraction f8 = new Fraction(2, -4);

        System.out.println("New fraction (should be 0/1): " + f1);
        System.out.println("New fraction (should be 5/1): " + f2);
        System.out.println("New fraction (should be 1/2): " + f3);
        System.out.println("New fraction (should be -7/3): " + f4);
        System.out.println("New fraction (should be 1/2): " + f5);
        System.out.println("New fraction (should be 2/4): " + f6);
        System.out.println("New fraction (should be 0/1): " + f7);
        System.out.println("New fraction (should be -2/4): " + f8);
        pause();

        System.out.println("double value (should be 0.0): " + f1.toDouble());
        System.out.println("double value (should be 5.0): " + f2.toDouble());
        System.out.println("double value (should be 0.5): " + f3.toDouble());
        System.out.println("double value (should be -2.33ish): " 
            + f4.toDouble());
        System.out.println("double value (should be 0.5): " + f5.toDouble());
        System.out.println("double value (should be 0.5): " + f6.toDouble());
        pause();

        System.out.println("f1.equals(f2) (should be false): "
                           + f1.equals(f2));
        System.out.println("f3.equals(f5) (should be true): "
                           + f3.equals(f5));
        System.out.println("f3.equals(f6) (should be true): "
                           + f3.equals(f6));
        pause();

        System.out.println("Now for some multiplication!");
        System.out.println("This product should be 1/4: " + f3.times(f3));
        System.out.println("  This fraction should still be 1/2: " + f3);
        System.out.println("This product should be -35/3: " + f2.times(f4));
        System.out.println("  This fraction should still be 5/1: " + f2);
        System.out.println("  This fraction should still be -7/3: " + f4);
        System.out.println("This product should be -7/6: " + f3.times(f4));
        System.out.println("  This fraction should still be 1/2: " + f3);
        System.out.println("  This fraction should still be -7/3: " + f4);
        System.out.println("This product should be 3/2: " + f3.times(3));
        System.out.println("  This fraction should still be 1/2: " + f3);
        System.out.println("This product should be 7/3: " + f4.times(-1));
        System.out.println("  This fraction should still be -7/3: " + f4);
        System.out.println("This product should be 8.5: " + f3.times(17.0));
        System.out.println("  This fraction should still be 1/2: " + f3);
        System.out.println("This product should be -7.33ish: " 
            + f4.times(Math.PI));
        System.out.println("  This fraction should still be -7/3: " + f4);
        System.out.print("\n\nDone\n\n");
    }

    private static void pause()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("\nPress Enter key to continue... ");
        keyboard.nextLine();
        System.out.print("\n");
    }
}

