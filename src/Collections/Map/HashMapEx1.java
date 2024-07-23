package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();//ключи должны быть уникальными, значения нет
        map1.put(1000,"Zaur Tregulov");              //ключ можеть быть null, значение тоже
        map1.put(3568,"Ivan Ivanov");
        map1.put(6578,"Mariya Sidorova");
        map1.put(15879,"Nikolay Petrov");
        map1.putIfAbsent(1000,"Oleg Ivanov");
        System.out.println(map1);
        System.out.println(map1.get(3568));
        map1.remove(6578);
        System.out.println(map1);
        System.out.println(map1.containsValue("Ivan Ivanov"));
    }
}
