package br.edu.iftm.classes;
import java.util.Random;

public class JogadorComputador extends JogadorHumano{
    
    Random random = new Random();

    //Método Construtor
    public JogadorComputador(){
    }

    @Override
    public int escolherLinha(){
        final int min = Math.min(0,1);
        final int max = Math.max(1,2);
        int linha =  min + random.nextInt((max - min) + 1);
        System.out.println("Jogada do Computador");
        System.out.println("Linha escolhida: " + linha);
        return linha;
    }

    @Override
    public int escolherColuna(){
        final int min = Math.min(0,1);
        final int max = Math.max(1,2);
        int coluna =  min + random.nextInt((max - min) + 1);
        System.out.println("Coluna escolhida: " + coluna);
        return coluna;
    }
    
}