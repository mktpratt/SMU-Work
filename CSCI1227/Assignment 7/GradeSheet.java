import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * a class to create a grade sheet using an array of Students
 *
 * @author A00000000 YOUNG, Mark
 * @version 2.0 (beta) 2012-02-15
 */
public class GradeSheet
{
    public static final int MAX_STU = 100;

    public static void main(String[] args)
    {
        Scanner kbd = new Scanner(System.in);

        // Introduce yourself
        System.out.print("\n\n"
                         + "Array of Students\n"
                         + "-----------------\n"
                         + "\n"
                         + "Prints the latest grade sheets for this class\n\n");

        // Create the Student array and counter
        Student[] student = new Student[MAX_STU];
        int numStu = 0, asgnNum = 0, grade = 0;
        String stuName;


        // TODO: Get the students' data from a file specified by the user
        System.out.print("What file would you like to use? ");
        String fileName = kbd.nextLine();
        File f = new File(fileName);

        try
        {
            Scanner gradeFile = new Scanner(f);
            for (int i = 0; i < MAX_STU; i++)
            {
                while (gradeFile.hasNextLine() && numStu < MAX_STU)
                {
                    stuName = gradeFile.nextLine();
                    student[numStu].setName(stuName);
                }
                while (gradeFile.hasNextInt() && numStu < MAX_STU)
                {
                    for (int c = 0; c < 6; c++)
                    {
                        grade = gradeFile.nextInt();
                        asgnNum = c;
                        student[numStu].setAsgnGrade(asgnNum, grade);
                    }
                }

            }
            gradeFile.close();
        }
        catch (FileNotFoundException e)
        {
            while (!f.exists())
            {
                System.err.println("Could not find file '" + fileName +
                                   "' Please try again!\n");
                System.out.print("What file would you like to use? ");
                fileName = kbd.nextLine();
            }
        }




        // Pause before printing report
        System.out.print("\n\n" + "Press Enter key to see report...");
        kbd.nextLine();

        // Print the grade sheet header
        int numAsgn = Student.getLastPassedInAssignment();
        System.out.print("\n\n"
                         + "Here are your students:\n\n"
                         + "Student ID  Name       ");
        for (int a = 1; a <= numAsgn; a++)
        {
            System.out.print(" A" + a + " ");
        }
        System.out.print(" Average  Letter");
        System.out.print("\n"
                         + "----------  ---------- ");
        for (int a = 1; a <= numAsgn; a++)
        {
            System.out.print("----");
        }
        System.out.println(" -------  ------");

        // Print the id, name and grades for each student
        for (int s = 0; s < numStu; s++)
        {
            System.out.printf("%-10s  %-10s",
                              student[s].getANumber(), student[s].getName());
            for (int a = 1; a <= numAsgn; a++)
            {
                System.out.printf("%4d", student[s].getAsgnGrade(a));
            }
            System.out.printf(" %7d     %s\n",
                              student[s].getPctGrade(), student[s].getLetterGrade());
        }

        // get and print the class average
        int sum = 0;
        for (int s = 0; s < numStu; s++)
        {
            sum += student[s].getPctGrade();
        }
        double avg = (double)sum / (double)numStu;

        System.out.printf("\n\n"
                          + "Class Average: %.1f (%s)\n\n",
                          avg,
                          Student.letterFromPercent((int)Math.round(avg)));
    }
}

