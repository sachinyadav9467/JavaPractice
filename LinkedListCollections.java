import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCollections{
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(10);
        ll.add(15);
        ll.add(26);
        ll.add(39);
        ll.add(49);
        ll.addFirst(20);
        ll.addLast(28);
        Iterator<Integer> it= ll.iterator();
        System.out.println("printing linkList");
        while(it.hasNext())
        {
            System.out.println(it.next()+ " ");
        }
    }
}