/**
  * This program tells you about its command line arguments
  */

public class PrintArgs
{
    public static void main(String[] args)
    {
        System.out.print("\n\n"
                         + "About My Command Line Arguments\n"
                         + "-------------------------------\n\n"
                         + "My " + args.length + " command line arguments were:\n");

        for (int i = 0; i < args.length; i++)
        {
            System.out.printf("%4d: \"%s\"%n", i, args[i]);
        }
        System.out.println();

        // (A3) print out the initial letter of each word
        System.out.print("The acronym/abbreviation for my "
                         + "command line arguments is: ");
        for (int i = 0; i < args.length; i++)
        {
            System.out.print(args[i].charAt(0));
        }
        System.out.println();
    }
}
