package com.example;

import java.util.ArrayList;
import java.util.List;

public class ListExemplo {
    private List<String> nomes;

    public ListExemplo(){
        nomes = new ArrayList<>();
    }
    
    //metodo para adicionar
    public void addNome(String nome){
        nomes.add(nome);
        System.out.println(nomes.lastIndexOf(nome));
    }

    //listar
    public void listarNomes(){
       System.out.println(nomes);

    }

    //remover
    public void removerNome(String nome){
        try {
            nomes.remove(nome);
        } catch (Exception e) {
            System.err.println(e);
        }
      
    }

    //atualizar
    public void modificarNome(String nomeAntigo, String nomeNovo){
        try {
          int index = nomes.indexOf(nomeAntigo);
          nomes.set(index, nomeNovo);
          System.out.println("Nome alterado com sucesso");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
