public class NoBasisForEvaluationException extends Exception
{
    public NoBasisForEvaluationException()
    {
        this("Cannot evaluate Student because no assignments"
              + "have been passed in!");
    }

    public NoBasisForEvaluationException(String message)
    {
        super(message);
    }
}
