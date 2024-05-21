package org.example.primeirasAulas;

import java.util.HashSet;
import java.util.Set;

public class ColecaoHashSet {
    public static void main(String[] args) {
        //HashSet: Não é possível manipular pelo index, pois a ordem não importa
        Set<Integer> numeros = new HashSet<>();
        numeros.add(10);
        numeros.add(11);
        numeros.add(12);
        numeros.add(13);

        System.out.println("Tamanho da HashSet: " + numeros.size());

        numeros.remove(12);
        System.out.println("Números após a remoção do 12: ");
        for (Integer elemento : numeros) {
            System.out.println(elemento);
        }

        System.out.println(numeros.contains(10));
    }
}
