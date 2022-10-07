package streams;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("how are you");
        list.add("I'm fine");
        list.add("bue");

//        for (int i = 0; i < list.size(); i++) {
//            list.set(i, String.valueOf(list.get(i).length()));
//        }
//        System.out.println(list);

//        List<Integer> list2 = list.stream().map(s -> s.length()).collect(Collectors.toList());
//
//        System.out.println(list2);
//
//        int[] array = {4, 6, 21, 16, 8};
//        array = Arrays.stream(array).map(s -> {
//            if (s % 3 == 0) {
//                s = s / 3;
//            }
//            return s;
//        }).toArray();
//
//        System.out.println(Arrays.toString(array));

        Set<String> set = new TreeSet<>();
        set.add("Hello");
        set.add("how are you");
        set.add("I'm fine");
        set.add("bue");

        System.out.println(set.stream().map(e -> e.length()).collect(Collectors.toList()));
    }
}
