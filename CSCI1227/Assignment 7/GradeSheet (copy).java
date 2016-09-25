import java.util.Scanner;
import java.io.File;

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
        int numStu = 0;
 
        // TODO: Get the students' data from a file specified by the user
            // Create the Student array and counter
    Student[] student = new Student[MAX_STU];
    int numStu = 0;
    String name;
    int asgn;
    int grade;

    // TODO: Get the students' data from a file specified by the user
    System.out.print("Which file should I use? ");
    String fileName = kbd.nextLine();

    File f = new File(fileName);
    try
    {
    Scanner gradesFile = new Scanner(f);

    for (int i = 0; i < MAX_STU; i++) 
    {
    while (!gradesFile.hasNextInt() && numStu < MAX_STU)
    {
    name = gradesFile.nextLine(); 
    student[numStu].setName(name);

    while(gradesFile.hasNextInt()) 
    {
    for(int s = 0; s < 6; s++)
    {
    grade = gradesFile.nextInt();
    asgn = 1;
    student[numStu].setAsgnGrade(asgn, grade);
    asgn ++;
    }
    } 
    }
    numStu ++; 
    }
    f.close();
    } 
    catch (FileNotFoundException e)
    {
    while (!f.exists())
    {
    System.out.print("File " + fileName + "could not be opened. "
    + "Please try again. ");
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

