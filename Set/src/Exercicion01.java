import java.util. *;

public class Exercicion01 {
    public static void main(String[] args) {
        Set<String> coresArcoIris = new HashSet<>();
        coresArcoIris.add("violeta");
        coresArcoIris.add("anil");
        coresArcoIris.add("azul");
        coresArcoIris.add("verde");
        coresArcoIris.add("amarelo");
        coresArcoIris.add("laranja");
        coresArcoIris.add("vermelho");
        System.out.println(coresArcoIris);

        System.out.println("Exiba as cores uma em baixo da outra: ");
        for ( String cor : coresArcoIris ) {
            System.out.println(cor);
        }

        System.out.println("Quantidade de cores que o arco-iris tem: " + coresArcoIris.size());

        System.out.println("Exiba as cores em ordem alfabetica: ");
        Set<String> coresArcoIris1 = new TreeSet<>(){{
            add("violeta");
            add("anil");
            add("azul");
            add("verde");
            add("amarelo");
            add("laranja");
            add("vermelho");
        }};
        System.out.println(coresArcoIris1);

        System.out.println("Exiba as cores na ordem inversa ao que foi informado: ");
        Set<String> coresArcoIris2 = new LinkedHashSet<>(){{
            add("violeta");
            add("anil");
            add("azul");
            add("verde");
            add("amarelo");
            add("laranja");
            add("vermelho");
        }};
        List<String> coresArcoIris3 = new ArrayList<>(coresArcoIris2);
        System.out.println(coresArcoIris3);
        Collections.reverse(coresArcoIris3);
        System.out.println(coresArcoIris3);

        System.out.println("Exiba todas as cores que começam com a letra 'v' : ");
        for ( String cor : coresArcoIris3 ) {
            if (cor.startsWith("v")) System.out.println(cor);
        }

        System.out.println("Remova todas as cores que não começam com a letra 'v': ");
        Iterator<String> iterator = coresArcoIris3.iterator();
        while (iterator.hasNext()) {
            if(!iterator.next().startsWith("v")) iterator.remove();
        }

        System.out.println(coresArcoIris3);

        System.out.println("Limpe o conjunto: ");
        coresArcoIris.clear();

        System.out.println("Confira se o conjunto está vazio: " + coresArcoIris.isEmpty());
    }
}
