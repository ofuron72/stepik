package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class minMax {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan",'m', 22,3,8.3);
        Student st2 = new Student("Nikolay",'m', 28,2,6.4);
        Student st3 = new Student("Elena",'f', 19,1,8.9);
        Student st4 = new Student("Petr",'m', 35,4,7);
        Student st5 = new Student("Mariya",'f', 23,3,7.4);
        List<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);

        Student min = studentList.stream().min((x,y)->x.getAge()-y.getAge()).get();
        Student max = studentList.stream().max((x,y)->x.getAge()-y.getAge()).get();
        System.out.println(min);
        System.out.println(max);
        System.out.println("====================================");

        studentList.stream().filter(element->element.getAge()>20).limit(2).forEach(System.out::println);
        System.out.println("=====================================");
        studentList.stream().filter(element->element.getAge()>20).skip(2).forEach(System.out::println);
        System.out.println("=====================");
        List<Integer> courses = studentList.stream()
                .mapToInt(el->el.getCourse())
                .boxed()
                .collect(Collectors.toList());
        System.out.println(courses);
        int sum = studentList.stream().mapToInt(el->el.getCourse()).sum();
        System.out.println(sum);
        double average = studentList.stream().mapToInt(el->el.getCourse()).average().getAsDouble();
        System.out.println(average);
        int minimum = studentList.stream().mapToInt(el->el.getCourse()).min().getAsInt();
        System.out.println(minimum);

    }
}
