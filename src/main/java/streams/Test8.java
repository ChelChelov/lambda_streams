package streams;

import lambda.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test8 {
    public static void main(String[] args) {
        Student st1 = new Student("Oleg", 'm', 28, 1, 8.6);
        Student st2 = new Student("Sasha", 'f', 22, 4, 9.0);
        Student st3 = new Student("Ira", 'f', 21, 2, 6.7);
        Student st4 = new Student("Vlad", 'm', 26, 2, 8.2);
        Student st5 = new Student("Andrei", 'm', 20, 3, 9.1);

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

//        Map<Integer, List<Student>> map = students.stream().map(e -> {
//            e.setName(e.getName().toUpperCase());
//            return e;
//        }).collect(Collectors.groupingBy(e -> e.getCourse()));
//
//        for (Map.Entry<Integer, List<Student>> entry: map.entrySet()){
//            System.out.println(entry.getKey() + ":" + entry.getValue().toString());
//        }

        Map<Boolean, List<Student>> map =
                students.stream().
                        collect(Collectors.partitioningBy(e -> e.getAvgGrade() > 8.5));

        for (Map.Entry<Boolean, List<Student>> entry: map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue().toString());
        }

    }
}
