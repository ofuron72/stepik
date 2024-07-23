package Lambda;

public class Task3 {
    public static void main(String[] args) {
        DivisibleBy13 div = number -> (number%13==0);
        System.out.println(div.isDivisible(126));
        System.out.println(div.isDivisible(26));
    }
}
