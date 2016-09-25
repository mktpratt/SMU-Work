/**
 * Calculates the average of 2 highest of 3 scores on quizzes.
 *
 * @author Mike Pratt -- A00320459
 * @version 1.0
 */

import java.util.Scanner;

public class QuizGradeCalculator
{

    public static void main(String[] args)
    {

        Scanner kbd = new Scanner (System.in);
        int score1, score2, score3, droppedScore;
        double quizAverage;

        System.out.println("\nGrade Calculator");
        System.out.println("----------------\n");
        System.out.println("by Mike Pratt (A00320459)\n");
        System.out.println("This finds the average of your two highest grades\n"
                           + "on your quizzes out of 20.\n");
        System.out.print("Enter your score for Quiz 1: ");

        score1 = kbd.nextInt();
        kbd.nextLine();
        if (score1 >= 0 && score1 <= 20)
        {
            System.out.print("Enter your score for Quiz 2: ");
        }
        else
        {
            System.out.println("\nThe number you entered is not valid.");
            System.exit(1);
        }
        score2 = kbd.nextInt();
        kbd.nextLine();

        if (score2 >= 0 && score2 <= 20)
        {
            System.out.print("Enter your score for Quiz 3: ");
        }
        else
        {
            System.out.println("\nThe number you entered is not valid.");
            System.exit(1);
        }
        score3 = kbd.nextInt();
        kbd.nextLine();

        if (score3 < 0 || score3 > 20)
        {
            System.out.println("\nThe number you entered is not valid.");
            System.exit(1);
        }

        System.out.print("\nPress Enter...\n");
        kbd.nextLine();

        System.out.println("\n\nQuiz #1 Grade:\t" + score1 + "/20");
        System.out.println("Quiz #2 Grade:\t" + score2 + "/20");
        System.out.println("Quiz #3 Grade:\t" + score3 + "/20\n");

        //find lowest grade
        if (score1 >= score2 && score3 >= score2)
        {
            droppedScore = score2;
            quizAverage = (score1 + score3);
        }
        else if (score1 >= score3 && score2 >= score3)
        {
            droppedScore = score3;
            quizAverage = (score1 + score2);
        }
        else
        {
            droppedScore = score1;
            quizAverage = (score2 + score3);
        }

        System.out.println("Dropped Quiz:\t" + droppedScore + "/20\n");
        System.out.println("Quiz score:\t" + quizAverage/2 + "/20");

        System.out.print("\nPress Enter...\n");
        kbd.nextLine();
    }
}

