package pck;

import javax.swing.JOptionPane;

public class EntradaViaInterface {

	public static void main(String[] args) {
		//atributos
        String nome;
        String modelo;
        float tamanho;
        double preco;
        int quantidade;
        
        //entrada de dados via interface
        nome = JOptionPane.showInputDialog("Digite o nome do produto: ");
        
        modelo = JOptionPane.showInputDialog("Digite o modelo do produto: ");
        
        String tamanhoString = JOptionPane.showInputDialog("Digite o tamanho do produto: ");
        tamanho = Float.parseFloat(tamanhoString);
        
        String precoString = JOptionPane.showInputDialog("Digite o preço do produto: ");
        preco = Double.parseDouble(precoString);
        
        String quantidadeString = JOptionPane.showInputDialog("Digite a quantidade de produto: ");
        quantidade = Integer.parseInt(quantidadeString);

        //imprimindo as variáveis
        System.out.println("Nome: " + nome);
        System.out.println("Modelo: " + modelo);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
	}
}
