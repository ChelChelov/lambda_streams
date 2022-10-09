package streams;

import lambda.Student;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test7 {
    public static void main(String[] args) {
        Student st1 = new Student("Oleg", 'm', 28, 5, 8.6);
        Student st2 = new Student("Sasha", 'f', 22, 4, 9.0);
        Student st3 = new Student("Ira", 'f', 21, 2, 6.7);
        Student st4 = new Student("Vlad", 'm', 26, 1, 8.2);
        Student st5 = new Student("Andrei", 'm', 20, 3, 9.1);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Applied mathematics");

        f1.addStudentToFaculty(st1);
        f1.addStudentToFaculty(st2);
        f1.addStudentToFaculty(st3);
        f2.addStudentToFaculty(st4);
        f2.addStudentToFaculty(st5);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);

//        facultyList.stream().flatMap(faculty -> faculty.getStudentsOnFaculty().stream())
//                .forEach(student -> System.out.println(student.getName()));

        facultyList.stream().flatMap(faculty -> faculty.getStudentsOnFaculty().stream())
                .sorted(Comparator.comparing(Student::getName))
                .forEach(student -> System.out.println(student.getName()));

    }
}

class Faculty {
    private String name;
    private List<Student> studentsOnFaculty;

    public Faculty(String name) {
        this.name = name;
        studentsOnFaculty = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }

    public void setStudentsOnFaculty(List<Student> studentsOnFaculty) {
        this.studentsOnFaculty = studentsOnFaculty;
    }

    public void addStudentToFaculty(Student student){
        studentsOnFaculty.add(student);
    }
}