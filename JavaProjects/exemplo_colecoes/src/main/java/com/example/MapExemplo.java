package com.example;

import java.util.HashMap;
import java.util.Map;

public class MapExemplo {
      private Map<String, Integer> nomesIdades;
      
    public MapExemplo(){
        nomesIdades = new HashMap<>();
    }

     //metodo para adicionar
     public void addNomeIdade(String nome, int idade){
        nomesIdades.put(nome, idade);
        System.out.println(nomesIdades.getOrDefault(nome, idade));
     }

    //listar
    public void listarNomesIdades(){
        System.out.println(nomesIdades);
    }
   

    //remover
    public void removerIdade(String nome){
        nomesIdades.remove(nome);
    }
   
    //modificar
    public void modificarIdade(String nome, int novaIdade){
        nomesIdades.replace(nome, novaIdade);
    }
}
