package streams;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[] array = {4, 6, 21, 16, 8};
        Arrays.stream(array).forEach(s -> {
            s *= 2;
            System.out.println(s);
        });

        Arrays.stream(array).forEach(System.out::println);
        Arrays.stream(array).forEach(Utils::myMethod);

    }
}

class Utils {
    public static void myMethod(int a) {
        a = a + 5;
        System.out.println("element = " + a);
    }
}
