package com.example;

public class Main {
    public static void main(String[] args) {
        ArvoreBinariaDeBusca arvore = new ArvoreBinariaDeBusca();

        // Inserindo valores
        arvore.inserir(7);
        arvore.inserir(3);
        arvore.inserir(10);
        arvore.inserir(1);
        arvore.inserir(5);
        arvore.inserir(8);
        arvore.inserir(12);

        // Pesquisar valores
        int[] valoresParaPesquisar = {5, 8, 2, 12};
        for (int valor : valoresParaPesquisar) {
            boolean existe = arvore.pesquisar(valor);
            System.out.println("Valor " + valor + " encontrado? " + existe);
        }

        // Caminho até um valor
        int valorParaCaminho = 5;
        String caminho = arvore.caminhoParaValor(valorParaCaminho);
        System.out.println("Caminho até o valor " + valorParaCaminho + ": " + caminho);
    }
}
