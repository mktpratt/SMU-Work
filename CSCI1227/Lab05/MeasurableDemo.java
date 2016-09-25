public class MeasurableDemo
{
    public static final int SQUARE_SIZE = 20;

    public static void main(String[] args)
    {
        Rectangle r = new Rectangle(10, 40);
        Circle c = new Circle(50);

        System.out.print("\n\n"
                         + "Measurable Demo\n"
                         + "---------------\n"
                         + "\n"
                         + "This program creates a Rectangle and a Circle "
                         + "then passes each of them to a\nsingle method -- "
                         + "a method that can accept both of them "
                         + "because it is expecting\nto be given a Measurable -- "
                         + "which both Rectangles and Circles are!\n");

        System.out.println("\nFirst the Rectangle: " + r);
        display(r);
        System.out.println("\nNext the Circle: " + c);
        display(c);


        Square s = new Square(SQUARE_SIZE);
        System.out.println("\nFinally the Square: " + s);
        display(s);


        System.out.println("\nArea Checks:");
        if (haveSameArea(r, r))
        {
            System.out.println("Rectangle has same area as itself.");
        }
        if (haveSameArea(r, c))
        {
            System.out.println("Rectangle has same area as Circle.");
        }
        if (haveSameArea(r, s))
        {
            System.out.println("Rectangle has same area as Square.");
        }


        System.out.println("\nequals Checks:");
        Square s2 = new Square(SQUARE_SIZE);        // same size square
        Square s3 = new Square(SQUARE_SIZE + 1);    // diff. size square
        Object s4 = new Square(SQUARE_SIZE);        // same, but in Object
        if (s.equals(s2))
        {
            System.out.println("Square s equals s2");
        }
        if (s.equals(s3))
        {
            System.out.println("Square s equals s3");
        }
        if (s.equals(s4))
        {
            System.out.println("Square s equals s4");
        }

        /* you can leave this line (and the one below) in
        */

        System.out.print("\n\n");
    }

    public static void display(Measurable figure)
    {
        double perimeter = figure.getPerimeter();
        double area = figure.getArea();
        System.out.println("Perimeter = "
                           + perimeter + "\nArea = " + area);
    }

    public static boolean haveSameArea(Measurable shape1, Measurable shape2)
    {
        return shape1.getArea() == shape2.getArea();
    }

}

