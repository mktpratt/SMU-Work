import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Grapher
{

    public static void main(String[] args)
    {
        String title, fileName;
        int barLength;

        Scanner kbd = new Scanner (System.in);

        System.out.println("\nGrapher");
        System.out.println("-------\n");
        System.out.print("Enter the name of the output file: ");
        fileName = kbd.next();
        kbd.nextLine();
        System.out.print("Enter the title of the graph: ");
        title = kbd.nextLine();
        System.out.println("\nEnter a negative number to end input.");

        //Create title for graph

        try
        {
            File f = new File (fileName);
            PrintWriter p = new PrintWriter(f);

            int titleLength = title.length();
            p.println (title);
            for (int l = 0; l < titleLength; l++)
            {
                p.print ("-");
            }
            p.println("\n");
            System.out.print("\nHow long is the first bar? ");
            barLength = kbd.nextInt();
            kbd.nextLine();
            while (barLength >= 0)
            {
                if (barLength >= 0)
                {
                    for (int i = 0; i < barLength; i++)
                    {
                        p.print ("*");
                    }
                    p.println("");
                }
                else
                {
                    p.close();
                }
                System.out.print("How long is the next bar? ");
                barLength = kbd.nextInt();
                kbd.nextLine();
            }
            System.out.println("\nThe file " + fileName
                               + " has been created.");
            p.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("\nFile doesn't exist");
        }
        catch (Exception e)
        {
            System.out.println("\nYou did not enter a number!");
        }

    }
}

