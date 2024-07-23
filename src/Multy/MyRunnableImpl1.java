package Multy;

public class MyRunnableImpl1 implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i < 3; i++){
            doWork1();
        }

    }
    public synchronized void doWork1(){
       synchronized (this){
           Counter.count++;
           System.out.println(Counter.count);
       }
    }
}
