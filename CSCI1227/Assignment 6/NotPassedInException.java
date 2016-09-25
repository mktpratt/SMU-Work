public class NotPassedInException extends Exception
{
    public NotPassedInException()
    {
        this(Student.NUM_ASGN + "has not been passed in yet!");
    }

    public NotPassedInException(String message)
    {
        super(message);
    }
}
