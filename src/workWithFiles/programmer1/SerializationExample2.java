package workWithFiles.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample2 {
    public static void main(String[] args) {
        Car car = new Car("BMW", "blue");
        Employee employee = new Employee("Mariya","Ivanova", "IT",13.400,car);
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employees2.bin"))) {
            outputStream.writeObject(employee);
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } ;
    }
}
