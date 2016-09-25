/**
 * This program will calculate the scores of dives.
 *
 * @author Mike Pratt -- A00320459
 * @version 1.0
 */

import java.util.Scanner;

public class DiveScoreCalculator
{

    public static final int numJudges = 7;
    public static final double maxScore = 10.0;
    public static final int numScoresDropped = 2;
    public static final int scoreMultiplier = 3;

    public static void main(String[] args)
    {


        double judgeScore, finalScore, lowScore = 10, highScore = 0, runningTotal = 0;
        Scanner kbd = new Scanner (System.in);

        System.out.println("\n\nCombined Score Calculator");
        System.out.println("-------------------------\n");
        System.out.println("by Mike Pratt (A00320459)\n");
        System.out.println("This program calculates a competitor's combined score based");
        System.out.println("on the judges' scores. This program uses " + numJudges + " judges");
        System.out.println("and a " + maxScore + " point scoring system.\n");
        System.out.println("");

        for (int n = 1; n <= numJudges; n++)
        {
            System.out.print("Enter the score from judge #" + n + ": ");
            judgeScore = kbd.nextDouble();
            //Validity test
            if (judgeScore < 0 || judgeScore > maxScore)
            {
                System.out.println("Illegal data input.\nQuitting");
                System.exit(1);
            }
            //High score and Low score test
            if (judgeScore <= lowScore)
            {
                lowScore = judgeScore;
            }
            else if (judgeScore >= highScore)
            {
                highScore = judgeScore;
            }
            runningTotal = runningTotal + judgeScore;



        }

        finalScore = ((runningTotal - lowScore - highScore) /
                      (numJudges - numScoresDropped)) * scoreMultiplier;
        System.out.println("\n\nDropped low score:\t" + lowScore);
        System.out.println("Dropped high score:\t" + highScore);
        System.out.println("\nCombined score:\t\t" + finalScore);

    }
}

