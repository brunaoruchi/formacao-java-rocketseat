package org.example.excecoes;

public class Excecoes {
    //Checked exceptions = Compilador do Java exige que trate.

    //Unchecked exceptions = Compilador não reconhece o erro.

    public static void main(String[] args) {
        try {
            validarNumero();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void validarNumero() throws Exception {
        int numero = 10;
        if (numero < 100) {
            throw new Exception("O número é menor que 100");
        }
    }
}
