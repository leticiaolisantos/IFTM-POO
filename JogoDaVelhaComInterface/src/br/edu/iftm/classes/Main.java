package br.edu.iftm.classes;

public class Main {

    public static void main(String[] args) throws Exception {

        // Instanciando as classes
        Tabuleiro tabuleiro = new Tabuleiro();
        JogadorHumano humano = new JogadorHumano();
        JogadorComputador computador = new JogadorComputador();
        Jogada jogada = new Jogada();

        // Declarando variáveis
        int jogadaValida = 0;
        int numJogadas = 0;

        tabuleiro.preencherJogoDaVelha();

        while(jogada.jogadorEscolhido == false){
            jogada.jogadorValido(jogada.escolherJogador());
        }

        // Execução do Jogo
        do {
            System.out.println("JOGO DA VELHA:");
            tabuleiro.imprimirTabuleiro();

            // Jogada Humano: escolhe a posição para marcar X
            // Jogada Computador: escolhe a posição para marcar O
            do {
                if(jogada.getEscolha() == 1){
                    tabuleiro.jogandoNoTabuleiro(humano.escolherLinha(), humano.escolherColuna(), "X");
                    while(tabuleiro.preenchido == false){
                        tabuleiro.jogandoNoTabuleiro(humano.escolherLinha(), humano.escolherColuna(), "X");
                    }
                } else if(jogada.getEscolha() == 2){
                        tabuleiro.jogandoNoTabuleiro(computador.escolherLinha(), computador.escolherColuna(), "O");
                        while(tabuleiro.preenchido == false){
                            tabuleiro.jogandoNoTabuleiro(computador.escolherLinha(), computador.escolherColuna(), "O");
                        }

                    }
                jogadaValida = 1;              

            } while (jogadaValida == 0);
            numJogadas++;
            jogadaValida = 0;
            tabuleiro.imprimirTabuleiro();
            System.out.println("\n");
            if (tabuleiro.Ganhador(numJogadas) != "jogando") {
                break;
            }

            do {
                if(jogada.getEscolha() == 1){
                    tabuleiro.jogandoNoTabuleiro(computador.escolherLinha(), computador.escolherColuna(), "O");
                    while(tabuleiro.preenchido == false){
                        tabuleiro.jogandoNoTabuleiro(computador.escolherLinha(), computador.escolherColuna(), "O");
                    }
                } else if (jogada.getEscolha() == 2){
                    tabuleiro.jogandoNoTabuleiro(humano.escolherLinha(), humano.escolherColuna(), "X");
                    while(tabuleiro.preenchido == false){
                        tabuleiro.jogandoNoTabuleiro(humano.escolherLinha(), humano.escolherColuna(), "X");
                    }
                }
                jogadaValida = 1;

            } while (jogadaValida == 0);
            numJogadas++;
            jogadaValida = 0;
            tabuleiro.imprimirTabuleiro();
            System.out.println("\n");
            if (tabuleiro.Ganhador(numJogadas) != "jogando") {
                break;
            }
        }while (true);

        // Imprimir caso haja vencedor ou empate
        if(tabuleiro.Ganhador(numJogadas) == "EMPATE"){
            System.out.println("Houve EMPATE");
        } else{
            System.out.println("O " + tabuleiro.Ganhador(numJogadas) + " ganhou o jogo!!!");
        }
    }
}