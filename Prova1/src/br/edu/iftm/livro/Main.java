package br.edu.iftm.livro;

public class Main {

    public static void main(String[] args) {

        LivroNotas livroNotas = new LivroNotas();

        livroNotas.mostraMensagem("Matemática");

        livroNotas.calculaMediaClasse();

        livroNotas.calculaConceito(76);

    }
}
