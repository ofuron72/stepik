package Lambda;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan",'m',22,3,8.3);
        Student st2 = new Student("Nikolay",'m',28,2,6.4);
        Student st3 = new Student("Elena",'w',19,1,8.9);
        Student st4 = new Student("Petr",'m',35,4,7);
        Student st5 = new Student("Mariya",'w',23,3,9.1);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
//        StudentInfo stdInfo = new StudentInfo();
//        stdInfo.printStudentsOverGrade(students, 8);
//        System.out.println("==========================================");
//        stdInfo.printStudentsUnderAge(students,30);
//        System.out.println("==========================================");
//        stdInfo.printStudentsMixCondition(students, 20, 9.5,'w');
        StudentInfo2 studentInfo2 = new StudentInfo2();
       // studentInfo2.testStudents(students, new CheckOverGrade());
//        studentInfo2.testStudents(students, new StudentChecks() {  //используем анонимный класс
//            @Override
//            public boolean check(Student student) {
//
//                return student.age<30;
//            }
//        });
        studentInfo2.testStudents(students, (Student s)->{return s.age>30;} );

    }
}
