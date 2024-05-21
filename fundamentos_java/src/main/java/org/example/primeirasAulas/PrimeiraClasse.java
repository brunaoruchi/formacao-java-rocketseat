package org.example.primeirasAulas;

/*
Primeira Classe = Nome da classe
public = Tipo de acesso da classe
class = Tipo da classe
 */
public class PrimeiraClasse {
    //Todo conteúdo deverá ser inserido aqui dentro
    public static void main(String[] args) {
        /*
         Valores (int, double, float, long)
         Texto (String)
         Booleanos (boolean)
         */
        int dadoDoTipoInt = 10;
        double dadoDoTipoDouble = 3.14;
        float dadoDoTipoFloat = 3.14f;
        long dadoDoTipoLong = 80000001L;
        String dadoDoTipoString = "Bruna";
        boolean dadoDoTipoBoolean = true;

        // if - else
        System.out.println("IF-ELSE");
        if(dadoDoTipoInt == 11){
            // sysout
            System.out.println("Entrou no if\n");
        } else if (dadoDoTipoInt == 12) {
            System.out.println("Entrou no if do 12\n");
        } else {
            System.out.println("Entrou no else\n");
        }

        //While (Enquanto algo for verdadeiro, faça alguma coisa)
        System.out.println("WHILE");
        int valorInicial = 0;

        while(valorInicial < 3){
            System.out.println("O valor inicial é menor que 3");
            System.out.println("O valor inicial agora é: " + valorInicial);
            valorInicial++;
        }
        System.out.println("Saiu do While\n");

        //for (Iteração)
        System.out.println("FOR");
        for (int i = 0; i < 4; i++){
            System.out.println("O valor do iterator é: " + i);
        }
        System.out.println("Finalizando o For");
    }

}
//Fora do escopo da classe