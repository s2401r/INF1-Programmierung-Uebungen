/**
 * Created by Tobias on 23/11/2016.
 */
public class Listtest {
    public static void main(String[] args) {
        List list = new List();

        list.insertFirst("Test0");
        list.insert(1,"Test1");
        list.insert(2,"Test2");
        list.insert(3,"Test3");
        list.insert(4,"Test4");
        list.insert(5,"Test5");

        list.remove(0);
        list.remove(4);
    }
}
