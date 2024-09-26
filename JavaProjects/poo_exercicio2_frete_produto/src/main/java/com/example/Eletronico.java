package com.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Eletronico extends Produto implements Transportavel{

    //atributo
    private double volume;
    private double peso;

    public Eletronico(String nome, double preco, double volume) {
      super(nome, preco);
      this.volume = volume;
    }

    @Override
    public double calcularPeso() {
       this.peso = volume*150;
       return peso;
    }

    @Override
    public double calcularFrete() {
     double valorFrete = calcularPeso()*1;
     return valorFrete;
    }
    
}
