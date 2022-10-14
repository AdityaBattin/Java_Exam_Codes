
import java.util.*;
import java.lang.*;

class SumThread extends Thread {

    int sum;

    SumThread(int a, int b) {
        sum = a + b;
    }

    @Override
    public void run() {
        System.out.println("The Thread is Alive : " + this.isAlive());
        System.out.println("The Sum is " + sum);
    }
}

class diffThread extends Thread {

    int diff;

    diffThread(int a, int b) {
        if (a > b) {
            diff = a - b;
        } else {
            diff = b - a;
        }
    }

    @Override
    public void run() {
        System.out.println("The Thread is Alive : " + this.isAlive());
        System.out.println("The diff is " + diff);
    }
}

class MulThread extends Thread {

    int mul;

    MulThread(int a, int b) {
        mul = a * b;
    }

    @Override
    public void run() {
        System.out.println("The Thread is Alive : " + this.isAlive());
        System.out.println("The Mul is " + mul);
    }
}

class divThread extends Thread {

    int div;

    divThread(int a, int b) {
        div = a / b;
    }

    @Override
    public void run() {
        System.out.println("The Thread is Alive : " + this.isAlive());
        System.out.println("The Div is " + div);
    }
}

public class ThreadCalculatorMultithreading {
    public static void main(String args[]) {
        // first taking user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        // initalizing threads
        SumThread sum = new SumThread(a, b);
        diffThread diff = new diffThread(a, b);
        MulThread mul = new MulThread(a, b);
        divThread div = new divThread(a, b);

        // checking the status
        System.out.println(
                "Before Threads are alive : " + sum.isAlive() + " " + diff.isAlive() + " " + mul.isAlive() + " "
                        + div.isAlive());

        mul.start();
        // mul.join();
        sum.start();
        diff.start();
        div.start();

    }
}
