package br.edu.iftm.vetorEmatriz;

import javax.swing.JOptionPane;

public class Exercicio3 {
    public static void main(String[] args) {

        int[] vetor = new int[10];

        //Lendo os números para formar o vetor
        for (int i = 0; i < vetor.length; i++) {
            String temp = JOptionPane.showInputDialog(null, "Digite 10 números!!! Número " + i + ": ", JOptionPane.INFORMATION_MESSAGE);
            int digitado = Integer.parseInt(temp);
            vetor[i] = digitado;
        }

        //Imprimindo o vetor
        System.out.print("\nValores digitados: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + ", ");
        }

        //Verificando valores iguais
        System.out.println();
        int valoresIguais = 0;
        for (int i = 0; i < vetor.length; i++) {
            for (int j = i+1; j < vetor.length; j++) {
                if(vetor[i] == vetor[j]){
                    valoresIguais++;
                    System.out.print("\nO número " + vetor[i] + " se repete");
                }
            }
        }

        if(valoresIguais == 0){
            System.out.print("\nNão existem valores iguais.");
        }
    }
}