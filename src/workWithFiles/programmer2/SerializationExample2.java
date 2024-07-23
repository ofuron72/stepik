package workWithFiles.programmer2;

import workWithFiles.programmer1.Employee;

import java.io.*;

public class SerializationExample2 {
    public static void main(String[] args) {
        Employee bestEmployee;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("employees2.bin"))){
            bestEmployee = (Employee)inputStream.readObject();
            System.out.println(bestEmployee);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
