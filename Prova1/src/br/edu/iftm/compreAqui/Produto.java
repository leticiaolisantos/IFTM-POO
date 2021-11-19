package br.edu.iftm.compreAqui;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Produto {

    protected ArrayList<String> nomeProduto;
    protected ArrayList<Float> preco;
    protected ArrayList<Integer> quantidade;

    public Produto() {
        this.nomeProduto = new ArrayList<>();
        this.preco = new ArrayList<>();
        this.quantidade = new ArrayList<>();
    }

    public void cadastroProduto(){
        String nomeDigitado = JOptionPane.showInputDialog(null, "Nome do Produto: ", JOptionPane.INFORMATION_MESSAGE);
        this.nomeProduto.add(nomeDigitado);

        String precoDigitado = JOptionPane.showInputDialog(null, "Preço do Produto: ", JOptionPane.INFORMATION_MESSAGE);
        Float precoDig = Float.parseFloat(precoDigitado);
        this.preco.add(precoDig);

        String emailCliente = JOptionPane.showInputDialog(null, "Quantidade do Produto: ", JOptionPane.INFORMATION_MESSAGE);
        Integer quantidadeDig = Integer.parseInt(emailCliente);
        this.quantidade.add(quantidadeDig);

        System.out.println("Produto cadastrado com sucesso!");
    }
}