/**
 * Prints out win/loss/tie record and last 10 game record.
 *
 * @author Mike Pratt -- A00320459
 * @version 1.0
 */

import java.util.Arrays;


public class StandingsLine
{
    public static void main(String[] args)
    {
        printIdentification();
        System.out.println("As a check, here is the data you"
                           + " entered:");
        printArray(args);
        makeUpper(args);
        System.out.println("\n... and here it is changed to"
                           + " upper case:");
        printArray (args);
        System.out.println("\n\nYour win-loss-(tie) record is "
                           + getRecord(args) + ".\n");
        System.out.println("The number of points for that record is "
                           + getPoints(args) + ".\n");
        String[] lastTen;
        lastTen = getLast(10, args);
        System.out.println("The last ten of those elements:");
        printArray(lastTen);
        System.out.println("\n");
        System.out.println("Your win-loss-(tie) record for the last 10"
                           + " games is " + getRecord(lastTen) + ".\n");
        System.out.println("Your streak is " + getStreak(args) + ".");
    }

    public static void printIdentification()
    {
        System.out.println("Standings Line Generator");
        System.out.println("------------------------\n");
        System.out.println("by Mike Pratt (A00320459)\n");
        System.out.println("This program will provide the user with a win"
                           + "-loss(-tie) evaluation for sport \nstandings.\n");
    }

    public static void printArray(String[] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i]);
        }
    }

    public static void makeUpper(String[] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            a[i] = a[i].toUpperCase();
        }
    }

    public static String getRecord(String[] a)
    {
        int wins = 0, losses = 0, ties = 0;
        for (int i = 0; i < a.length; i++)
        {
            ties = count("T",a);
            wins = count("W",a);
            losses = count("L",a);
        }
        if (ties > 0)
        {
            return wins + "-" + losses + "-" + ties;
        }
        else
        {
            return wins + "-" + losses;
        }
    }

    public static int count(String item, String[] a)
    {
        int counter = 0;

        for (int i = 0; i < a.length; i++)
        {
            if (a[i].equals(item))
            {
                counter ++;
            }
        }
        return counter;
    }

    public static int getPoints(String[] a)
    {
        int totalPoints = count("W", a) * 2 + count("T", a);
        return totalPoints;
    }

    public static String[] getLast(int num, String[] a)
    {
        int lastCounted = a.length - num;

        if (num > a.length)
        {
            return a;
        }
        String[] lastGame = new String [num];
        for (int i = 0; i < num; i++)
        {
            lastGame[i] = a[lastCounted++];
        }
        return lastGame;
    }

    public static String getStreak(String[] a)
    {
        int start = a.length - 1;
        int currentStreak = 1;
        //calculate streak
        if (start <= 0)
        {
            return "N/A";
        }
        for (int i = a.length - 1; i >= 0; i--)
        {
            int n = (i - 1);
            if (i == 0)
            {
                break;
            }
            else if (a[n].equals(a[i]))
            {
                currentStreak++;
            }
            else
            {
                break;
            }
        }

        //return each streak (w/l/t)
        if (a[start].equals("W") && currentStreak >= 0)
        {
            return "W-" + currentStreak;
        }
        else if (a[start].equals("L") && currentStreak >= 0)
        {
            return "L-" + currentStreak;
        }
        else if (a[start].equals("T") && currentStreak >= 0)
        {
            return "T-" + currentStreak;
        }
        else
        {
            return "N/A";
        }
    }
}


