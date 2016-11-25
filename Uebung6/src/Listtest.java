/**
 * Created by Tobias on 23/11/2016.
 */
public class Listtest {
    public static void main(String[] args) {
        List list = new List();

        list.insertFirst("Test0");

        System.out.println("--------------------------------");
        System.out.println("INSERT");
        System.out.println("--------------------------------");
        System.out.println(list.insert(0, "Test1"));
        System.out.println(list.insert(1, "Test2"));
        System.out.println(list.insert(2, "Test3"));
        System.out.println(list.insert(3, "Test4"));
        System.out.println(list.insert(4, "Test5"));

        System.out.println("--------------------------------");
        System.out.println("ITERATOR");
        System.out.println("--------------------------------");

        List.ListIterator iterator = list.iterator();
        do {
            System.out.println(iterator.next());
        } while (iterator.hasNext());
        System.out.println(iterator.next());


        System.out.println("--------------------------------");
        System.out.println("REMOVE");
        System.out.println("--------------------------------");

        System.out.println(list.remove(0));
        System.out.println(list.remove(4));
        System.out.println(list.remove(0));
        System.out.println(list.remove(1));


        System.out.println("--------------------------------");
        System.out.println("ITERATOR");
        System.out.println("--------------------------------");

        iterator = list.iterator();
        do {
            System.out.println(iterator.next());
        } while (iterator.hasNext());
        System.out.println(iterator.next());
    }
}
