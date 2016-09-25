import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SumNumbersFromFile
{
    public static void main(String[] args)
    {
        System.out.print("\n\n"
                         + "SumNumbersFromFile\n"
                         + "------------------\n"
                         + "\n"
                         + "This program adds up all the numbers "
                         + "in a file chosen by the user.\n\n");

        Scanner kbd = new Scanner(System.in);
        System.out.print("What file shall I sum up? ");
        String fileName = kbd.nextLine();

        File f = new File(fileName);
        try
        {
            Scanner numbersFile = new Scanner(f);
            int sum = 0;
            while (numbersFile.hasNextInt())
            {
                sum += numbersFile.nextInt();
            }
            numbersFile.close();

            System.out.println("\n\n"
                               + "The sum of the numbers in " + fileName
                               + " is " + sum);
            System.out.println();
        }
        catch (FileNotFoundException e)
        {
            System.err.println("Could not find file '" + fileName + "'");
        }
    }
}
