package pck;

import java.util.Locale;
import java.util.Scanner;

public class EntradaViaConsole {

	public static void main(String[] args) {
		//atributos
        String nome;
        String modelo;
        float tamanho;
        double preco;
        int quantidade;

        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US);
        
        //solicitando a inserção de dados ao usuário via console
        System.out.println("Digite o nome do produto: ");
        nome = leitor.nextLine();
        
        System.out.println("Digite o modelo do produto: ");
        modelo = leitor.nextLine();

        System.out.println("Digite o tamanho do produto: ");
        tamanho = leitor.nextFloat();

        System.out.println("Digite o preço do produto: ");
        preco = leitor.nextDouble();

        System.out.println("Digite a quantidade de produtos: ");
        quantidade = leitor.nextInt();
        
        //imprimindo as variáveis
        System.out.println("Nome: " + nome);
        System.out.println("Modelo: " + modelo);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
	}
}
