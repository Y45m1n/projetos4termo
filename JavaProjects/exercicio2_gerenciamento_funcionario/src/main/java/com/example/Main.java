package com.example;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        FuncionarioController gerencia = new FuncionarioController();
       int operacao = 0;
        do {
            try{
            operacao = Integer.parseInt(JOptionPane.showInputDialog("\n" +"---Gerenciamento de Funcionarios \n"
            +"1 - Cadastrar Funcionario \n" +"2 - Listar Funcionarios \n" +"3 - Removerar Funcionario \n" 
            +"4 - Calcular Média Salarial \n" +"5 - Sair \n"));
            }catch(Exception e){
                System.out.println(e);
                operacao=0;
            }
            switch (operacao) {
                case 1:
                    String nome = JOptionPane.showInputDialog("Digite o nome do Funcionario");
                    int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do Funcionario"));
                    double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario do Funcionario"));
                   gerencia.addFuncionario(new Funcionario(nome, idade, salario));
                    break;
                case 2:
                gerencia.listarFuncionarios();
                break;
                case 3:
                String nomeRemover = JOptionPane.showInputDialog("Digite o nome");
                gerencia.removerFuncionario(nomeRemover);
                break;
                case 4:
                gerencia.mediaSal();
                break;
                case 5:
                System.out.println("Saindo");
                break;
                default:
                    break;
            }
        } while (operacao!=5);
    }
}