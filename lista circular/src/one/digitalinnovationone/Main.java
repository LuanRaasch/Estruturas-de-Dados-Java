package one.digitalinnovationone;

public class Main {
    public static void main(String[] args) {

        ListaCircular<String> minhaListaCircular = new ListaCircular<>();
        ListaCircular<String> minhaListaCircular2 = new ListaCircular<>();
        System.out.println(minhaListaCircular2);

        minhaListaCircular.add("c0");
        //System.out.println(minhaListaCircular);

        minhaListaCircular.add("c1");
        minhaListaCircular.add("c2");
        minhaListaCircular.add("c3");
        minhaListaCircular.add("c4");
        //System.out.println(minhaListaCircular);

        System.out.println(minhaListaCircular.get(0));
        System.out.println(minhaListaCircular.get(1));
        System.out.println(minhaListaCircular.get(2));
        System.out.println(minhaListaCircular.get(3));
        System.out.println(minhaListaCircular.get(4));
        System.out.println(minhaListaCircular.get(5));
        System.out.println(minhaListaCircular.get(6));

        //for (int i = 0; i < 20;i++){
            //System.out.println(minhaListaCircular.get(i));
        //}
    }
}
