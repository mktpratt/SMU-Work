import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class WordExtraction
{

    public static void main(String[] args)
    {

        String word = "";

        Scanner kbd = new Scanner (System.in);
        System.out.println("\nWord Extraction");
        System.out.println("---------------\n");
        System.out.print("Enter the name of a file you'd like to "
                         + "extract words from: ");
        String fileName = kbd.nextLine();

        File f = new File(fileName);
        try
        {
            Scanner messageFile = new Scanner(f);
            while (messageFile.hasNextInt())
            {
                int startingInt = messageFile.nextInt();
                for (int i = 0; i < startingInt; i++)
                {
                    word = messageFile.next();
                }
                System.out.print(word + " ");
                messageFile.nextLine();
            }
            System.out.println("");

        }
        catch (FileNotFoundException e)
        {
            System.err.println("Could not find file '" + fileName + "'");
        }

    }
}

