package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentInfo {

    void testStudents(ArrayList<Student> al, StudentChecks sc) {
        for (Student s :
                al) {
            if (sc.check(s)) {
                System.out.println(s);
            }
        }
    }

//    void printStudentOverGrade(ArrayList<Student> al, double grade) {
//        for (Student s :
//                al) {
//            if (s.getAvgGrade() > grade) {
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentUnderAge(ArrayList<Student> al, int age) {
//        for (Student s :
//                al) {
//            if (s.getAge() < age) {
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentMixConditions(ArrayList<Student> al, int age, double grade, char sex) {
//        for (Student s :
//                al) {
//            if (s.getAge() > age && s.getAvgGrade() < grade && s.getSex() == sex) {
//                System.out.println(s);
//            }
//        }
//    }
}

class Test {
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

        StudentInfo studentInfo = new StudentInfo();

//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });
//        System.out.println(students);

        Collections.sort(students, (s1,s2) -> s1.getAge() - s2.getAge());
        System.out.println(students);



//        studentInfo.testStudents(students, new StudentChecks() { //this code equals to
//            @Override
//            public boolean check(Student s) {
//                return s.getAge() < 22;
//            }
//        });

//        studentInfo.testStudents(students, (Student s) -> {return s.getAge() < 22;});
//        System.out.println();
//
//        studentInfo.testStudents(students, s -> s.getAge() < 22);
//        System.out.println();
//
//        StudentChecks sc = s -> s.getAge() < 22;
//
//
//        studentInfo.testStudents(students, (Student s) -> {
//            return s.getAvgGrade() < 8;
//        });
//        System.out.println();
//
//        studentInfo.testStudents(students, (Student s) ->
//        {return s.getAge() > 21 && s.getAvgGrade() > 8 && s.getSex() == 'm';});

//        studentInfo.printStudentOverGrade(students, 8);
//        System.out.println();
//        studentInfo.printStudentUnderAge(students, 21);
//        System.out.println();
//        studentInfo.printStudentMixConditions(students, 20, 9, 'm');
    }
}

interface StudentChecks {
    boolean check(Student s);
}

//class CheckOverGrade implements StudentChecks{
//
//    @Override
//    public boolean check(Student s) {
//        return s.getAvgGrade() > 8;
//    }
//}