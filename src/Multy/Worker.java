package Multy;

public class Worker implements Runnable {
    @Override
    public void run() {
        System.out.println("Work begins");
        try{
            Thread.sleep(2500);
        }
        catch (InterruptedException ex){
            ex.printStackTrace();
        }
        System.out.println("Work ends");
    }
}
