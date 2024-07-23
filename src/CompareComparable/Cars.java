package CompareComparable;

public class Cars implements Comparable<Cars>{
    String brand;
    int horsePower;
    String color;
    int maxSpeed;

    public Cars(String brand, int horePower, String color, int maxSpeed) {
        this.brand = brand;
        this.horsePower = horePower;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }


    @Override
    public String toString() {
        return "Cars{" +
                "brand='" + brand + '\'' +
                ", horsePower=" + horsePower +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    @Override
    public int compareTo(Cars anotherCar) {
      return this.horsePower- anotherCar.horsePower;




    }
}
