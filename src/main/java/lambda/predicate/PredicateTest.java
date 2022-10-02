package lambda.predicate;

import lambda.Student;
import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {

        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Vasia", 'm', 21, 2, 8.6);
        Student st3 = new Student("Kolia", 'm', 23, 4, 7.5);
        Student st4 = new Student("Ira", 'f', 20, 1, 6.9);
        Student st5 = new Student("Vlad", 'm', 22, 3, 9);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

//        testStudents(students, s -> s.getAge() > 21);

        Predicate<Student> p1 = student -> student.getAge() > 21;
        Predicate<Student> p2 = student -> student.getCourse() == 3;

        testStudents(students, p1.negate().and(p2));
    }

    static void testStudents(ArrayList<Student> al, Predicate<Student> predicate) {
        for (Student s :
                al) {
            if (predicate.test(s)) {
                System.out.println(s);
            }
        }
    }
}
