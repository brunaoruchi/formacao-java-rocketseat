package org.example.construtor;

public class Construtor {

    //Obrigatorio ter o nome da classe e não possui retono
    private int numero;

    public Construtor(int numero){
        this.numero = numero;
    }

    public Construtor(int numero, String texto){
        this.numero = numero;
        System.out.println("Construtor com dois parametros criados");
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
