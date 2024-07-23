package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add("Alexey");
        arrayList1.add("Sergey");
        System.out.println(arrayList1);
        List<String> list2 = arrayList1.subList(1,3);//представление от arrayList
        System.out.println(list2);
        list2.add("Anna");//добавили в представление.. И все структурные модификации должны быть сдланы с помощью представления view
        System.out.println(list2);
        System.out.println(arrayList1);
       // System.out.println(arrayList1.size());
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");
        StringBuilder[] array = {sb1,sb2,sb3,sb4};
        List<StringBuilder> list = Arrays.asList(array);
        System.out.println(list);
        array[0] = new StringBuilder("df");
        System.out.println(list);
      //  list.add(new StringBuilder("dgh"));\

        //String[] arrayNew = arrayList1.toArray();
        List<Integer> list3 = List.of(3,8,13);//неизменяемый
        System.out.println(list3);
        //list3.add(100)

    }
}
