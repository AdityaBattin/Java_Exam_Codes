import java.awt.*; //for flow layout
import javax.swing.*; // swing GUI library

public class SwingDemo {
    public static void main(String args[]) {
        JFrame f = new JFrame("User SignUp Page");
        f.setSize(300, 400); // size of window
        f.setLayout(new FlowLayout()); // align center

        JLabel l1 = new JLabel("User Name : ");
        f.add(l1); // adding component to frame
        JTextField tf1 = new JTextField(20);
        f.add(tf1);

        JLabel l2 = new JLabel("Password : ");
        f.add(l2); // adding component to frame
        JTextField tf2 = new JTextField(20);
        f.add(tf2);

        JButton b1 = new JButton("SUBMIT");
        f.add(b1);

        f.setVisible(true);// display the frame

    }
}
