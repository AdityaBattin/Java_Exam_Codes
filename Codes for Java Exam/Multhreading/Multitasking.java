import java.lang.*;

//using the thread class in java (Extending The Thread Class)
class MyThread1 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("MyThread 1 is Running");
            System.out.println("I am Happy");
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("MyThread 2 is Running");
            System.out.println("I am Sad");
        }
    }
}

class Multitasking {
    public static void main(String[] args) {
        System.out.print("Hello world");
        // creating the thread
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        // starting the thread
        t1.start();
        t2.start();

    }
}