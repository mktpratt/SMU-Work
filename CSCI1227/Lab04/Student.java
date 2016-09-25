/**
 * A Student class that takes advantage of the Person class
 */

public class Student extends Person
{
    // Person stuff comes for free!

    // Student stuff
    private int studentNumber;

    public Student()
    {
        this("Unnamed Student", 0);
    }

    public Student(String name)
    {
        this(name, 0);
    }

    public Student(String initialName, int initialStudentNumber)
    {
        super(initialName);
        studentNumber = initialStudentNumber;
    }

    public void reset(String newName, int newStudentNumber)
    {
        setName(newName);
        studentNumber = newStudentNumber;
    }

    public int getStudentNumber()
    {
        return studentNumber;
    }

    public void setStudentNumber(int newStudentNumber)
    {
        studentNumber = newStudentNumber;
    }

    public void writeOutput()
    {
        super.writeOutput();
        System.out.println("Student#: " + studentNumber);
    }

    public String toString()
    {
        return getName() + " (" + studentNumber + ")";
    }
}
