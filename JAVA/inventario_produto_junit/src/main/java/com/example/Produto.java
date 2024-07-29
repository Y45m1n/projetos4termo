package com.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Produto {
    //atributos
    private int id;
    private String nome;
    private int quantidade;
    private String categoria;
    private double preco;

    // //construtores
    // public Produto(int id, String nome, int quantidade, String categoria, double preco) {
    //     this.id = id;
    //     this.nome = nome;
    //     this.quantidade = quantidade;
    //     this.categoria = categoria;
    //     this.preco = preco;
    // }

    // public Produto(){

    // }

    // //getters and setters
    // //pega e set altera
    // public int getId() {
    //     return id;
    // }
    
    // public void setId(int id) {
    //     this.id = id;
    // }
    // public String getNome() {
    //     return nome;
    // }
    // public void setNome(String nome) {
    //     this.nome = nome;
    // }
    // public int getQuantidade() {
    //     return quantidade;
    // }
    // public void setQuantidade(int quantidade) {
    //     this.quantidade = quantidade;
    // }
    // public String getCategoria() {
    //     return categoria;
    // }
    // public void setCategoria(String categoria) {
    //     this.categoria = categoria;
    // }
    // public double getPreco() {
    //     return preco;
    // }
    // public void setPreco(double preco) {
    //     this.preco = preco;
    // }
}
