package Lambda;

import java.util.ArrayList;

public class StudentInfo {

    void printStudentsOverGrade(ArrayList<Student> students, double grade){
        for(Student student: students){
            if (student.grade>grade){
                System.out.println(student);
            }
        }

    }
    void printStudentsUnderAge(ArrayList<Student> students, int age){
        for(Student student: students){
            if (student.age<age){
                System.out.println(student);
            }
        }


    }
    void printStudentsMixCondition(ArrayList<Student> students, int age,double grade, char sex){
        for(Student student: students){
            if ((student.grade<grade)&&(student.age>age)&&(student.sex==sex)){
                System.out.println(student);
            }
        }

    }
}
