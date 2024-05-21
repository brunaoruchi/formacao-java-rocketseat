package org.example.pessoa;

public class TesteDePessoa {
    public static void main(String[] args) {
        //Instancia se refere a um objeto especifico criado de uma classe
        Professor professor = new Professor();
        professor.setCpf("12345678511");
        professor.setNome("Bruna");
        professor.setIdade(25);
        professor.setSalario(500000);
        professor.imprimirDadosDaPessoa();

        Aluno aluno = new Aluno();
        aluno.setCpf("12345678508");
        aluno.setNome("Cami");
        aluno.setIdade(10);
        aluno.setMatricula("898989");
        aluno.imprimirDadosDaPessoa();

    }
}
