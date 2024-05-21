package org.example.primeirasAulas;

import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDados {
    public static void main(String[] args) {
        //Lista
        List<String> nomes = new ArrayList<>();
        nomes.add("Bruna");
        nomes.add("Cami");
        nomes.add("San");

        System.out.println(nomes.get(0));

        for (String nome : nomes) {
            System.out.println("For: O nome é: " + nome);
        }

        nomes.forEach(nome -> System.out.println("ForEach: O nome que apareceu foi: " + nome));

        System.out.println("\nPor referência: ");
        nomes.forEach(System.out::println);
    }
}
