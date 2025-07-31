package br.com.projetos.gestao_vagas.exceptions;

public class InvalidCredentialsException extends RuntimeException {
    public InvalidCredentialsException() {
        super("Username/password incorrect");
    }
}