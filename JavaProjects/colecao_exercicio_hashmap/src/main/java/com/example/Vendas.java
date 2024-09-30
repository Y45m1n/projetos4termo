package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Vendas {
    //atributos
    private Map<String, List<Produto>> vendasCPF;

    //construtor

    public Vendas() {
        vendasCPF = new HashMap<>();
    }

    //métodos - Cadastrar Venda
    public void cadastroVenda(String cpf, Produto p) {
    for (String cpfUsuario : vendasCPF.keySet()) {
        if (cpfUsuario.equals(cpf)) {   
            List<Produto> produtosCPF = vendasCPF.get(cpfUsuario);
            produtosCPF.add(p);
            vendasCPF.put(cpf, produtosCPF);
            return;
        }
    }
    List<Produto> produtosCPFVazio = new ArrayList<>();
    produtosCPFVazio.add(p);
    vendasCPF.put(cpf, produtosCPFVazio);
}
    //metodo listar produtos de um cpf
    public List<Produto> listarProdutos(String cpf)  {
    List<Produto> listaCpf = vendasCPF.getOrDefault(cpf, Collections.emptyList());
    return listaCpf;
    }
    //metodo listar com filtro(stream)
    public List<Produto> listarProdutosFiltro(String cpf , double valorMinimo) throws Exception {
    List<Produto> listaCpfFiltro = vendasCPF.getOrDefault(cpf, Collections.emptyList());
   if (listaCpfFiltro.isEmpty()) {
    throw new Exception("CPF não encontrado");
   } else {
    List<Produto> resultado = listaCpfFiltro.stream().filter(p->p.getPreco()>valorMinimo).collect(Collectors.toList());
    return resultado;
   }
    }
}
