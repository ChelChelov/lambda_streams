package streams;

import lambda.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {

        Student st1 = new Student("Oleg", 'm', 28, 5, 8.6);
        Student st2 = new Student("Sasha", 'f', 22, 4, 9.0);
        Student st3 = new Student("Ira", 'f', 21, 2, 6.7);
        Student st4 = new Student("Vlad", 'm', 26, 1, 8.2);
        Student st5 = new Student("Andrei", 'm', 20, 3, 9.1);

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

//        students = students.stream()
//                .filter(student -> student.getAge() > 21 && student.getAvgGrade() > 8.2)
//                .collect(Collectors.toList());
//
//        System.out.println(students);

//        Stream<Student> myStream = Stream.of(st1, st2, st3, st4, st5);

//        students = students.stream().sorted((x,y) -> x.getAge() - y.getAge()).collect(Collectors.toList());
//        System.out.println(students);

        students.stream().map(e -> {
                    e.setName(e.getName().toUpperCase());
                    return e;
                }).filter(student -> student.getSex() == 'm')
                .sorted(Comparator.comparing(Student::getAge))
                .forEach(System.out::println);

        students.stream().map(e -> {
                    e.setName(e.getName().toUpperCase());
                    return e;
                }).filter(student -> student.getSex() == 'm')
                .sorted((x, y) -> x.getAge() - y.getAge())
                .forEach(System.out::println);
    }
}
