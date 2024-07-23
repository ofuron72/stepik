package Multy.DeadLock;

public class Thread20 implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread 20: попытка захватить монитор объекта lock2");
        synchronized (DeadLockExample.lock2){
            System.out.println("Thread 20: монитор объекта lock2 захвачен");

            System.out.println("Thread 20: попытка захватить монитор объекта lock1");
            synchronized (DeadLockExample.lock1){
                System.out.println("Thread 20: монитор объекта lock1 захвачен");
            }
        }
    }
}
