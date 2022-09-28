package lambda;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;
}
