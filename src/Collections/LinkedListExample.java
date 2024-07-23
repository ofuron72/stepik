package Collections;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", 2);
        Student student2 = new Student("Sergey", 2);
        Student student3 = new Student("Alexey", 3);
        Student student4 = new Student("Roman", 4);
        Student student5 = new Student("Artem", 2);
        Student student6 = new Student("Nikita", 1);
        LinkedList<Student> studentLinkedList = new LinkedList<>();
        studentLinkedList.add(student1);
        studentLinkedList.add(student2);
        studentLinkedList.add(student3);
        studentLinkedList.add(student4);
        studentLinkedList.add(student5);
        studentLinkedList.add(student6);
        System.out.println(studentLinkedList);
    }
}

