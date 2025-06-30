package br.com.projetos.gestao_vagas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PrimeiroTeste {

    @Test
    public void deve_ser_possivel_calcular_dois_numeros() {
        int a = 2;
        int b = 3;
        int resultado = calculate(a, b);
        assertEquals(resultado, 5);
    }

    @Test
    public void validar_valores_incorretos() {
        int a = 2;
        int b = 3;
        int resultado = calculate(a, b);
        assertNotEquals(resultado, 4);
    }

    public static int calculate(int a, int b) {
        return a + b;
    }

}
