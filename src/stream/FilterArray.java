package stream;

import java.util.ArrayList;
import java.util.List;

public class FilterArray {
    public static void main(String[] args) {
        int[] array = {3,8,1,5,9,12,4,21,81,7,18};
        List<Integer> list1 = new ArrayList<>();
        for (int i: array){
            if (i%2==1) {
                list1.add(i);
            }
        }
        List<Integer> list2 = new ArrayList<>();
        for (Integer i: list1){
            if (i%3==0){
                list2.add(i);
            }
        }
        int sum = 0;
        for (Integer i:list2){
            sum = sum+i;
        }
        System.out.println(sum);

    }
}
