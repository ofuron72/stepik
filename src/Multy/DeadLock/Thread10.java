package Multy.DeadLock;

public class Thread10 implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread 10: попытка захватить монитор объекта lock1");
        synchronized (DeadLockExample.lock1){
            System.out.println("Thread 10: монитор объекта lock1 захвачен");

            System.out.println("Thread 10: попытка захватить монитор объекта lock2");
            synchronized (DeadLockExample.lock2){
                System.out.println("Thread 10: монитор объекта lock2 захвачен");
            }
        }
    }
}
