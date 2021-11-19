package br.edu.iftm.compreAqui;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Cliente {

    protected ArrayList<String> nome;
    protected ArrayList<String> cpf;
    protected ArrayList<String> email;
    protected ArrayList<String> endereco;
    protected int codigoCliente;


    public Cliente(){
        this.nome = new ArrayList<>();
        this.cpf = new ArrayList<>();
        this.email = new ArrayList<>();
        this.endereco = new ArrayList<>();
    }

    public void cadastroCliente(){
        String nomeDigitado = JOptionPane.showInputDialog(null, "Nome do Cliente: ", JOptionPane.INFORMATION_MESSAGE);
        this.nome.add(nomeDigitado);

        String cpfDigitado = JOptionPane.showInputDialog(null, "CPF do Cliente: ", JOptionPane.INFORMATION_MESSAGE);
        this.cpf.add(cpfDigitado);

        String emailCliente = JOptionPane.showInputDialog(null, "Email do Cliente: ", JOptionPane.INFORMATION_MESSAGE);
        this.email.add(emailCliente);

        String enderecoCliente = JOptionPane.showInputDialog(null, "Endereço do Cliente: ", JOptionPane.INFORMATION_MESSAGE);
        this.endereco.add(enderecoCliente);

        System.out.println("Cliente cadastrado com sucesso!");
    }

    public int buscarCliente(){
        String codigoDigitado = JOptionPane.showInputDialog(null, "Digite o código do Cliente que deseja: ", JOptionPane.INFORMATION_MESSAGE);
        this.codigoCliente = Integer.parseInt(codigoDigitado);
        return codigoCliente;
    }

    public int quantidadeCliente(){
        int quantidadeCliente = this.nome.size();
        return quantidadeCliente;
    }

    public int getcodigoCliente() {
        return codigoCliente;
        }
}