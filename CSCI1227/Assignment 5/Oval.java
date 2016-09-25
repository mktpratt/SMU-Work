/**
 * An ideal shape -- the width and height of an oval
 */
public class Oval implements Measurable
{
    private double width;
    private double height;

    public Oval(double w, double h)
    {
        if (w >= 0.0)
            width = w;
        if (h >= 0.0)
            height = h;
    }

    public Oval()
    {
        // make this oval with width and height of 0.0
        this(0.0, 0.0);
    }

    public void setWidth(double w)
    {
        if (w >= 0.0)
            width = w;
    }

    public void setHeight(double h)
    {
        if (h >= 0.0)
            height = h;
    }

    public double getWidth()
    {
        return width;
    }

    public double getHeight()
    {
        return height;
    }

    public double getArea()
    {
        return Math.PI * width * height / 4;
    }

    public double getPerimeter()
    {
        return Math.PI * (width + height) / 2;
    }

    public double getCircumference()
    {
        return getPerimeter();
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
        else if (other instanceof Oval)
        {
            Oval r = (Oval)other;
            // sort by width...
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

