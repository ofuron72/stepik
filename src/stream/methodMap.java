package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class methodMap {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela?");
        list.add("OK");
        list.add("poka");
//        for (int i =0 ;i< list.size();i++){
//            list.set(i, String.valueOf(list.get(i).length()));
//        }
//        System.out.println(list);
        List<Integer> list2 =  list.stream().map(element->element.length()).collect(Collectors.toList());
        System.out.println(list2);
        int[] arr = {3,5,7,9}; 
        int[]  arr2 = Arrays.stream(arr).map(element->element%3).toArray();
        System.out.println(Arrays.toString(arr2));



    }
}
