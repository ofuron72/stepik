package Multy;

public class MakeCalls {
    static final Object lock = new Object();

     void mobileCall()  {

       synchronized (lock){
           System.out.println("Mobile call starts");

           try {
               Thread.sleep(3000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }

           System.out.println("Mobile call ends");
       }

    }

    void whatsUppCall()  {

        synchronized (lock){
            System.out.println("WhatsUpp call starts");

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("WhatsUpp call ends");
        }

    }

     void skypeCall()  {

       synchronized (lock){
           System.out.println("Skype call starts");

           try {
               Thread.sleep(3000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }

           System.out.println("Skype call ends");
       }

    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableImplMobile());
        Thread thread2 = new Thread(new RunnableImplSkype());
        Thread thread3 = new Thread(new RunnableImplWhatsUpp());
        thread1.start();
        thread2.start();
        thread3.start();
    }


}
