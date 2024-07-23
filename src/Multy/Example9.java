package Multy;

public class Example9 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Method Main begins");
        Thread thread = new Thread(new Worker());
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
        thread.join(1500);
        System.out.println(thread.getState());
        System.out.println("Main ends");
        System.out.println(thread.getState());

    }
}
