/**
 * Determines whether or not a a student passes or fails a jury.
 *
 * @author Mike Pratt -- A00320459
 * @version 1.0
 */

import java.util.Scanner;

public class JuryEvaluation  {

    public static void main(String[] args)    {
        
    Scanner kbd = new Scanner (System.in);
    int expressScore, timbreScore, noteScore; 
    String finalScore;
    
        System.out.println("\nJuly Evaluation");
    	System.out.println("----------------\n");
    	System.out.println("by Mike Pratt (A00320459)\n");

        System.out.print("Expressiveness score(%): ");
        expressScore = kbd.nextInt();kbd.nextLine();
        System.out.print("Timbre richness score(%): ");
        timbreScore = kbd.nextInt();kbd.nextLine();
        System.out.print("Note accuracy score(%): ");
        noteScore = kbd.nextInt();kbd.nextLine();
        
        if (expressScore >= 60 && timbreScore >= 60 && noteScore >= 60)
        {    
            finalScore = "Pass";
        }
        else if (expressScore >= 50 && (timbreScore >= 70 || noteScore >= 70))
        {
            finalScore = "Pass";
        }    
        else if ((expressScore >=50 && timbreScore >= 50) && noteScore >= 90)
        {
            finalScore = "Pass";
        }
        else if (expressScore >= 35 && (timbreScore >= 90 && noteScore >= 90))
        {
            finalScore = "Pass";
        }
        else
        {
            finalScore = "Recommendation for retest.";
        }
        
        
        System.out.println("\nEvaluation: " + finalScore);             
        

    }
}

