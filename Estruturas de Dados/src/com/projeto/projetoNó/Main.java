package com.projeto.projetoNó;

public class Main {
    public static void main(String[] args) {

        No<String> no1 = new No<>("Conteudo no1");

        No<String> no2 = new No<>("Conteudo no2");
        no1.setProximoNo(no2);

        No<String> no3 = new No<>("Conteudo no3");
        no2.setProximoNo(no3);

        No<String> no4 = new No<>("Conteudo no4");
        no3.setProximoNo(no4);

        No<Integer> no5 = new No<>(22);
        No<Integer> no6 = new No<>(23);
        no5.setProximoNo(no6);
        System.out.println(no5);
        System.out.println(no5.getProximoNo());

        //no1->no2->no3->no4->null

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no2.getProximoNo());
        System.out.println(no3.getProximoNo());
        System.out.println(no4.getProximoNo());

        System.out.println("------------------------");

       /* No noL = new No("L");
        No noU = new No("U");
        noL.setProximoNo(noU);
        No noA = new No("A");
        noU.setProximoNo(noA);
        No noN = new No("N");
        noA.setProximoNo(noN);

        System.out.println(noL);
        System.out.println(noL.getProximoNo());
        System.out.println(noU.getProximoNo());
        System.out.println(noA.getProximoNo());*/
    }
}
