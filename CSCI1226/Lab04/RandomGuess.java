/**
 * @(#)RandomGuess.java
 *
 *
 * @author Yasushi Akiyama
 * @version 1.00 2011/9/21
 */
import java.util.Scanner;
public class RandomGuess 
{
    public static void main(String[] args) 
    {
        System.out.println("**************************************");
        System.out.println("This program generates a random number\n"
                        + "and you will guess what it is!");
        System.out.println("**************************************\n");

        //generate a random number chosen from 1-5
        int n = ((int)(Math.random() * 5)) + 1;

        //ask user to enter her guess (1-5)
        System.out.print("Enter your guess (1 to 5): " );
        Scanner kyb = new Scanner(System.in);
        int guess = kyb.nextInt();kyb.nextLine();

        //print out the generated number
        System.out.println("The random number was " + n + ".");

        //print out the user's guess
        System.out.println("Your guess was " + guess +".");


        //add the lines below so that it displays a message
        if (guess > n)
        {
            System.out.println("Your guess was too large.");
        }
        else if (guess < n)
        {
            System.out.println("Your guess was too small.");
        }
        else
            System.out.println("You guessed it right!!");


        //based on the guessed number

    }
}
