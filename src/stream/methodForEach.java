package stream;

import java.util.Arrays;

public class methodForEach {
    public static void main(String[] args) {
        int[] array = {5,9,3,8,1};
        Arrays.stream(array).forEach(element -> {
            element = element*2;
            System.out.println(element);
        });
        Arrays.stream(array).forEach(Utils::myMetod);
    }
}
