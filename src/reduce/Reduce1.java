package reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        BinaryOperator<Integer> soma = (ac, n) -> ac + n;

//        usamos get no final para recuperar o resultado gerado, e fazer com ele a operação com o elemento a seguir. pois o resuldo é um opcional
        var total1 = nums.stream().reduce(soma).get();
        System.out.println(total1);

//       quando passamos um valor inicail para um reduce de uma stream paralela ela vai passar o mesmo valor iniciail para todos os elementos, fazendo com que no final o acumulador some todos os elemento contedo cada um deles o valor iniciail. como de forma exponenciail
        var total2 = nums.parallelStream().reduce(100, soma);
        System.out.println(total2);

        var total3 = nums.stream().reduce(100, soma);
        System.out.println(total3);

//
        nums.stream()
                .filter(n -> n > 5)
                .reduce(soma)
                .ifPresent(System.out::println);// ifPresent é um metodo que verifica se existe um valor da função anterior se existir ele executa uma ação
    }
}
