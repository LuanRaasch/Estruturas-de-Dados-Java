import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class ExerciciosStreamApi {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima todos os elementos dessa lista de string: ");
        numerosAleatorios.stream()
                .forEach(System.out::println);

        System.out.println("Pegue os 5 primeiros números e coloque dentro de um set:  ");
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println("Transforme esta lista de string em uma lista de números inteiros: ");
        List<Integer> numerosAleatoriosInterger = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println("Pegue os numeros pares e maiores que 2 e coloque em uma lista: ");
        /*List<Integer>  ListParesMaioresQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> i % 2 == 0 && i > 2)
                .collect(Collectors.toList());
        System.out.println(ListParesMaioresQue2);*/

        System.out.println("Mostre a média dos números: ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("Remova os valores ímpares: ");

        numerosAleatoriosInterger.removeIf(integer -> (integer % 2 != 0));
        System.out.println(numerosAleatoriosInterger);

        System.out.println("Ignore os 3 primeiros elementos da lista: ");
        numerosAleatoriosInterger.stream()
                .skip(3)
                .forEach(System.out::println);

        long countNumerosUnicos = numerosAleatoriosInterger.stream()
                        .distinct()
                                .count();

        System.out.println("Retirando os números repetidos da lista, quantos números ficam? " + countNumerosUnicos);

        System.out.println("Mostre o menor valor da lista: ");
        numerosAleatoriosInterger.stream()
                .mapToInt(Integer::intValue)
                .min()
                .ifPresent(System.out::println);

        System.out.println("Retorne o maior valor da lista: ");
        numerosAleatoriosInterger.stream()
                .mapToInt(Integer::intValue)
                .max()
                .ifPresent(System.out::println);

        int somaNumerosPares = numerosAleatoriosInterger.stream()
                        .filter( i -> (i % 2 == 0))
                                .mapToInt(Integer::intValue)
                                        .sum();
        System.out.println("Pegue apenas os numeros pares e some: " + somaNumerosPares);

        System.out.println("Mostre a lista na ordem numérica: ");
        List<Integer> numerosOrdemNatural = numerosAleatoriosInterger.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(numerosOrdemNatural);

        System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5:");
        Map<Boolean, List<Integer>> collectNumerosMultiplosDe3E5 = numerosAleatoriosInterger.stream()
                .collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));
        System.out.println(collectNumerosMultiplosDe3E5);

    }
    }

