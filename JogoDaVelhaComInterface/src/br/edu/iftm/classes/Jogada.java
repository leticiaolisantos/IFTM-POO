package br.edu.iftm.classes;

import javax.swing.JOptionPane;

public class Jogada{

    private int escolha;

    //Método Construtor
    public Jogada(){
    }
    
    public int escolherJogador(){
        String escolhaDigitada = JOptionPane.showInputDialog(null, "Escolha o número de quem joga primeiro, 1-Humano ou 2-Computador:", JOptionPane.INFORMATION_MESSAGE);
        this.escolha = Integer.parseInt(escolhaDigitada);
        return getEscolha();
    }

    boolean jogadorEscolhido;
    public boolean jogadorValido(int jogador){        
        if(jogador == 1){
            jogadorEscolhido = true;
            System.out.println("Jogador escolhido: Humano\n");
        } else if (jogador == 2){
            jogadorEscolhido = true;
            System.out.println("Jogador escolhido: Computador\n");
        } else {
            jogadorEscolhido = false;
            System.out.println("Opção inválida\n");
        }
        return jogadorEscolhido;
    }

    /**
     * @return int return the escolha
     */
    public int getEscolha() {
        return escolha;
    }

    /**
     * @param escolha the escolha to set
     */
    public void setEscolha(int escolha) {
        this.escolha = escolha;
    }

}