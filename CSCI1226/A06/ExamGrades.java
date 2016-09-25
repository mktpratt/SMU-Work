/**
 * Takes in exam marks, gives user a letter grade and finds average number of each letter grade.
 *
 * @author Mike Pratt -- A00320459
 * @version 1.0
 */

import java.util.Scanner;

public class ExamGrades
{

    public static void main(String[] args)
    {
        int userGrade, lowRange = 10000000, highRange = 0, aGrade = 0,
            bGrade = 0, cGrade = 0, dGrade = 0, fGrade = 0;
        double  numGrades = 0, totalGrades = 0, averageGrade = 0;
        Scanner kbd = new Scanner (System.in);

        System.out.println("\n\nExam Grades Profiler");
        System.out.println("--------------------\n");
        System.out.println("by Mike Pratt (A00320459)\n");
        System.out.println("This program calculates some class statistics for your exam.\n");

        System.out.println("Enter the exam grades below. Enter a negative number"
                           + " to end the sequence.");
                           
        userGrade = kbd.nextInt();
        while (userGrade >= 0)
        {
            numGrades++;
            // Find high point of range
            if (userGrade >= highRange)
            {
                highRange = userGrade;
            }
            // Find low point of range
            if (userGrade <= lowRange)
            {
                lowRange = userGrade;
            }
            // Test for warning
            if (userGrade > 100)
            {
                System.out.println("WARNING: Grade over 100 -- " + userGrade);
            }
            // Assign grades to appropriate letter
            if (userGrade >= 80)
            {
                aGrade++;
            }
            else if (userGrade >= 70)
            {
                bGrade++;
            }
            else if (userGrade >= 60)
            {
                cGrade++;
            }
            else if (userGrade >= 50)
            {
                dGrade++;
            }
            else
            {
                fGrade++;
            }
            //accumulate number of grades
            totalGrades += userGrade;
            //get next number
            userGrade = kbd.nextInt();

        }
        
        averageGrade = totalGrades / numGrades;
        int intGrades = (int)numGrades;
        System.out.println("\nExam Report\n");
        System.out.println("Number:\t\t" + intGrades);
        System.out.println("Range:\t\t" + lowRange + " to " + highRange);
        System.out.println("Average:\t" + averageGrade + "\n");
        System.out.println("As:\t\t" + aGrade + "\t(" + (aGrade / numGrades) * 100 + "%)");
        System.out.println("Bs:\t\t" + bGrade + "\t(" + (bGrade / numGrades) * 100 + "%)");
        System.out.println("Cs:\t\t" + cGrade + "\t(" + (cGrade / numGrades) * 100 + "%)");
        System.out.println("Ds:\t\t" + dGrade + "\t(" + (dGrade / numGrades) * 100 + "%)");
        System.out.println("Fs:\t\t" + fGrade + "\t(" + ((fGrade / numGrades) * 100) + "%)");
    }
}

