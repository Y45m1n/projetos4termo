package com.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Aluno extends Pessoa implements Avaliavel{

    public String matricula;
    public double nota;

    //construtor
    public Aluno(String cpf, String matricula, double nota){
        super(nome , cpf);
        this.matricula = matricula;
        this.nota = 0.0;
    }
    
    //polimorfismo - sobrescrita
    public String exibirString(){
        super.exibirInfo();
        return "Matricula: " + matricula
    }

    @Override
    public void avaliarDesempenho() {
        if (nota >=7) {
            System.out.println("Aluno Aprovado");
        } else if(nota >=5 && nota<7){
            System.out.println("Aluno de Recuperação");
        }else{
            System.out.println("Aluno Reprovado");
        }
    }

}
