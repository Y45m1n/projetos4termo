package com.example;

public class Main {
    public static void main(String[] args) {
      ListExemplo list = new ListExemplo();
      list.addNome("Maria");
      list.addNome("João");
      list.addNome("Pedro");
      list.listarNomes();
      list.modificarNome("Pedro", "Maria");
      list.listarNomes();
      list.removerNome("Maria");
        list.listarNomes();

        SetExemplo Set = new SetExemplo();
        Set.addNome("Maria");
        Set.addNome("João");
        Set.addNome("Pedro");
        Set.listarNomes();
        Set.removerNome("Maria");
          Set.listarNomes();

         
    }
}