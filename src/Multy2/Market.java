package Multy2;

public class Market {
    private  int breadCount = 0;

    public synchronized void getBread(){
        while(breadCount<1){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCount--;
        System.out.println("Потребитель купил 1 хлеб");
        System.out.println("Осталось хлеба: "+breadCount);
        notify();
    }

    public synchronized void putBread(){
        while(breadCount>=5){
            try{
                wait();
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        notify();
        breadCount++;
        System.out.println("Производитель добавил на ветрину 1 хлеб");
    }

}
