package Multy.DeadLock;

public class DeadLockExample {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) { //так как очередность объектов разная вызовется deadlock - взаимная блокировка
        Thread thread10 = new Thread(new Thread10());
        Thread thread20 = new Thread(new Thread20());
        thread10.start();
        thread20.start();
    }
}
