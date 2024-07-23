package Multy.LockEx;

import java.util.concurrent.locks.Lock;

public class Employee extends Thread{
    String name;
    private Lock lock;
    public Employee(String name, Lock lock){
        this.name = name;
        this.lock = lock;
    }
    @Override
    public void run() {
        if (lock.tryLock()) {
            try {
                //System.out.println(this.name+" Ждёт...");
                //lock.lock();
                System.out.println(this.name + " Пользуется банкоматом");
                Thread.sleep(2000);
                System.out.println(this.name + " Завершил использовние банкоматом");
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            } finally {
                lock.unlock();
            }
        }
        else{
            System.out.println(this.name + " Ушёл");
        }

    }
}
