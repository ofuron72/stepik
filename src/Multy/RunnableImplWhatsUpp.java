package Multy;

public class RunnableImplWhatsUpp implements Runnable {
    @Override
    public void run() {
        MakeCalls makeCalls = new MakeCalls();
        makeCalls.whatsUppCall();
    }
}
