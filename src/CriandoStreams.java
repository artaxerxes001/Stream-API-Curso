
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {
        Consumer<String> print = System.out::print;
        Consumer<Integer> println = System.out::print;


        // usando o metodo statico of() da propia Stram
        Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
        langs.forEach(print);

        // usando arrays, combinando com o Stream.of
        String[] maisLangs = {"Python ", "Lisp ", "Perl ", "Go\n"};
        Stream.of(maisLangs).forEach(print);

        //usando metodo stream dos Arrays
        Arrays.stream(maisLangs).forEach(print);

        // filtrando dados, para criar a stream. Criando um intervalo entre os indeces
        Arrays.stream(maisLangs, 0, 2).forEach(print);

        // usando collections
        List<String> outrasLangs = Arrays.asList("C ", "PHP ", "kotlin\n");
        // fazendo processamento em paralelo
        outrasLangs.parallelStream().forEach(print);

        // usando o generate do Stream, ele gera uma stram infinita
       // Stream.generate(() -> "a").forEach(print);

        // usando o iterotor
        // Stream.iterate(0, n -> n + 1).forEach(println);
    }
}
