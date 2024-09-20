package br.com.yasmin;

import java.util.Scanner;

public class ExercicioSistemaNotas {
    //atributos
    double [] notas = new double[4];
    double mediaNotas = 0;
    boolean bonus = true;
    
    Scanner sc = new Scanner(System.in);

    public void calculoNotas(){
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Informe a nota " + i+ ":");
            notas[i] = sc.nextDouble();
            mediaNotas += notas[i];
            if (notas[i]<9) {
                bonus = false;
            }
        }
        mediaNotas/= notas.length;
        //aplicar o bonus
        if (bonus) {
            mediaNotas = (mediaNotas*1.1>10?mediaNotas=10:mediaNotas*1.1);
        }
        if (mediaNotas>=7) {
            System.out.println("aprovado");
        } else if (mediaNotas>=5 && mediaNotas<=7) {
           System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
