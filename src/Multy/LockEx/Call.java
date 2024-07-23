package Multy.LockEx;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Call {
    private Lock lock  = new ReentrantLock();

    void mobileCall(){
        lock.lock();
        try {
            System.out.println("Mobile call starts");
            Thread.sleep(3000);
            System.out.println("Mobile call ends");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        finally {
            lock.unlock();
        }
    }

    void skypeCall(){
        lock.lock();
        try {
            System.out.println("Skype call starts");
            Thread.sleep(5000);
            System.out.println("Skype call ends");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        finally {
            lock.unlock();
        }
    }

    void whatsUppCall(){
        lock.lock();
        try {
            System.out.println("WhatsUpp call starts");
            Thread.sleep(7000);
            System.out.println("WhatsUpp call ends");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        finally {
            lock.unlock();
        }
    }
}
