package stream;

import java.util.stream.Stream;

public class Distinct {
    public static void main(String[] args) {
        Stream<Integer> stream= Stream.of(1,2,3,4,5,1,2,3);
        //stream.distinct().forEach(System.out::println);
    //    System.out.println(stream.count());//stream после обработки нельзя переиспользовать
        //  System.out.println(stream.distinct().count());
    }
}
