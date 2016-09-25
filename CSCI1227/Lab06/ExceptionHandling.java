import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionHandling
{
    public static final int NUM_ARRAY_ITEMS = 10;
    public static final int NUM_ITERATIONS = 3;

    public static void main (String ar[])
    {

        int index=0;
        String v[] = new String[NUM_ARRAY_ITEMS];

        // at the prompt, you will enter the values below:
        //  1st prompt) 9 hello
        //  2nd prompt) 10 hello
        //  3rd prompt/1st prompt of second run) bye 8
        // add try-catch block to handle the exceptions so that the program
        // will display the same error messages as described.
        Scanner kb = new Scanner(System.in);
        for (int i = 0; i<NUM_ITERATIONS; i++)
        {
            try
            {
                System.out.print("Enter the array index and new value:  ");
                index = kb.nextInt();
                v[index] = kb.nextLine();
                System.out.println("Array location " + index + " set to "
                                   + v[index]);
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Index out of bounds -- there is no"
                                   + " array element #" + index);
            }
            catch (InputMismatchException e)
            {
                System.out.println("The first thing you enter must"
                                   + " be a number!");
            }


        }//end for
    }//end main()
}//end class

