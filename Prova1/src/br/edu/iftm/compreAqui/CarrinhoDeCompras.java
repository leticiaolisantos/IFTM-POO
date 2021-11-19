package br.edu.iftm.compreAqui;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CarrinhoDeCompras {

    protected String clienteCarrinho;
    protected ArrayList<Integer> codigoProduto;
    protected ArrayList<String> carrinhoCompras;

    public CarrinhoDeCompras(){
        this.carrinhoCompras = new ArrayList<>();
    }

    public void addProdutoCarrinho(){
        Cliente cliente = new Cliente();
        String codCliDigitado = JOptionPane.showInputDialog(null, "Digite o código do cliente: ", JOptionPane.INFORMATION_MESSAGE);
        Integer codigoCliente = Integer.parseInt(codCliDigitado);
        this.clienteCarrinho = cliente.nome.get(codigoCliente);
        System.out.println("Código cliente" + cliente.nome.get(codigoCliente));
        System.out.println("Código cliente carrinho" + clienteCarrinho);

        Produto produto = new Produto();

        String codProdDigitado = JOptionPane.showInputDialog(null, "Digite o código do Produto para adicionar ao carrinho: ", JOptionPane.INFORMATION_MESSAGE);
        Integer codProduto = Integer.parseInt(codProdDigitado);
        this.codigoProduto.add(codProduto);

        for (Integer posicaoProduto: this.codigoProduto) {
            this.carrinhoCompras.add(produto.nomeProduto.get(posicaoProduto));
        }

    }
}