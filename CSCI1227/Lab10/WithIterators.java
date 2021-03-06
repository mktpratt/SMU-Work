import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class WithIterators
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("In");
        list.add("the");
        list.add("town");
        list.add("where");
        list.add("I");
        list.add("was");
        list.add("born");
        list.add("lived");
        list.add("a");
        list.add("man");
        list.add("who");
        list.add("sailed");
        list.add("the");
        list.add("sea");

        checkLength(list);
        System.out.println("\nThe list elements:");
        writeList(list);
        System.out.println("\nThe list elements in reverse:");
        writeListReversed(list);
        System.out.println();
    }

    public static void checkLength (List<String> list)
    {
        ListIterator<String> it = list.listIterator();
        while (it.hasNext())
        {
            String word = it.next();
            if (word.length() <= 3)
            {
                it.remove();
            }
            else if (word.length() >= 5)
            {
                it.set(word.toUpperCase());
            }
        }

    }

    public static void writeList(List<String> list)
    {
        ListIterator<String> it = list.listIterator();
        while (it.hasNext())
        {
            System.out.println("\t" + it.next());
        }
    }

    public static void writeListReversed(List<String> list)
    {
        ListIterator<String> it = list.listIterator(list.size());
        while (it.hasPrevious())
        {
            System.out.println("\t" + it.previous());
        }
    }
}
