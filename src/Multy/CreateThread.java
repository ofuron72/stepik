package Multy;

public class CreateThread {
    public static void main(String[] args) {
//        MyThread1 myThread1 = new MyThread1();//extends Thread
//        MyThread2 myThread2 = new MyThread2();
//        myThread1.start();
//        myThread2.start();
        Thread thread1 = new Thread(new myThread3());//implements Runnable
        Thread thread2 = new Thread(new MyThread4());
        thread1.start();
        thread2.start();

    }
}
