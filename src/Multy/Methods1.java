package Multy;

public class Methods1 {
    public static void main(String[] args) {
        MyThread5 myThread5 = new MyThread5();
        myThread5.setName("Kalibr");
        myThread5.setPriority(9);
        System.out.println("name of mth5 = "+myThread5.getName() + " Priority: "+ myThread5.getPriority());
        MyThread5 myThread6 = new MyThread5();
        System.out.println("name of mth5 = "+myThread6.getName() + " Priority: "+ myThread6.getPriority());
    }

}
