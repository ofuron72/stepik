package Lambda;

public class CheckOverGrade implements StudentChecks {
    @Override
    public boolean check(Student student) {
        return student.grade>8;
    }
}
