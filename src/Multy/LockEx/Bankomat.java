package Multy.LockEx;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankomat {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        Employee emp1 = new Employee("Zaur",lock);
        Employee emp2 = new Employee("Oleg",lock);
        Employee emp3 = new Employee("Elena",lock);
        Employee emp4 = new Employee("Viktor",lock);
        Employee emp5 = new Employee("Marina",lock);
        emp1.start();
        emp2.start();
        emp3.start();
        Thread.sleep(5000);
        emp4.start();
        emp5.start();


    }
}
