import java.util.ArrayList;

public class BasicListExample
{
    public static void main(String[] args)
    {
        System.out.print("\n\n"
                         + "Basic List Example\n"
                         + "------------------\n\n"
                         + "Three ArrayLists -- String, Double and Integer. "
                         + "Just adding, removing &\nprinting elements.\n");

        System.out.println("\nArrayList<String>");
        ArrayList<String> list = new ArrayList<String>();

        list.clear();
        list.add("ten");
        list.add("twenty");
        list.add("thirty");
        System.out.println(list);
        list.remove("twenty");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);

        System.out.println("\nArrayList<Double>");
        ArrayList<Double> list2 = new ArrayList<Double>();

        list2.clear();
        list2.add(10.0);
        list2.add(20.0);
        list2.add(30.0);
        System.out.println(list2);
        list2.remove(20.0);
        System.out.println(list2);
        list2.remove(0);
        System.out.println(list2);

        System.out.println("\nArrayList<Integer>");
        ArrayList<Integer> list3 = new ArrayList<Integer>();

        list3.clear();
        list3.add(10);
        list3.add(20);
        list3.add(30);
        System.out.println(list3);
        list3.remove(new Integer(20));  // because remove(20) means
        // remove the item in position 20
        System.out.println(list3);
        list3.remove(0);
        System.out.println(list3);

        System.out.println();
    }
}
