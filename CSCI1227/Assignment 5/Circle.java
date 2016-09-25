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

    public int compareTo(Object other)
    {
        double diff = 0;
        // sort me before any nothings
        if (other == null)
        {
            return -1;
        }
        // for other Rectangles...
        else if (other instanceof Circle)
        {
            Circle r = (Circle)other;
            // sort by area...
            if (this.getArea() != r.getArea())
            {
                diff = this.getArea() - r.getArea();
                // diff will be negative if I'm narrower
                // --> narrower comes first
            }
            // ...or by height if we have the same width
            else
            {
                diff = this.getArea() - r.getArea();
                // diff will be negative if I'm shorter
                // --> shorter comes first
            }
        }
        return (int)Math.signum(diff);
    }

}

