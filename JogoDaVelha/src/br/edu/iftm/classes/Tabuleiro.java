package br.edu.iftm.classes;

public class Tabuleiro{

    private String[][] matriz = new String[3][3];
    String[] vetor = new String[8];
    String ganhador = "jogando";

    //Método Construtor
    public Tabuleiro(){
    }

    public void preencherJogoDaVelha(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = "_";
            }
        }
    }

    //Imprime o jogo da velha na tela
    public void imprimirTabuleiro(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("  " + matriz[i][j]);                
            }
            System.out.print("\n");            
        }
    }

    //Preenchendo com o X ou O, a linha e coluna escolhida
    boolean preenchido;
    public boolean jogandoNoTabuleiro(int i, int j, String desenho){
        if(i > 2 || j > 2){
            System.out.println("ATENÇÃO: Posição escolhida é inválida.\n");
            preenchido = false;
        } else {
            for (int k = 0; k < matriz.length; k++) {
                for (int k2 = 0; k2 < matriz.length; k2++) {
                    if(k == i && k2 == j){
                        if(matriz[i][j] == "_"){
                            matriz[i][j] = desenho;
                            preenchido = true;
                        } else {
                            System.out.println("ATENÇÃO: Posição escolhida já está preenchida.\n");
                            preenchido = false;
                        }                                       
                    }
                } 
            }
        }
        return preenchido;
    }

    public String Ganhador(int qtdeJogadas) {
        //Tem 8 possibilidades de um Jogador ganhar, marcando nessas posições

        //Horizontal
        vetor[0] = matriz[0][0] + matriz[0][1] + matriz[0][2];
        vetor[1] = matriz[1][0] + matriz[1][1] + matriz[1][2]; 
        vetor[2] = matriz[2][0] + matriz[2][1] + matriz[2][2]; 

        //Vertical
        vetor[3] = matriz[0][0] + matriz[1][0] + matriz[2][0];   
        vetor[4] = matriz[0][1] + matriz[1][1] + matriz[2][1]; 
        vetor[5] = matriz[0][2] + matriz[1][2] + matriz[2][2]; 
        
        //Diagonal
        vetor[6] = matriz[0][0] + matriz[1][1] + matriz[2][2]; 
        vetor[7] = matriz[0][2] + matriz[1][1] + matriz[2][0]; 

        if(qtdeJogadas == 9){
            ganhador = "EMPATE";
        } else if(qtdeJogadas != 9){
            for (int i = 0; i < vetor.length; i++) {
                if(vetor[i].equals("XXX")){
                    ganhador = "Humano";
                } else if(vetor[i].equals("OOO")){
                    ganhador = "Computador";
                }              
            }
        }
        
        return ganhador;
    }              
    
}