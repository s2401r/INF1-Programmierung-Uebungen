/**
 * Created by Tobias on 23/11/2016.
 */
public class Listtest {
    public static void main(String[] args) {
        List list = new List();

        list.insertFirst("Test0");
        list.insert(0, "Test1");
        list.insert(0, "Test2");
        list.insert(0, "Test3");
        list.insert(0, "Test4");
        list.insert(0, "Test5");

        List.ListIterator iterator = list.iterator();
        do {
            System.out.println(iterator.next());
        } while (iterator.hasNext());
        System.out.println(iterator.next());

        list.remove(0);
        list.remove(3);

        iterator = list.iterator();
        do {
            System.out.println(iterator.next());
        } while (iterator.hasNext());
        System.out.println(iterator.next());
    }
}
