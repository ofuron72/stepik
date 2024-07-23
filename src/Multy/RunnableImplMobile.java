package Multy;

public class RunnableImplMobile implements Runnable{
    @Override
    public void run() {
        MakeCalls makeCalls = new MakeCalls();
        makeCalls.mobileCall();
    }
}
