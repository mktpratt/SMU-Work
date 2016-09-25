/**
 * Able to be measured -- in particular, having a width, height, area and
 * perimeter.
 */
public interface Measurable extends Comparable
{
    public double getWidth();
    public double getHeight();
    public double getArea();
    public double getPerimeter();
}

