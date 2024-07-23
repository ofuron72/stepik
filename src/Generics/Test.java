package Generics;

public class Test {
    public static void main(String[] args) {
        Scoolar scoolar1 = new Scoolar("Ivan",13);
        Scoolar scoolar2 = new Scoolar("Mariya",15);

        Student student1 = new Student("Nikolay",20);
        Student student2 = new Student("Kseniya",18);

        Employee employee1 = new Employee("Zaur",32);
        Employee employee2 = new Employee("Mikhail", 47);

        Team<Scoolar> schoolarTeam1 = new Team<>("Zmei- Gorynych");
        schoolarTeam1.addNewParticipant(scoolar1);
        schoolarTeam1.addNewParticipant(scoolar2);

        Team<Student> studentTeam1 = new Team<>("Tornado");
        studentTeam1.addNewParticipant(student1);
        studentTeam1.addNewParticipant(student2);

        Team<Employee> employeeTeam1 = new Team<>("Solntsepyok");
        employeeTeam1.addNewParticipant(employee1);
        employeeTeam1.addNewParticipant(employee2);

        Team<Scoolar> schoolarTeam2 = new Team<>("Iskander");
        Scoolar scoolar3 = new Scoolar("Sergey",12);
        Scoolar scoolar4 = new Scoolar("Olga",14);
        schoolarTeam2.addNewParticipant(scoolar3);
        schoolarTeam2.addNewParticipant(scoolar4);

        Team<Student> studentTeam2 = new Team<>("Kalibr");
        Student student3 = new Student("Philipp",21);
        Student student4 = new Student("Roman",17);
        studentTeam1.addNewParticipant(student1);
        studentTeam1.addNewParticipant(student2);

        Team<Employee> employeeTeam2 = new Team<>("Avangard");
        Employee employee3 = new Employee("Alexey",30);
        Employee employee4 = new Employee("Boris",35);
        employeeTeam2.addNewParticipant(employee3);
        employeeTeam2.addNewParticipant(employee4);

        schoolarTeam1.playWith(schoolarTeam2);
        studentTeam1.playWith(studentTeam2);
        employeeTeam1.playWith(employeeTeam2);
    }


}
