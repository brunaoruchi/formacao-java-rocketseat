package org.example.conta;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria contaBancaria1 = new ContaBancaria();
        contaBancaria1.setNumero("1234");
        contaBancaria1.setTitular("José");
        contaBancaria1.setSaldo(100);
        contaBancaria1.depositar(50);

        ContaBancaria contaBancaria2 = new ContaBancaria();
        contaBancaria2.setNumero("1235");
        contaBancaria2.setTitular("Pedro");
        contaBancaria2.setSaldo(200);
        contaBancaria2.sacar(10);
    }
}
