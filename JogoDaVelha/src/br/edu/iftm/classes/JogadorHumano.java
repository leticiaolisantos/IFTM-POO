package br.edu.iftm.classes;

import javax.swing.JOptionPane;

public class JogadorHumano {

    private int linha;
    private int coluna;

    //Método Construtor
    public JogadorHumano(){
    }

    public int escolherLinha(){
        String linhaDigitada = JOptionPane.showInputDialog(null, "Humano, digite a linha desejada (0, 1 ou 2):", JOptionPane.INFORMATION_MESSAGE);
        linha = Integer.parseInt(linhaDigitada);
        return linha;
    }

    public int escolherColuna(){
        String colunaDigitada = JOptionPane.showInputDialog(null, "Humano, digite a coluna desejada (0, 1 ou 2):", JOptionPane.INFORMATION_MESSAGE);
        coluna = Integer.parseInt(colunaDigitada);
        return coluna;
    }    

    /**
     * @return int return the linha
     */
    public int getLinha() {
        return linha;
    }

    /**
     * @param linha the linha to set
     */
    public void setLinha(int linha) {
        this.linha = linha;
    }

    /**
     * @return int return the coluna
     */
    public int getColuna() {
        return coluna;
    }

    /**
     * @param coluna the coluna to set
     */
    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

}