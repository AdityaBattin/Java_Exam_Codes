import java.util.*;

public class linklistExample {
    public static void main(String args[]) {
        System.out.println("Declearing a link list ....");
        LinkedList<Integer> li = new LinkedList<>();
        System.out.println("Declared a linklist named li -- SUCCESS");

        // add
        li.add(12);
        li.addFirst(13);
        li.addLast(23);
        System.out.println("After adding : " + li);

        // index
        int element_at_index_2 = li.get(2);
        System.out.println("element at index 2" + element_at_index_2);

        // remove
        li.remove(2);
        System.out.println("After removing 2nd index :" + li);

        // clear
        li.clear();
        System.out.println("After clear : " + li);
    }
}
