public class NoSuchAssignmentException extends Exception
{
    public NoSuchAssignmentException()
    {
        this("There is no " + Student.NUM_ASGN);
    }

    public NoSuchAssignmentException(String message)
    {
        super(message);
    }
}
