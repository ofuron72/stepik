package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class HashCodeExample {
    public static void main(String[] args) {
        Map<Student,Double> map = new HashMap<>();
        Student st1 = new Student("Zaur","Tregulov",3);
        Student st2 = new Student("Mariya","Ivanova",1);
        Student st3 = new Student("Sergey","Petrov",4);
        map.put(st1,7.5);
        map.put(st2,8.7);
        map.put(st3,9.2);
        System.out.println(map);

        Student st4 = new Student("Zaur","Tregulov",3);
        Student st5 = new Student("Igor","Sidorov",4 );
        boolean result = map.containsKey(st4);//должен быть переопределен как hashcode так и equals
        System.out.println("result= "+result);
    }

}

