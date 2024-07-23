package Multy;

public class RunnableImplSkype implements Runnable{
    @Override
    public void run() {
        MakeCalls makeCalls = new MakeCalls();
        makeCalls.skypeCall();
    }
}
