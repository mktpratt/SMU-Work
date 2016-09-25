import java.util.Scanner;

/**
 * A test class for Exception class
 *
 * @author (various)
 * @version 1.1 2011/02/08
 */

public class TestException
{
    public static void main(String[] args)
    {
        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter number of cookies: ");
        int numCookies = kbd.nextInt();
        kbd.nextLine();

        //Activity 2

        //try block
        try
        {
            // if numCookies < 1 throw Exception with
            if (numCookies < 1)
            {
                //    message("Oh no!  No cookies!")
                throw new Exception("Oh no! No cookies!");
            }
        }
        // catch block, catch Exception
        catch (Exception e)
        {
            // print the message from the Exception object
            System.out.println(e.getMessage());
            // print "Go buy some cookies."
            System.out.println("Go buy some cookies.");
        }

        System.out.println("End of Activity 2.");
        System.out.println();

        // Activity 3
        System.out.print("Enter number of apples: ");
        int numApples = kbd.nextInt();
        kbd.nextLine();

        System.out.print("Enter number of children: ");
        int numChildren = kbd.nextInt();
        kbd.nextLine();

        // try block
        try
        {
            // call the checkEnufApples method
            checkEnufApples(numApples, numChildren);
        }
        // catch block to catch NotEnufApplesException
        catch (NotEnufApplesException e)
        {
            // print the message from the NotEnufApplesException object
            System.out.println(e.getMessage());
            // print "Go buy some apples."
            System.out.println("Go buy some apples.");
        }

        System.out.println("End of Activity 3.");
    }

    //method checkEnufApples() which throws NotEnufApplesException
    public static void checkEnufApples(int numApples, int numChildren) throws NotEnufApplesException
    {
        //Print "From checkEnufApples()"
        System.out.println("From checkEnufApples()");
        // if numApples < numChildren,
        if (numApples < numChildren)
        {
            // throw a NotEnufApplesException with message "Not enuf Apples!"
            throw new NotEnufApplesException("Not enuf Apples!");
        }
    }
}



