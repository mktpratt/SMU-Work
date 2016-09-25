import java.util.Scanner;

/**
 * Tells you if a date you enter is a valid date or not.
 *
 * @author Mike Pratt -- A00320459
 * @version 1.0
 */

import java.util.Scanner;

public class DateChecker
{

    public static void main(String[] args)
    {

        Scanner kbd = new Scanner (System.in);
        boolean dayAccuracy = true;
        int userDay, userYear;
        String userMonth;


        System.out.println("\n\nCombined Score Calculator");
        System.out.println("-------------------------\n");
        System.out.println("by Mike Pratt (A00320459)\n");
        System.out.println("This will tell you if the date you enter is valid.\n");
        System.out.println("Enter the date below. Use the form /day month year/"
                           + "\n(e.g. 29 February 1066).");

        userDay = kbd.nextInt();
        userMonth = kbd.next();
        userYear = kbd.nextInt();
        System.out.println();

        //Year Check
        if (userYear <= 0)
        {
            System.out.println(userYear + " is not a valid year.");
            dayAccuracy = false;
        }

        //Month Check
        if (userMonth.equalsIgnoreCase("january") || userMonth.equalsIgnoreCase("march") ||
                userMonth.equalsIgnoreCase("may") || userMonth.equalsIgnoreCase("july") ||
                userMonth.equalsIgnoreCase("october") || userMonth.equalsIgnoreCase("december"))
        {
            if (userDay <= 0 || userDay >31)
            {
                System.out.println(userDay + " is not a valid date for " + userMonth + " " + userYear + ".");
                dayAccuracy = false;
            }
        }
        else if (userMonth.equalsIgnoreCase("april") || userMonth.equalsIgnoreCase("june") ||
                 userMonth.equalsIgnoreCase("september") || userMonth.equalsIgnoreCase("november"))
        {
            if (userDay < 0 || userDay >=30)
            {
                System.out.println(userDay + " is not a valid date for "
                                   + userMonth + " " + userYear + ".");
                dayAccuracy = false;
            }
        }
        else if (userMonth.equalsIgnoreCase("february"))
        {
            //Leap Year test
            if (userDay > 0 && userDay <=29)
            {
                if (userDay == 29)
                {
                    if (userYear % 400 == 0 || (userYear % 4 == 0 && userYear % 100 != 0))
                    {
                    }

                    else
                    {
                        dayAccuracy = false;
                        System.out.println(userYear + " is not a leap year!");
                    }
                }
            }
            else
            {
                System.out.println(userDay + " is not a valid date for "
                                   + userMonth + " " + userYear + ".");
                dayAccuracy = false;
            }
        }
        else
        {
            //Day check for incorrect months
            if (userDay < 1 || userDay > 31)
            {
                System.out.println(userDay + " is not a valid date for "
                                   + userMonth + " " + userYear + ".");
                dayAccuracy = false;
            }

            System.out.println("\"" + userMonth + "\"" + " is not a valid month.");
            dayAccuracy = false;

        }



        //Day Check
        if (dayAccuracy == true)
        {
            System.out.println(userDay + " " + userMonth + " "
                               + userYear + " is a valid date!");
        }
        else
        {
            System.out.println(userDay + " " + userMonth + " "
                               + userYear + " is not a valid date.");
        }








    }
}

