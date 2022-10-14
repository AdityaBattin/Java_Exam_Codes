import java.util.*;

public class StackExample {
    public static void main(String args[]) {
        System.out.println("Declering stack ..... ");
        Stack<Integer> st = new Stack<>();
        System.out.println("Declared a stac named st");

        // Stack methords
        System.out.println("Stack methords 1.push --> ");
        System.out.println("Before Push operation : ");
        System.out.println(st);
        // pushing
        st.push(10);
        st.push(11);
        st.push(12);
        st.push(13);
        st.push(14);
        System.out.println("After Push operation : ");
        System.out.println(st);

        // pop
        System.out.println("Stack Methord 2.pop --> ");
        st.pop();
        System.out.println("After a single push : ");
        System.out.println(st);

    }
}
