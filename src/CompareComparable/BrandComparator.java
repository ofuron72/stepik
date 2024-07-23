package CompareComparable;

import java.util.Comparator;

public class BrandComparator implements Comparator<Cars> {
    @Override
    public int compare(Cars car1, Cars car2) {
        return car1.brand.compareTo(car2.brand);
    }
}
