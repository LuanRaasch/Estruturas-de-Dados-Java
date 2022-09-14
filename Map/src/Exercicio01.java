import java.util.*;

public class Exercicio01 {
    public static void main(String[] args) {
/*
Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265
 */
        Map<String,Integer> popEstadosNE = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(popEstadosNE);

        System.out.println("Subtitua a pop do estado RN por 3.534.165");
        popEstadosNE.put("RN",3534165);
        System.out.println(popEstadosNE);

        System.out.println("Confira se o estado PB está no dicionario, caso false adicione o estado: " + popEstadosNE.containsKey("PB"));
        popEstadosNE.put("PB",4039277);
        System.out.println(popEstadosNE);

        System.out.println("Exiba a população PE: " + popEstadosNE.get("PE"));

        System.out.println("Exiba todos os estados e pop na ordem informada: ");
        Map<String,Integer> popEstadosNE1 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(popEstadosNE1);

        System.out.println("Exiba todos os estados e sua pop em ordem alfabética: ");
        Map<String, Integer> popEstadosNE2 = new TreeMap<>(popEstadosNE1);
        System.out.println(popEstadosNE2);

        System.out.println("Exiba o estado com menor pop e sua quantidade: ");
        int menorPop = Collections.min(popEstadosNE2.values());
        System.out.println(menorPop);
        Set<Map.Entry<String, Integer>> entries = popEstadosNE2.entrySet();

        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue().equals(menorPop)) {
                String menorPopEstado = entry.getKey();
                System.out.println("O estado com a menor pop é: " + menorPopEstado + " - " + menorPop );
            }
        }

        System.out.println("Exiba o estado com a maior população: ");
         int maiorPop = Collections.max(popEstadosNE2.values());
        System.out.println(maiorPop);

        for (Map.Entry<String, Integer> entry : entries) {
            if(entry.getValue().equals(maiorPop)) {
                 String maiorPopES = entry.getKey();
            System.out.println("O estado com a maior pop é: " + maiorPopES + " - " + maiorPop);
            }
        }

        System.out.println("Exiba a soma da população desses estados: ");
        int soma = 0;
        Iterator<Integer> iterator = popEstadosNE2.values().iterator();
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println(soma);

        System.out.println("Média dos estados: " + (soma/popEstadosNE2.size()));

        System.out.println("Remova os estados com a população menor que 4000000 ");
        Iterator<Integer> iterator1 = popEstadosNE2.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next().equals(4000000)) iterator1.remove();
        }
            System.out.println(popEstadosNE2);

        System.out.println("Remova os itens do dicionario: ");
        popEstadosNE.clear();

        System.out.println("Confira se está vazio: " +  popEstadosNE.isEmpty());






    }
}
