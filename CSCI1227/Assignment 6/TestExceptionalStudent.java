import java.util.Scanner;

/**
 * A program that tests to enter data for a Student class 
 * that throws exceptions.
 *
 * @author Mark Young (A00000000)
 * @version 1.0
 */
public class TestExceptionalStudent
{
    public static void main(String[] args)
    {
        Scanner kbd = new Scanner(System.in);
        Student s = new Student("Xavier Luis Ng");
        
        System.out.println("\n\n"
            + "A Program to Test Exceptional Students\n"
            + "--------------------------------------\n\n"
            + "by Mark Young (A00000000)\n\n"
            + "If you modified Student.java properly, "
            + "then this program will compile "
            + "and\nyou'll get output similar to the sample output.\n\n");
        
        try
        {
            System.out.println("How are they doing so far?");
            System.out.println("So far, " + s + " has a " + s.getPctGrade());
            System.out.println("So that's how they're doing so far.");
        }
        catch (NoBasisForEvaluationException nbfe)
        {
            System.out.println(nbfe.getMessage());
        }
        System.out.println();
        
        try
        {
            System.out.println("How'd they do on A3?");
            System.out.println("Their grade on A3 is " 
                + s.getAsgnGrade(3));
        }
        catch (NoSuchAssignmentException nsa)
        {
            System.out.println(nsa.getMessage());
        }
        catch (NotPassedInException npi)
        {
            System.out.println(npi.getMessage());
        }
        System.out.println();
            
        for (int i = 0; i <= Student.NUM_ASGN; i++)
        {
            try
            {
                System.out.print("Enter their A" + i + " grade: ");
                int g = kbd.nextInt();  kbd.nextLine();
                s.setAsgnGrade(i, g);
                System.out.println("So far, " + s 
                    + " has a " + s.getLetterGrade());
            }
            catch (NoSuchAssignmentException nsa)
            {
                System.out.println(nsa.getMessage());
            }
            catch (InvalidGradeException ig)
            {
                System.out.println(ig.getMessage());
            }
            catch (NoBasisForEvaluationException nbfe)
            {
                System.out.println(nbfe.getMessage());
            }
            System.out.println();
        }
    }
}
