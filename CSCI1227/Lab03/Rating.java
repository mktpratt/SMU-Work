import java.util.Scanner;

/**
 * holds a 0-10 rating and one-line review for a book/movie/game/...
 * DO NOT MODIFY THIS FILE
 *
 * @author Mark Young -- A00000000
 * @version 1.0
 */
public class Rating
{
    // constants
    public static final int MAX_RATING = 10;
    public static final int MIN_RATING = 0;

    // instance variables
    public final int RATING;
    public final String REVIEW;


    // class variables
    private static Scanner kbd = new Scanner(System.in);

    // constructors
    public Rating(int rated, String reviewed)
    {
        if (rated < MIN_RATING) rated = MIN_RATING;
        else if (rated > MAX_RATING) rated = MAX_RATING;
        RATING = rated;
        REVIEW = reviewed;
    }
    
    // public methods
    public String toString()
    {
        return RATING + " -- " + REVIEW;
    }

    // static methods
    /**
     * request a rating and review from the user
     *
     * @param itemName name of the work to be rated/reviewed
     * @return a Rating object for the work named
     */
    public static Rating readRating(String itemName)
    {
        System.out.print("Rate " + itemName + " on a scale from "
            + MIN_RATING + " to " + MAX_RATING + ": ");
        int rated = kbd.nextInt(); kbd.nextLine();
        while (!validRating(rated))
        {
            System.out.print("Please enter a rating between "
                + MIN_RATING + " and " + MAX_RATING + ": ");
            rated = kbd.nextInt(); kbd.nextLine();
        }
        System.out.println("Enter a ONE-LINE review below.");
        String reviewed = kbd.nextLine();

        return new Rating(rated, reviewed);
    }

    public static Rating readRating()
    {
        return readRating("this work");
    }

    /**
     * is the given rating in the appropriate range
     *
     * @param rating the supposed rating
     * @return whether it's in the range of allowed ratings
     */
    public static boolean validRating(int r)
    {
        return MIN_RATING <= r && r <= MAX_RATING;
    }
}

