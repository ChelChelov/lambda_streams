package streams;

import java.util.Arrays;

public class Test5 {
    public static void main(String[] args) {
        int[] array = {3, 8, 17, 5, 9, 18, 32, 22, 4};
//        array = Arrays.stream(array).sorted().toArray();
//        System.out.println(Arrays.toString(array));

        int result = Arrays.stream(array).filter(e -> e % 2 == 1).map(operand -> {
            if (operand % 3 == 0) {
                operand = operand / 3;
            }
            return operand;
        }).reduce((a, e) -> a + e).getAsInt();
        System.out.println(result);

        // 1 17 5 3
    }
}
