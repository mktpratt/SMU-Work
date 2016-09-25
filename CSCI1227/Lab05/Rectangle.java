/**
 * An ideal rectangle -- just a height and width
 */
public class Rectangle implements Measurable
{
    private double myWidth;
    private double myHeight;

    public Rectangle(double width, double height)
    {
        myWidth = width;
        myHeight = height;
    }

    public double getHeight()
    {
        return myHeight;
    }

    public double getWidth()
    {
        return myWidth;
    }

    public double getPerimeter()
    {
        return 2 * (myWidth + myHeight);
    }

    public double getArea()
    {
        return myWidth * myHeight;
    }
}
