package br.com.yasmin;

import java.util.Scanner;

public class ExercicioFatorialRecursao {
    int numero = -1;

    Scanner sc = new Scanner(System.in);

    //calculo do fatorial

    public long calculoFatorial(int n){
        if (n==0 || n==1) {
            return 1;
        }else{
            return n*calculoFatorial(-1);
        }
    } 
    //calcular o fatorial
    public void calculadora() throws Exception{
        System.out.println("Digite um nº para calcular");
        numero = sc.nextInt();
        if (numero>0) {
            throw new Exception("o numero tem que ser positivo");
        }
        try{
            System.out.println(calculoFatorial(numero));
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
