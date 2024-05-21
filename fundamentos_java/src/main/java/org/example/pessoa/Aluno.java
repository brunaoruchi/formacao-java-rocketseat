package org.example.pessoa;

public class Aluno extends Pessoa{
    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    void imprimirDadosDaPessoa(){
        super.imprimirDadosDaPessoa();
        System.out.println("Você é aluno");
    }
}
