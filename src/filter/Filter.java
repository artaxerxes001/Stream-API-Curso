package filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("royalty", 7.8);
        Aluno a2 = new Aluno("sit", 7.9);
        Aluno a3 = new Aluno("top", 5.8);
        Aluno a4 = new Aluno("bake", 9.8);
        Aluno a5 = new Aluno("uncle", 6.8);
        Aluno a6 = new Aluno("tin", 8.8);
        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Function<Aluno, String> suadacao = a -> "Parabens " + a.nome + "! voce foi aprovado";
        alunos.stream()
                .filter(aprovado)
                .map(suadacao)
                .forEach(System.out::println);
    }
}
