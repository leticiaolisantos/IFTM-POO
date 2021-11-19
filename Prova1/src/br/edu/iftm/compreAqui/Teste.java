package br.edu.iftm.compreAqui;

import javax.swing.JOptionPane;

public class Teste {

    public static void main(String[] args) {

        Cliente clientes = new Cliente();
        Produto produtos = new Produto();
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        int sair = 0;
        do {
            System.out.println("MENU\n1.Cadastro de Cliente\n2.Cadastro de Produto\n3.Buscar Cliente\n4.Adicionar produto no carrinho de compras\n7.Sair");
            String digitado = JOptionPane.showInputDialog(null, "Escolha uma opção do menu: ", JOptionPane.INFORMATION_MESSAGE);
            Integer escolha = Integer.parseInt(digitado);

        switch(escolha){
            case 1:
                clientes.cadastroCliente();
                break;

            case 2:
                produtos.cadastroProduto();
                break;

            case 3:
                System.out.println("A quantidade de clientes cadastrados é: " + clientes.quantidadeCliente());
                for (int i = 0; i < clientes.quantidadeCliente(); i++) {
                    System.out.println("Cliente código " + i + " : " + clientes.nome.get(i));
                }
                System.out.println("\nDados do cliente:\n" + "Nome: " + clientes.nome.get(clientes.buscarCliente()));
                System.out.println("CPF: " + clientes.cpf.get(clientes.getcodigoCliente()));
                System.out.println("E-mail: " + clientes.email.get(clientes.getcodigoCliente()));
                System.out.println("Endereço: " + clientes.endereco.get(clientes.getcodigoCliente()));
                break;

            case 4:
                carrinhoDeCompras.addProdutoCarrinho();
                break;
            case 7:
                sair = 1;
            }
        }while(sair == 0);
    }
}