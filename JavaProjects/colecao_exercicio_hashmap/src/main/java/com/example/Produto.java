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
    private String nome;
    private double preco;

    //toString
    public String toString() {
        return "Nome Produto: "+nome +", Valor: "+preco;
    }
}
