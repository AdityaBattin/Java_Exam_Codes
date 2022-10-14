import java.lang.*;
// Multithread Using Runnable Interface

class MyThreadRunnable1 implements Runnable {
    public void run() {
        while (true) {
            System.out.println("I am Thread 1 not a Threat");
        }
    }
}

class MyThreadRunnable2 implements Runnable {
    public void run() {
        while (true) {
            System.out.println("I am Thread 2 not a Threat");
        }
    }
}

public class Multitasking2 {
    public static void main(String args[]) {
        System.out.println("This is Main Methord");

        MyThreadRunnable1 t1 = new MyThreadRunnable1();
        Thread th1 = new Thread(t1); // loading bullet in a gun
        MyThreadRunnable2 t2 = new MyThreadRunnable2();
        Thread th2 = new Thread(t2);

        // Fire bullet from a gun
        th1.start();
        th2.start();
    }

}
