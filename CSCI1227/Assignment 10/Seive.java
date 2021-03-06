/**
 * This program determines prime numbers between certain values.
 *
 * @author Mike Pratt -- A00320459
 * @version 1.0
 */


/* Note: Prime number list isn't working as intended. Made program sort list correctly
 * but changing around the loops causes errors. Leaving as is until further notice.
 */

import java.util.*;

public class Seive
{


    public static void main(String[] args)
    {

        int upperLimit, startingNum = 2;
        String work1, work2;
        boolean showWork, showWork2 = false;

        Scanner kbd = new Scanner (System.in);

        //Introduction and collect data
        System.out.println("\n\nSeive of Eratosthenes");
        System.out.println("---------------------\n");
        System.out.println("by Mike Pratt (A00320459)");
        System.out.println("\nThis program computes the prime numbers"
                           + " using a method called the seive of Eratosthenes.");
        System.out.println("");

        System.out.print("What is the biggest number I should check? ");
        upperLimit = kbd.nextInt();
        kbd.nextLine();
        System.out.print("Shall I tell you how it's going? ");
        work1 = kbd.next();
        kbd.nextLine();
        if (work1.startsWith("y") || work1.startsWith("Y"))
        {
            showWork = true;
        }
        else
        {
            showWork = false;
        }
        if (showWork == true)
        {
            System.out.print("Shall I tell you in great detail? ");
            work2 = kbd.next();
            kbd.nextLine();
            if (work2.startsWith("y") || work2.startsWith("Y"))
            {
                showWork2 = true;
            }
            else
            {
                showWork2 = false;
            }
        }

        //Create LinkedList for possible primes
        LinkedList<Integer> possibleNumbers = new LinkedList<Integer>();
        for (int i = startingNum; i <= upperLimit; i++)
        {
            possibleNumbers.add(i);
        }

        //Create Array list for prime numbers
        List<Integer> primeNumbers = new ArrayList<Integer>();


        //While there are still possible numbers

        while (!possibleNumbers.isEmpty())
        {

            //6. a.
            primeNumbers.add(startingNum);
            if (showWork == true)
            {
                System.out.print("\n\nPossibles: " + possibleNumbers);
                System.out.print("\nFound prime: " + startingNum);
            }
            //6. b.
            for (int i = 2; i <= upperLimit; i++)
            {
                if (i % startingNum == 0 && i != 2)
                {
                    primeNumbers.add(i);
                }
                if (i % startingNum == 0 && i != 2 && showWork2 == true && showWork == true)
                {
                    if (possibleNumbers.contains(i))
                    {
                        System.out.print("\n\tRemoving " + i + " from possibles");
                    }
                }
                possibleNumbers.removeAll(primeNumbers);
            }
            if (!possibleNumbers.isEmpty())
            {
                startingNum = possibleNumbers.get(0);
            }
        }

        System.out.println("\n\nThe primes up to " + upperLimit + " are: ");
        for (int i = 0; i <= primeNumbers.size() - 1; i++)
        {
            System.out.printf("%6d ", primeNumbers.get(i));
        }


    }
}

