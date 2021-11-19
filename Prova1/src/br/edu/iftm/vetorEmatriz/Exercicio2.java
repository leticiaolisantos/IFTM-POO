package br.edu.iftm.vetorEmatriz;

import javax.swing.JOptionPane;

public class Exercicio2 {
    public static void main(String[] args) {
        System.out.println("Digite os números para formar uma matriz 5x5");

        int[][] matriz = new int[5][5];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                String temp = JOptionPane.showInputDialog(null, "linha " + i + " coluna " + j + ": ", JOptionPane.INFORMATION_MESSAGE);
                int digitado = Integer.parseInt(temp);
                matriz[i][j] = digitado;
            }
        }

        //Imprimindo a Matriz
        System.out.println("\nImpressão da matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        //Soma Diagonal Principal
        int somaDiagPrincipal = 0;
        System.out.print("Diagobal principal da Matriz: ");

        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
            somaDiagPrincipal += matriz[i][i];
        }
        System.out.println();
        System.out.println("Soma dos elementos da Diagonal principal: " + somaDiagPrincipal);

        //Soma Diagonal Secundária
        int somaDiagSecundaria = 0;
        System.out.print("\nDiagobal Secundária da Matriz: ");

        int col = matriz.length - 1;
        for (int i = 0; i < matriz.length; i++) {
                System.out.print(matriz[i][col] + " ");
                somaDiagSecundaria += matriz[i][col];
                col--;
        }
        System.out.println();
        System.out.println("Soma dos elementos da Diagonal Secundária: " + somaDiagSecundaria);

        //Soma elementos que não pertencem a nenhuma das duas diagonais
        System.out.println("\nElementos que não pertencem a nenhuma das duas diagonais: ");
        int somaElementos = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(i != j){
                    int soma = i + j;
                    if(soma != 4){
                        System.out.print(matriz[i][j] + " ");
                        somaElementos += matriz[i][j];
                    }
                }
            }
            System.out.println();
        }
        System.out.println("Soma do elementos que não pertencem a nenhuma das duas diagonais: " + somaElementos);

        //Diferença entre soma (Diagonal Principal e elementos fora das diagonais)
        int diferenca = somaDiagPrincipal - somaElementos;
        System.out.println("\nDiferença entre os dois valores (Soma Diagonal Principal e Soma elementos fora das diagonais): " + diferenca);
    }
}