import java.util.Arrays;

/**
 * A class for keeping track of some student information
 *
 * @author A00000000 YOUNG, Mark
 * @version 4.0 2012-01-11
 */

public class Student 
{
    // class constants
    public static final int NUM_ASGN = 6;

    // instance constants and variables
    public final int NUMBER;
    private String name;
    private int[] asgnGrade = new int[NUM_ASGN];

    // class variables
    private static int numPassedIn = 0;
    private static int nextStudentNumber = 1;

    // ************ Constructors ************ //

    /** 
     * primary constructor 
     *
     * @since 2.00
     * @param name  name of the new student
     */
    public Student(String name) 
    {
        NUMBER = nextStudentNumber;
        nextStudentNumber++;
        setName(name);
    }

    /** 
     * default constructor
     *
     * @since 1.10
     */
    public Student() 
    {
        // name field left blank
        this("");
    }

    // ************ Getters ************ //

    /** 
     * NUMBER getter 
     *
     * @return  student number of this student
     */
    public int getNumber() 
    {
        return NUMBER;
    }

    /** 
     * name getter 
     *
     * @return  name of this student
     */
    public String getName() 
    {
        return name;
    }

    /**
     * assignment grade list getter
     *
     * @since 3.1
     * @return <i>copy</i> of the passed-in assignment grades
     */
    public int[] getAsgnGrades()
    {
        // make and return a copy so we don't lose control of the grades
        return Arrays.copyOf(asgnGrade, numPassedIn);
    }

    /**
     * assignment grade (element) getter
     *
     * @param asgn the number of the assignment (one-based!) to get
     */
    public int getAsgnGrade(int asgn) 
    {
        return asgnGrade[asgn-1];
    }

    /**
     * last assignmnet passed in getter
     */
    public static int getLastPassedInAssignment()
    {
        return numPassedIn;
    }

    /** 
     * pctGrade getter 
     *
     * @return  percentage grade of this student as an int
     */
    public int getPctGrade() 
    {
        return (int)Math.round(getAverage());
    }

    /**
     * get average as a double
     *
     * @since 4.0
     */
    public double getAverage() 
    {
        int sum = 0;
        for (int i = 0; i < numPassedIn; i++)
        {
            sum += asgnGrade[i];
        }
        return (double)sum / (double)(numPassedIn);
    }

    /** 
     * letterGrade getter 
     *
     * @return  letter grade of this student
     */
    public String getLetterGrade() 
    {
        return letterFromPercent(getPctGrade());
    }

    /**
     * NUMBER formatted as an A-Number
     * 
     * @since 3.2
     * @return	String	Student number (in A00000000 format)
     */
    public String getANumber() 
    {
        return String.format("A%08d", NUMBER);
    }

    // ************ Setters ************ //

    /** 
     * Name setter 
     *
     * @param name  new name for this student
     */
    public void setName(String newName) 
    {
        name = newName;
    }

    /**
     * assignment grade (element) setter
     *
     * @param asgn  the assignment number (one-based) to set a grade for
     * @param grade the grade (0..100) to set the assignment to
     */
    public void setAsgnGrade(int asgn, int grade) 
    {
        if (inGradeRange(grade))
        {
            asgnGrade[asgn-1] = grade;

            // check if this is the first student to pass in this assignment
            if (numPassedIn < asgn) numPassedIn = asgn;
        }
        else
        {
            System.err.print("Invalid grade (" + grade + ") for assignment "
                            + asgn);
        }
    }

    // ************ Other Methods ************ //

    /**
     * Convert to String
     * 
     * @since 3.00
     * @return	String	Student number (in A00000000 format) & name
     */
    public String toString() 
    {
        return getANumber() + " " + name;
    }

    /** 
     * print the student record 
     */
    public void printRecord() 
    {
        System.out.print("\n"
           + "\nStudent #: \t" + getANumber()
           + "\nName:      \t" + name
           + "\nGrade:     \t" + getPctGrade()
           + " (" + getLetterGrade() + ")\n\n");
    }

    // ************ Class Methods ************ //

    /**
     * Convert percentage grade to letter grade
     *
     * @param pct grade (0 to 100)
     * @return letter grade ("F" to "A+")
     * @since 4.0
     */
    public static String letterFromPercent(int pct) 
    {
        if (pct < 50)
        {
            return "F";
        }
        else if (pct < 60)
        {
            return "D";
        }
        else if (pct < 70)
        {
            if (pct < 63)       return "C-";
            else if (pct < 67)  return "C";
            else                return "C+";
        }
        else if (pct < 80)
        {
            if (pct < 73)       return "B-";
            else if (pct < 77)  return "B";
            else                return "B+";
        }
        else
        {
            if (pct < 86)       return "A-";
            else if (pct < 90)  return "A";
            else                return "A+";
        }
    }

    /**
     * whether the given number is the number of an actual assignment
     *
     * @param asgn a (supposed) assignment number
     * @return whether it's a valid assignment number
     * @since 4.0
     */
    public static boolean validAsgnNumber(int asgn) 
    {
        return (1 <= asgn && asgn <= NUM_ASGN);
    }

    /**
     * whether the given number is the number of a passed-in assignment
     *
     * @param asgn a (supposed) assignment number
     * @return whether an assignment by that number has been passed in
     * @since 4.0
     */
    public static boolean passedInAsgnNumber(int asgn) 
    {
        return (1 <= asgn && asgn <= numPassedIn);
    }

    /**
     * grade range checker
     *
     * @param grade the grade to be checked
     * @return whether the grade is valid
     * @since 3.1
     */
    public static boolean inGradeRange(int grade) 
    {
        return (0 <= grade && grade <= 100) || grade == -100;
    }
}
