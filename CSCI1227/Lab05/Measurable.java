/**
 * An interface for closed planar figures
 */
public interface Measurable
{
    /** Returns the greatest height */
    public double getHeight();
    /** Returns the greatest width */
    public double getWidth();
    /** Returns the perimeter. */
    public double getPerimeter();
    /** Returns the area. */
    public double getArea();
}
