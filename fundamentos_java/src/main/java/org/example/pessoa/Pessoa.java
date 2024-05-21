package org.example.pessoa;

public class Pessoa {
    // nome, idade, cpf
    // tipo e nomeDaVariavel

    private String nome;
    private int idade;
    private String cpf;

    void imprimirDadosDaPessoa(){
        System.out.println("\nnNome: " + nome + "\nIdade: " + idade + "\nCPF: " + cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
