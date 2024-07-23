package CompareComparable;

import java.util.ArrayList;
import java.util.Collections;

public class Test {



    public static void main(String[] args) {
        Cars car1 = new Cars("BMW",320,"Blue",270);
        Cars car2 = new Cars("Audi",570,"Grey",318);
        Cars car3 = new Cars("Mercedes",299,"Black",240);
        ArrayList<Cars> cars = new ArrayList<>();
        System.out.println(cars);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        System.out.println(cars);
        Collections.sort(cars);//будет использован интерфейс Comparable
        Collections.sort(cars, new BrandComparator());////будет использован интерфейс Comparator /для неестественного порядка
        System.out.println(cars);
    }
}
