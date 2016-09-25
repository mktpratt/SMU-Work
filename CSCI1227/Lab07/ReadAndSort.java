import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadAndSort
{
    public static final int MAX = 100;
    public static final int PER_LINE = 5;

    public static void main(String[] args)
    {
        Scanner kbd = new Scanner(System.in);

        // introduce yourself
        System.out.print("\n\n"
                         + "A program to illustrate preventing overflow of an array \n"
                         + "(and avoiding reading too many numbers).\n\n");

        System.out.print("What file should I sort? ");
        String fileName = kbd.nextLine();

        File f = new File(fileName);

        // create the array and counter variable
        int[] posInt = new int[MAX];
        int count = 0;

        try
        {
            Scanner numbersFile = new Scanner(f);
            // read until the array fills OR the end of the file is reached
            for (int i = 0; i < MAX; i++)   // loop thru array
            {
                while (numbersFile.hasNextInt() && count < MAX)
                {
                    int num = numbersFile.nextInt();        // get a number
                    posInt[count] = num;            // save that number
                    count++;                    // one more number saved
                }
            }
            numbersFile.close();
        }
        catch (FileNotFoundException e)
        {
            System.err.println("Could not find file '" + fileName + "'");
        }

        // report # of #s read
        System.out.println("I read " + count + " numbers.");

        // sort the array
        Arrays.sort(posInt, 0, count);  // sorts only from 0 to count-1

        // print out the numbers, PER_LINE per line
        for (int i = 0; i < count; i++)
        {
            if (i % PER_LINE == 0)
            {
                System.out.println();
            }
            System.out.print("\t" + posInt[i]);
        }
        System.out.print("\n\n");
    }
}
