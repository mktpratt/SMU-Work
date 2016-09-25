/**
 * A program to print some information about Queen Victoria
 *
 * @author Mark YOUNG, A00000000
 * @version 1.0, 2010-05-12
 */

public class Vitals 
{
    public static void main(String[] args) 
    {
        // 1. Record vital statistics
        //     -- name is Victoria
        String name = "Victoria";
        //     -- born in 1819
        int yearBorn = 1819;
        //     -- died in 1901
        int yearDied = 1901;
 
        // 2. Report vital statistics
        //     -- name and birth year
        System.out.print(name);
        System.out.print(" was born in ");
        System.out.print(yearBorn);
        System.out.println(".");

        //     -- death year and age at death
        System.out.println("She died in "
                           + yearDied
                           + ", aged about "
                           + (yearDied - yearBorn)
                           + " years.");

        // 3. Record other life info
        //      -- crowned in 1837
        int yearCrowned = 1837;
        //      -- husband named Albert
        String husbandName = "Albert";
        //      -- married in 1840
        int yearMarried = 1840;
        // 4. Report other life info
        //      -- crowned (year and age)
        System.out.println("She was crowned in "
                         + yearCrowned
                         + ", at about "
                         +(yearCrowned - yearBorn)
                         + " years old."); 
        //      -- married (husband's name and year)
        System.out.println("She married "
                         + husbandName
                         + " in "
                         + yearMarried);
        //      -- reigned for how many years
        System.out.println("She reigned for about "
                         + (yearDied - yearCrowned)
                         + " years.");
    }
}

