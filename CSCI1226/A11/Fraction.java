/**
 * A class to represent a fraction
 *
 * @author Mike Pratt -- A00320459
 * @version 1.0
 */
public class Fraction
{
    // instance variables
    private int numerator;
    private int denominator;

    // constructors
    public Fraction()
    {
        numerator = 0;
        denominator = 1;
    }


    public Fraction(int n)
    {
        this(n,1);
    }

    public Fraction(int n, int d)
    {
        if (d > 0)
        {
            numerator = n;
            denominator = d;
        }
        else if (d == 0)
        {
            System.out.println("Illegal denominator (" + denominator + ")");
            numerator = 0;
            denominator = 1;
        }
        else
        {
            numerator = n * -1;
            denominator = d * -1;
        }

    }

    public Fraction(Fraction f)
    {
        numerator = f.numerator;
        denominator = f.denominator;
    }

    // public methods
    public String toString()
    {

        return String.format(numerator + "/" + denominator);
    }

    public double toDouble()
    {

        return (double)(numerator) / (double)(denominator);
    }

    public boolean equals(Fraction f)
    {
        if ((f.numerator * denominator) == (numerator * f.denominator))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public Fraction times(Fraction f)
    {
        return new Fraction(numerator * f.numerator,
                            denominator * f.denominator);
    }

    public Fraction times(int n)
    {
        return new Fraction(numerator * n, denominator);
    }

    public double times(double d)
    {
        return (double)((d * numerator) / denominator);
    }
}
