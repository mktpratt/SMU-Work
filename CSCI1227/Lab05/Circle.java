/**
 * An ideal circle -- just a radius
 */

public class Circle implements Measurable
{
    private double radius;

    public Circle(double r)
    {
        radius = r;
    }

    public double getRadius()
    {
        return radius;
    }

    public double getDiameter()
    {
        return 2.0 * radius;
    }

    public double getCircumference()
    {
        return 2.0 * Math.PI * radius;
    }

    public double getWidth()
    {
        return getDiameter();
    }
    public double getHeight()
    {
        return getDiameter();
    }
    public double getArea()
    {
        return Math.PI * radius * radius;
    }
    public double getPerimeter()
    {
        return getCircumference();
    }
}

