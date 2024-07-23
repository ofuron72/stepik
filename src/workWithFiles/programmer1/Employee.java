package workWithFiles.programmer1;

import java.io.Serializable;

public class Employee implements Serializable {
    static final long serialVersionUID = 2;
    String name;
    String derpartment;
    String surname;
 //   int age;
    transient double salary;
    Car car;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                "surname=" + surname + '\'' +
                ", derpartment='" + derpartment + '\'' +
              //  ", age=" + age +
                ", salary=" + salary +
                ", car=" + car +
                '}';
    }

    public Employee(String name,String surname,  String derpartment, double salary,Car car) {
        this.name = name;
        this.surname = surname;
        this.derpartment = derpartment;
      //  this.age = age;
        this.salary = salary;
        this.car = car;
    }
}
