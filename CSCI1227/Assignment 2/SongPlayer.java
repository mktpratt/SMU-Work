/**
 * Reads song names and plays them in random order
 *
 * @author Mike Pratt -- A00320459
 * @version 1.0
 */

import java.util.Scanner;
import java.util.Arrays;

public class SongPlayer
{
    public static final int MAX_NUM_SONGS = 20;

    public static void main(String[] args)
    {

        Scanner kbd = new Scanner (System.in);

        System.out.println("\n\n");
        System.out.println("------------\n");
        System.out.println("by Mike Pratt (A00320459)");
        System.out.println("\nThis player holds up to " + MAX_NUM_SONGS +
                           " songs, and plays them in a random order.");

        System.out.println("\nEnter the song titles and lengths below."
                           + " Leave the title blank to end early.");


        Song[] newSongs = new Song [MAX_NUM_SONGS];
        int howMany = 0;
        for (int i = howMany; i < MAX_NUM_SONGS; i++)
        {
            System.out.print("\nEnter song title: ");
            String t = kbd.nextLine();
            if ("".equals(t))
            {
                break;
            }
            System.out.print("Enter song length (e.g. 3:07): ");
            String l = kbd.nextLine();
            System.out.println();
            newSongs[howMany] = new Song(t, l);
            howMany++;
            System.out.println("The song " + t + " (" + l + ") has been added.");

        }
        int[] newOrder = makeShuffleOrder(howMany);
        for (int s = 0; s < howMany; s++)
        {
            int playOrder = newOrder[s];
            newSongs[s] = newSongs[playOrder];
            newSongs[s].play();
        }

    }


    public static int[] makeShuffleOrder(int howMany)
    {
        int[] order = new int[howMany];
        for (int i = 0; i < howMany; i++)
        {
            order[i] = i;
        }

        for (int i = 0; i < howMany; i ++)
        {
            int swapLoc = (int)(howMany * Math.random());
            int temporary = order[i];
            order[i] = order[swapLoc];
            order[swapLoc] = temporary;

        }
        return order;



    }
}

