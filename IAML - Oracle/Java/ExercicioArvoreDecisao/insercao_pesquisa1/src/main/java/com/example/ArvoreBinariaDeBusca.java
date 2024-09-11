package com.example;

public class ArvoreBinariaDeBusca {
    private No raiz;

    public ArvoreBinariaDeBusca() {
        this.raiz = null;
    }

    // Método para inserir valores na árvore
    public void inserir(int valor) {
        raiz = inserirRecursivo(raiz, valor);
    }

    private No inserirRecursivo(No raiz, int valor) {
        if (raiz == null) {
            return new No(valor);
        }
        if (valor < raiz.valor) {
            raiz.esquerda = inserirRecursivo(raiz.esquerda, valor);
        } else if (valor > raiz.valor) {
            raiz.direita = inserirRecursivo(raiz.direita, valor);
        }
        return raiz;
    }

    // Método para pesquisar valores na árvore
    public boolean pesquisar(int valor) {
        return pesquisarRecursivo(raiz, valor);
    }

    private boolean pesquisarRecursivo(No raiz, int valor) {
        if (raiz == null) {
            return false;
        }
        if (valor == raiz.valor) {
            return true;
        } 
        return valor < raiz.valor 
            ? pesquisarRecursivo(raiz.esquerda, valor) 
            : pesquisarRecursivo(raiz.direita, valor);
    }

    // Método para encontrar o caminho até o valor encontrado
    public String caminhoParaValor(int valor) {
        StringBuilder caminho = new StringBuilder();
        encontrarCaminho(raiz, valor, caminho);
        return caminho.toString();
    }

    private boolean encontrarCaminho(No raiz, int valor, StringBuilder caminho) {
        if (raiz == null) {
            return false;
        }
        caminho.append(raiz.valor).append(" ");
        if (valor == raiz.valor) {
            return true;
        }
        if (valor < raiz.valor) {
            return encontrarCaminho(raiz.esquerda, valor, caminho);
        } else {
            return encontrarCaminho(raiz.direita, valor, caminho);
        }
    }
}

