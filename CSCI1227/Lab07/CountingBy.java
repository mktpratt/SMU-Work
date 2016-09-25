import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CountingBy
{
    public static void main(String[] args)
    {
        int countSize, countTo, sum;
        String fileName;


        Scanner kbd = new Scanner (System.in);

        System.out.print("\n\n"
                         + "A program to print numbers to a file by \n"
                         + "a specific amount decided by the user.\n\n");

        System.out.print("What number should I count by? ");
        countSize = kbd.nextInt();
        kbd.nextLine();
        System.out.print("What number should I count to? ");
        countTo = kbd.nextInt();
        kbd.nextLine();
        System.out.print("What file should I save the numbers in? ");
        fileName = kbd.next();
        kbd.nextLine();

        if (countSize <= countTo)
        {
            try
            {
                sum = countSize;
                File f = new File (fileName);
                PrintWriter p = new PrintWriter(f);
                while (sum <= countTo)
                {
                    if (sum <= countTo)
                    {
                        p.print (sum + " ");
                    }
                    else
                    {
                        p.close();
                    }
                    sum += countSize;
                }
                System.out.println("\nThe file " + fileName
                                   + " has been created.");
                p.close();
            }
            catch (FileNotFoundException e)
            {
                System.out.println("File doesn't exist");
            }
        }
        else
        {
            System.out.println("\nYour count number is larger than the "
                               + "number you want to count to!\nThe "
                               + "file was not saved!");
            System.exit(0);
        }


    }
}

