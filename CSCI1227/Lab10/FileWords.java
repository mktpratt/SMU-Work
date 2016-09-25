import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.io.*;
import java.util.List;

public class FileWords 
{
    public static final int PAGE_SIZE = 20;
    
    public static void main(String[] args) 
    {
        Scanner kbd = new Scanner(System.in);

        System.out.print("\n\n"
            + "File Words\n"
            + "----------\n\n"
            + "This program reads all the words in a file.\n");

        ArrayList<String> words = new ArrayList<String>();
        System.out.print("\nEnter the file name: ");
        String fileName = kbd.nextLine();
        try {
            Scanner in = new Scanner(new File(fileName));
            in.useDelimiter("[\\s[\\W]]+");

            while (in.hasNext()) {
                words.add(in.next().toUpperCase());
            }
            in.close();
        }
        catch(FileNotFoundException e) {
            System.err.println("Could not open " + fileName + " for input");
            System.exit(1);
        }
        System.out.println("I read " + words.size() + " words from "
            + fileName);
            
        // TODO:  remove the words AND, BY, IN, ON, and THE.
        //Create a list of bad words
        List<String> badWords = new ArrayList<String>();
        badWords.add("AND");
        badWords.add("BY");
        badWords.add("IN");
        badWords.add("ON");
        badWords.add("THE");
        
        //Remove all of the bad words
        words.removeAll(badWords);
            
        // sort the words and print them out
        Collections.sort(words);
        System.out.print("\nThe words in the file were: ");
        for (int i = 0; i < words.size(); i++) 
        {
            if (i % PAGE_SIZE == 0)
            {
                System.out.print("\nPress Enter key to continue...");
                kbd.nextLine();
                System.out.println();
            }
            System.out.println("\t" + words.get(i));
        }
        System.out.print("\n\n");
        System.out.print("Press Enter key to finish...");
        kbd.nextLine();
        System.out.println();
    }
}
