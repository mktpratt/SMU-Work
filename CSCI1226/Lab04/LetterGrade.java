import java.util.Scanner;

/**
 * Calculate a letter grade from a numeric grade
 *
 * @author Mark Young
 * @modified by Yasushi Akiyama
 * @version 1.1 2011-09-22
 */

public class LetterGrade 
{

    public static void main(String[] args) 
    {
        // introduce self
        System.out.print("\n\n"
            + "This program tells you your letter grade.\n\n");

        // Prepare for input
        Scanner kbd = new Scanner(System.in);

        // set aside space
        int grade;

        // Get user input
        System.out.print("Enter your grade (0..100): ");
        grade = kbd.nextInt();
        kbd.nextLine();
        System.out.println();

        // print letter grade
        System.out.print("Your grade of " + grade + " gives you a(n) ");
        if (grade >= 80)
            System.out.println("A.");
        else if (grade >= 70)
            System.out.println("B.");
        else if (grade >= 60)
            System.out.println("C.");
        else if (grade >= 50)
            System.out.println("D.");                    
        else
            System.out.println("F.");

        System.out.println();
    }
}

