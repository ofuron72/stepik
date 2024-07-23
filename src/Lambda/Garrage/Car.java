package Lambda.Garrage;

public class Car {
    String brand;
    int weight;
    String color;
    int horsePower;

    public Car(String brand, int weight, String color, int horsePower) {
        this.brand = brand;
        this.weight = weight;
        this.color = color;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }
}
