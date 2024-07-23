package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);
        int result  = list.stream().reduce((accumulator, element)->accumulator*element).get();//reduce возвращает optional - контейнер для значения
        System.out.println(result);
        List<Integer>  list100 = new ArrayList<>();
        Optional<Integer> op =  list.stream().reduce((accumulator, element)->accumulator*element);
        if (op.isPresent()) {
            System.out.println(op.get());
        }
        else{
            System.out.println("empty");
        }
        System.out.println("========================================");
        int result2 = list.stream().reduce(5,(accumulator,element)->accumulator*element);//1 - первичное значение аккумулятора
        System.out.println(result);

        List<String> list3 = new ArrayList<>();
        list3.add("privet");
        list3.add("kak dela?");
        list3.add("ok");
        list3.add("poka");
        String result3 = list3.stream().reduce((accumulator,element)->accumulator+element).get();
        System.out.println(result3);

    }
}
