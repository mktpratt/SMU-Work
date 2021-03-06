import java.util.Scanner;

/**
 * A program to factorize numbers
 */
public class Factorize
{
    public static void main(String[] args)
    {
        // just factorize the numbers from 2 to 20
        for (int i = 2; i <= 20; i++)
        {
            factorize(i);
        }
    }

    /** print an equation showing the prime factors of n */
    public static void factorize(int n)
    {
        // print the number and the equals sign ...
        System.out.print(n + " = ");

        // ... then the prime factors ...
        printPrimeFactors(n);

        // ... then end the line
        System.out.println();
    }

    /** print the prime factors of n */
    public static void printPrimeFactors(int n)
    {

        // let f be the least prime factor of n
        int f = getLeastPrimeFactor(n);
        // print f
        System.out.print(f);
        // if f != n,
        if (f != n)
        {
            // print a *
            System.out.print(" * ");
            // print the factors of n/f
            printPrimeFactors(n/f);
        }
    }

    /** find the least prime factor of n */
    public static int getLeastPrimeFactor(int n)
    {
        // numbers less than 2 have no prime factors...
        if (n < 2)
        {
            // ... just return the number itself
            return n;
        }

        // smallest prime factor will be between 2 and n inclusive
        for (int f = 2; f <= n; f++)
        {
            // if f divides equally into n...
            if (n % f == 0)
            {
                // ... then that's the number we're looking for!
                return f;
            }
        }
        // we should NEVER get here -- but Java requires a return
        return -1;
    }
}
