package Multy.DaemonExample;

public class UserThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName() + " Is Daemon: "+ isDaemon());

    }
}
