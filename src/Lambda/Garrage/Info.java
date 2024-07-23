package Lambda.Garrage;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Info {
    void testCar(ArrayList<Car> cars, Predicate<Car> predicate){
        for(Car car : cars){
            if (predicate.test(car)){
                System.out.println(car);
            }
        }
    }
}
