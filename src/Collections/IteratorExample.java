package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Ivan");
        arrayList.add("Sergey");
        arrayList.add("Gleb");
        arrayList.add("Boris");
        arrayList.add("Roman");
        arrayList.add("Andrey");
        Iterator<String> iterator = arrayList.iterator();//с помощью итератора можно удалять элементы
        while(iterator.hasNext()){
            System.out.println(arrayList);

            iterator.next();
            iterator.remove();
        }



    }
}
