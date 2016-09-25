/**
 * Grade Calculator application
 *
 * @author Mike Pratt -- A00320459
 * @version 1.0
 */

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

    	int assignmentGrade, labGrade, testGrade, examGrade, roundedFinalGrade;
    	Scanner kbd = new Scanner (System.in);

    		System.out.println("\nGrade Calculator");
    		System.out.println("----------------\n");
    		System.out.println("by Mike Pratt (A00320459)\n");
    		System.out.println("This program calculates your final grade from your component grades.\n");
    		System.out.print("What is your percent grade for your assignments?");
    		assignmentGrade = kbd.nextInt();
    		System.out.print("What is your percent grade for your labs?");
    		labGrade = kbd.nextInt();
    		System.out.print("What is your percent grade for your test?");
    		testGrade = kbd.nextInt();
    		System.out.print("What is your percent grade for your exam?");
    		examGrade = kbd.nextInt();
    		System.out.println("\n\nGrade Report\n");
    		System.out.println("Assignments" + assignmentGrade + (assignmentGrade * 0.25));
    		System.out.println("Labs" + labGrade + (labGrade * 0.15));
    		System.out.println("Test" + testGrade + (testGrade * 0.20));
    		System.out.println("Exam" + examGrade + (examGrade * 0.40));
			System.out.println("");
			double finalGrade = (assignmentGrade * 0.25) + (labGrade * 0.15) + (testGrade * 0.20) + (examGrade * 0.40);
			roundedFinalGrade = (int)Math.round(finalGrade);
			System.out.println("Final" + roundedFinalGrade);

    }
}
