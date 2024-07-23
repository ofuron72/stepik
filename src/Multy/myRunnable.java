package Multy;

public class myRunnable implements Runnable {
    @Override
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
}
