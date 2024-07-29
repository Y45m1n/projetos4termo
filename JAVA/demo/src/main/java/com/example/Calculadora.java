package com.example;

public class Calculadora {
    //soma
    public int soma(int a, int b) {
        return a+b;     
    }
    //subtração
    public int subtracao(int a, int b){
        return a-b;
    }
    //multiplicacao
    public int multiplicacao(int a, int b){
        return a*b;
    }
    //divisao
    public double divisao(int a, int b){
        if(b!=0)
            return (double)a/b;
        else
            throw new IllegalArgumentException("Divisão por zero.");
    }
    //potencia
    public int potencia(double a, double b) {
        return (int) Math.pow(a, b);
    }
    // //raiz 
    // public double raiz(double numero) {
    //     if (numero < 0) {
    //         throw new IllegalArgumentException("Número negativo não tem raiz quadrada real");
    //     }
    //     return Math.sqrt(numero);
    // }
    //raiz
    public double raiz(double a, double b) {
        if(b<=0){
            throw new IllegalArgumentException("A raiz deve ser maior que zero");
        }
      double raiz = 1/b;
      if (a<0 && b%2 == 0) {
        throw new IllegalArgumentException("");
      }
      double resultado = Math.pow(a,raiz);
        return resultado;
    }
}