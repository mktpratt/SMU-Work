import java.util.Scanner;

public class Opinion
{
    public static final int SCALE_MAX = 10;

    public static void main(String[] args)
    {
        System.out.print("\n\n"
                         + "This program gets a user's opinion of Microsoft.\n\n");

        // Prepare for input
        Scanner kbd = new Scanner(System.in);

        // Get user input
        int opinion;
        System.out.print("Enter your opinion of Microsoft "
                         + "(1 = very low, " + SCALE_MAX + " = very high): ");
        opinion = kbd.nextInt();
        kbd.nextLine();
        System.out.println();

        switch (opinion)
        {
        case 1:
            System.out.println("That's OK. I won't tell Bill!");
            break;

        case 2:
        case 3:
            System.out.println("Not so high, eh? You and many others!");
            break;

        case 4:
        case 5:
        case 6:
        case 7:
            System.out.println("Hmm! A fence-sitter on the subject, eh?");
            break;

        case 8:
        case 9:
            System.out.println("Oh, yeah? "
                               + "What have they done for you lately?");
            break;

        case 10:
            System.out.println("The cheque from Bill is in the mail!");
            break;

        default:
            if (opinion > SCALE_MAX)
                System.out.println("Your opinion is off-scale!");
            else
                System.out.println("Now, now, now ...!");
            break;
        }
        System.out.println();
    }
}

