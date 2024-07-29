package com.example;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    //atributo
    private List<Produto> list;
    //construtor 
    public Inventario() {
        list = new ArrayList<>();
    }
    //metodos
    public void adicionar(Produto produto) {
        list.add(produto);
    }
    public void remover(int id) {
        list.removeIf(produto -> produto.getId()==id);
        }
    public void atualizar(int id, int quantidade, double preco) {
for(Produto produto :list){
    if (produto.getId()==id) {
        produto.setQuantidade(quantidade);
        produto.setPreco(preco);
        break;
    }
}
    }
    public List<Produto> listar(){
        return new ArrayList<>(list);
    }
}
