import java.util.Scanner;

/**
 * A class to hold very basic information about a song
 *
 * @author Mark Young (A00000000)
 * @version 1.0
 */
public class Song
{
    private String title;
    private int totalSeconds;
    private String time;

    /**
     * Create a song from its title and running time
     *
     * @param t the title of the song
     * @param l song's run time (<i>mm</i>:<i>ss</i> -- for example: "3:07")
     */
    public Song(String t, String l)
    {
        java.util.Scanner reader = new Scanner(l);
        reader.useDelimiter(":");
        int mins = reader.nextInt();
        int secs = reader.nextInt();

        setFields(t, mins, secs);
    }

    /**
     * @return the running time of the song (in seconds)
     */
    public int getLengthInSeconds()
    {
        return totalSeconds;
    }

    /**
     * @return a String for the song: "<i>title</i> (<i>run-time</i>)"
     */
    public String toString()
    {
        return title + " (" + time + ")";
    }

    /** "Play" the song */
    public void play()
    {
        System.out.print("\nNow Playing: " + title);
        for (int i = 0; i < totalSeconds; i++)
        {
            if (i % 25 == 0) System.out.println();
            System.out.print("na ");
            try{Thread.sleep((int)(100 * Math.random()));}
            catch(Exception e){}
        }
        System.out.println();
    }

    // set the all the instance variables
    // @param t title of song
    // @param minutes the running time (minutes part -- the 3 of 3:07)
    // @param seconds the running time's excess seconds (the 7 of 3:07)
    private void setFields(String t, int minutes, int seconds)
    {
        title = t;
        totalSeconds = 60*minutes + seconds;
        time = minutes + ":" + (seconds<10?"0":"") + seconds;
    }
}

