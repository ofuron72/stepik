package stream;

import java.util.*;

public class Chaining {
    public static void main(String[] args) {
        int[] array = {3,8,1,5,9,12,4,21,81,7,18};
       int  sum = Arrays.stream(array).filter(element->(element%2==1)).filter(element->(element%3==0)).reduce((accumulator, element)->accumulator+element).getAsInt();
        System.out.println(sum);
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
        System.out.println(studentList);

        studentList.stream().map(element-> {
            element.setName(element.getName().toUpperCase());
            return element;
        })
                .filter(element->element.getSex()=='f')
                .sorted((x,y)-> x.getAge()-y.getAge())
                .forEach(element-> System.out.println(element));

    }
}
