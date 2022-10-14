
import java.io.*;

public class javaSerial1 {
    public static void main(String args[]) {
        try {
            Student s1 = new Student(45, "AdityaBattin", 1245);
            // output using the file
            FileOutputStream fout = new FileOutputStream("f.txt");
            // output the object in file
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(s1); // send object s1
            out.flush(); // created the file
            out.close();

            System.out.println("Successfully outputed the file");

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Sorry we ran onto an Exception");
        }
    }
}
