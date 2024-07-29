package com.example;

//import das bibliotecas junit
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculadoraTeste {
    Calculadora calc;

    @Before
    public void setUp() {
        calc = new Calculadora();
    }
    
    @Test
    public void testSoma() {
        int resultado = calc.soma(3, 4);
        assertEquals(7, resultado);
    }
    
    @Test
    public void testSubtracao() {
        int resultado = calc.subtracao(9,5);
        assertEquals(4, resultado);
    }
    
    @Test
    public void testMultiplicacao() {
        int resultado = calc.multiplicacao(2, 3);
        assertEquals(6, resultado);
       }
    
    @Test
    public void testDivisao() {
        double resultado = calc.divisao(6, 3);
        assertEquals(2.0, resultado, 0.001);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testDivisaoPorZero() {
        calc.divisao(3, 0);
    }
    
    @Test
    public void testePotencia() {
        int resultado = calc.potencia(2, 3);
        assertEquals(8, resultado,0);
    }

    @Test
    public void testeRaiz() {
        double resultado = calc.raiz(125, 3);
        assertEquals(5, resultado, 0.1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testeRaizNegativa() {
        calc.raiz(5, 0);
    }
    @Test(expected = ArithmeticException.class)
    public void testeRaizParNegativa() {
       double resultado = calc.raiz(-1, 0);
    }
}