import java.util.Scanner;

public class Broken
{
    public static void main(String[] args) 
    {
        Scanner kbd = new Scanner (System.in);

        System.out.print("Enter your first name.");
        String name = kbd.next();
        System.out.print("Enter the year you were born.");
        int yearBorn = kbd.nextInt();
        int thisYear = 2011;
        int howOld = thisYear - yearBorn;

        System.out.println(name + " was born in " + yearBorn + " and is now " 
                          + howOld + " years old!");
    }
}
