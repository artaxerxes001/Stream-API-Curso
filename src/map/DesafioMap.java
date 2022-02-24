package map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
    public static void main(String[] args) {

        Consumer<String> print = System.out::println;
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        UnaryOperator<String> invertString = m -> new StringBuilder(m).reverse().toString();
        Function<String, Integer> convert = m -> Integer.parseInt(m,2);
        nums.stream().map(Integer::toBinaryString)
                .map(invertString)
                .map(convert)
                .forEach(System.out::println);

    }
}
