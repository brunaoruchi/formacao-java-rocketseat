package org.example.primeirasAulas;

import java.util.HashMap;
import java.util.Map;

public class Colecoes {
    public static void main(String[] args) {
        //Map é uma coleção que é possivel inserir chave e valor
        Map<String, Integer> notas = new HashMap<>();
        notas.put("Bruna", 10);
        notas.put("Cami", 9);
        notas.put("San", 8);

        var nota = notas.get("San");
        System.out.println(nota);

        for (Map.Entry<String,Integer> entry : notas.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("A chave é " + key + " e o valor é " + value);
        }
    }
}
