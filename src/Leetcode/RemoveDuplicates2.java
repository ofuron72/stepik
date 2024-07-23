package Leetcode;

import java.util.*;

public class RemoveDuplicates2 {
    public int removeDuplicates(int[] nums) {
        Map<Integer,Integer> map = new TreeMap<>();
        for(int i: nums){
            map.put(i,0);
        }
        for (int i = 0; i < nums.length;i++){
            if ((map.containsKey(nums[i]))&&(map.get(nums[i])<2)){
                map.put(nums[i], map.get(nums[i])+1);
            }
        }
        System.out.println(map);
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            for (int i =0; i < entry.getValue();i++){
                list.add(entry.getKey());
            }
        }
        System.out.println(list);
        for (int i =0;i<list.size();i++){
            nums[i] =list.get(i);
        }
        System.out.println(Arrays.toString(nums));
        return list.size();







    }

    public static void main(String[] args) {
        RemoveDuplicates2 removeDuplicates2 = new RemoveDuplicates2();
        removeDuplicates2.removeDuplicates(new int[]{1,1,2,3,4,5,1,5,5});


    }
}
