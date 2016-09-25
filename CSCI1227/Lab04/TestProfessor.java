/**
 * Test the Professor class (Lab=04 2012)
 *
 * @author Mark Young (A00000000)
 * @version 1.0
 */
public class TestProfessor
{
    public static void main(String[] args)
    {
        Professor p1 = new Professor("Alan Turing", "Mathematics");
        Professor p2 = new Professor("Emmett Brown");

        System.out.println("p1's name: " + p1.getName());
        System.out.println("p2's name: " + p2.getName());
        System.out.println("p1's department: " + p1.getDepartment());
        System.out.println("p2's department: " + p2.getDepartment());
        System.out.println();

        p1.setName("Turing, Alan");
        p2.setName("Jones, Indiana");
        p2.setDepartment("Archeology");
        System.out.println("p1's name: " + p1.getName());
        System.out.println("p2's name: " + p2.getName());
        System.out.println("p1's department: " + p1.getDepartment());
        System.out.println("p2's department: " + p2.getDepartment());
        System.out.println();

        
        Professor sir = new Professor("Masakazu Tamura", "Philosophy");

        sir.writeOutput();
        System.out.println();
        System.out.println("Please welcome " + sir + " to the stage!");

        /* you can leave these lines
        in */
    }
}

