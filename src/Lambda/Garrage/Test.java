package Lambda.Garrage;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Car car1 = new Car("Audi", 1400,"gray", 320);
        Car car2 = new Car("BMW", 1600,"blue", 290);
        Car car3 = new Car("Mercedes", 1700,"white", 249);
        Car car4 = new Car("Volkswagen", 1200,"black", 125);
        Car car5 = new Car("Mazda", 1300,"red", 150);
        Car car6 = new Car("Chevrolet", 2400,"green", 252);
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);


        Info info = new Info();
        info.testCar(cars, car -> (car.weight>1500)&&(car.horsePower>250));
    }
}
