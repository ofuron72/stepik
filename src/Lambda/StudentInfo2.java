package Lambda;

import java.util.ArrayList;

public class StudentInfo2 {
    void testStudents(ArrayList<Student> students, StudentChecks studentChecks){
        for(Student student: students){
            if(studentChecks.check(student)){
                System.out.println(student);
            }
        }
    }
}
