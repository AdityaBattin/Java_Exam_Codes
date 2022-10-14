
import java.io.*;

public class javaDeserialize {
    public static void main(String args[]) {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"));
            Student s = (Student) in.readObject();
            System.out.println("Successfully fetched the details");
            System.out.println("--->");
            System.out.println(s.id + " " + s.name);
            in.close();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Failed to fetch the details");
        }

    }
}
