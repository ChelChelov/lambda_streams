package lambda.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("Hi");
        arrayList.add("Bue");
        arrayList.add("Pocket");
        arrayList.add("Learning Java");
        arrayList.add("Understandable");

//        arrayList.removeIf(s -> s.length() > 5);
        System.out.println(arrayList);

        Predicate<String> pr = s -> s.length() > 5;
        arrayList.removeIf(pr);
    }
}
