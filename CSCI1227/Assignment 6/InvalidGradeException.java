public class InvalidGradeException extends Exception
{
    public InvalidGradeException(double grade)
    {
        this("Invalid grade: " + grade);
    }

    public InvalidGradeException(String message)
    {
        super(message);
    }
}
