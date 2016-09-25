import java.util.Scanner;

public class CountNoes
{
    public static final String STOP_WORD = "QUIT";

    public static void main(String[] args)
    {
        Scanner kbd = new Scanner(System.in);
        int count = 0;
        String word;

        System.out.println("\nThis program will count the # of times you enter "
                           + "the word no.\nType \"QUIT\" to stop.");
        System.out.println("Enter your words below:\n");
        word = kbd.next();

        while (!word.equals(STOP_WORD))
        {
            if (word.equalsIgnoreCase("NO"))
            {
                count++;
            }
            word = kbd.next();
        }
        System.out.println("\nYou entered " + count + " noes above.");
    }
}
