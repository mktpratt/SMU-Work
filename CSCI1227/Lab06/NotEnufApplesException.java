public class NotEnufApplesException extends Exception
{
    public NotEnufApplesException()
    {
        this("Not enuf Apples!");
    }

    public NotEnufApplesException(String message)
    {
        super(message);
    }
}
