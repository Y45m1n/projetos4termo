package com.example;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
    Vendas vendas = new Vendas();
    String operacao;

    do {
        operacao = JOptionPane.showInputDialog("---Gerenciamento de Vendas---- \n" +"1 - Cadastrar venda \n"
        +"2 - Listar vendas por CPF \n" +"3 - Listar vendas por CPF e valor mínimo \n" +"4 - Sair \n");
        switch (operacao) {
            case "1":
                String cpfVenda = JOptionPane.showInputDialog("Informe o CPF do cliente");
                String nomeProduto = JOptionPane.showInputDialog("Informe o nome do produto");
                double precoProduto = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto"));
                Produto produto = new Produto(nomeProduto, precoProduto);
                vendas.cadastroVenda(cpfVenda, produto);
                JOptionPane.showMessageDialog(null, "Venda realizada", nomeProduto, 0);
                break;
        
            case "2":
            String cpfCliente = JOptionPane.showInputDialog("Informe o CPF do cliente");
            System.out.println(vendas.listarProdutos(cpfCliente));
            break;

            case "3":
            String cpfCliente2 = JOptionPane.showInputDialog("Informe o CPF do cliente");
            System.out.println(vendas.listarProdutos(cpfCliente2));
            double valorMinimo = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor minimo da lista"));
             try{
              System.out.println(vendas.listarProdutosFiltro(cpfCliente2, valorMinimo));
          } catch (Exception e) {
    JOptionPane.showMessageDialog(null, "Nenhum produto encontrado para esse cliente", "Erro", 0);
          }
          case "4":
                    System.out.println("sair"); 
            default:
                break;
        }
    } while (operacao != "4");
    }
}