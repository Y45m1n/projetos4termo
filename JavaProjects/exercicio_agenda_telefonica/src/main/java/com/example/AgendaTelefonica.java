package com.example;

public class AgendaTelefonica {
    // Atributos
    private Contato[] contatos;
    private int contador;

    // Construtor
    public AgendaTelefonica(int maxContato) {
        contatos = new Contato[maxContato];
        contador = 0;
    }

    // Adicionar contato
    public void addContato(Contato contato) throws AgendaCheiaException {
        if (contador >= contatos.length) {
            throw new AgendaCheiaException("Agenda Cheia");
        }
        contatos[contador] = contato;
        contador++;
        System.out.println("Contato adicionado com sucesso");
    }

    // Listar contatos
    public void listarContatos() {
        if (contador == 0) {
            System.out.println("Agenda Vazia");
        } else {
            for (int i = 0; i < contador; i++) {
                System.out.println(contatos[i].toString());
            }
        }
    }

    // Buscar contato
  public Contato buscarContato(String nome) throws ContatoNãoEncontradoException {
   for (int i = 0; i <  contador; i++) {
     if (contatos[i].getNome().equalsIgnoreCase(nome)) {
       return contatos[i];
     }
   }

   throw new ContatoNãoEncontradoException("Contato Não encontrado");
  }

    // Remover contato
    public void removerContato(String nome) throws ContatoNãoEncontradoException{
    boolean encontrado = false;
    for (int i = 0; i < contador; i++) {
        if (contatos[i].getNome().equalsIgnoreCase(nome)) {
            encontrado = true;
           contatos[i] = contatos[contador-1];
        contatos[contador-1]= null;
        contador--;
        System.out.println("Contato removido com sucesso");
        }

    }
    if (!encontrado) {
        throw new ContatoNãoEncontradoException("Contato não encontrado");
    }
}
}
