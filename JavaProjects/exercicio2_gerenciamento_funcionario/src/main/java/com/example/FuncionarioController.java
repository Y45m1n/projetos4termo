package com.example;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioController {
    //atributo
    private List<Funcionario> funcionarios;

    public FuncionarioController() {
        funcionarios = new ArrayList();
    }

 
    //metodos
    //add funcsionarios
    public void addFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
        System.out.println("Funcionario adicionado com sucesso");
    }

    //listar
    public void listarFuncionarios() {
        if (funcionarios.size() == 0) {
            System.out.println("Lista Vazia");
        } else {
     for (Funcionario funcionario : funcionarios) {
        System.out.println(funcionario.toString());
        }
    }
    }

    //remover
    public void removerFuncionario(String nome) {
        try{
        boolean encontrado = false;
    for (Funcionario funcionario : funcionarios) {
        if (funcionario.getNome().equalsIgnoreCase(nome)) {
            funcionarios.remove(funcionario);
            encontrado=true;
        }
    }
    if (!encontrado) {
        throw new Exception("Funcionario não encontrado");
    }
    } catch (Exception e){
        System.out.println(e);
    }
}

    //media salarial
    public double mediaSal( ){
        double mediaSal = 0;
        if (funcionarios.size() ==0) {
            return mediaSal;
        } else {
        for (Funcionario funcionario : funcionarios){
            mediaSal += funcionario.getSalario();
        }
        return mediaSal/funcionarios.size();
    }
    }

}
