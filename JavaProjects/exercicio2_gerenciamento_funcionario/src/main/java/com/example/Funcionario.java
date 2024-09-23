package com.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Funcionario {
    //atributos
    private String nome;
    private int idade;
    private double salario;

    //metodo
    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Salario: " + salario;
    }
}
