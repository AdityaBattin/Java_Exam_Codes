
// all collection frame works are in utils library
import java.util.*;
// import java.io.*;

public class ArrayListExample {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of ArrayList : ");
        int n = sc.nextInt();

        // using Collection Generic class for integer
        ArrayList<Integer> list = new ArrayList<>(n);

        // methords for ArrayList
        // add
        list.add(0);
        list.add(1);
        list.add(3);
        // add with index specified
        list.add(1, 2);

        // index --> indexof() and get()
        int index = list.indexOf(2);
        int element = list.get(1);
        System.out.println(index + " " + element);

        // remove --> remove(int index) or remove(obj o)
        list.add(5);
        list.add(6);
        list.remove(3); // index 5 is removed

        // clear --> emplys the list
        System.out.println("Before : " + list);
        list.clear();
        System.out.println("After : " + list);
        sc.close();
    }
}
