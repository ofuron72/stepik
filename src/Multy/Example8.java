package Multy;

public class Example8 extends Thread{
    public void run() {
        for(int i =1; i<=10;i++){
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException ex){
                ex.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+ " " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new myRunnable());
        Example8 thread2 = new Example8();
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Конец");
    }
}
