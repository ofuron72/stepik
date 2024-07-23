package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class Collect {
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

//        Map<Integer,List<Student>> map = studentList.stream().map(element->{
//            element.setName(element.getName().toUpperCase());
//            return element;
//        })
//                .collect(Collectors.groupingBy(elem->elem.getCourse()));//вернет коллекцию Map с ключами по номеру курса
//        for (Map.Entry<Integer,List<Student>> entry: map.entrySet()){
//            System.out.println(entry.getKey()+" : "+entry.getValue().toString());
//        }

        Map<Boolean,List<Student>> map =
                studentList.stream()
                .collect(Collectors.partitioningBy(elem->elem.getGrade()>7));//вернет коллекцию Map с ключами по номеру курса
        for (Map.Entry<Boolean,List<Student>> entry: map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue().toString());
        }

    }
}
