package br.edu.iftm.livro;

import javax.swing.JOptionPane;

public class LivroNotas {

    private String nomeCurso;
    private float nota;
    private float notaIndividual;
    private float media;
    private float somaNotas;

    public LivroNotas(){
    }

    public void mostraMensagem(String nomeCurso){
        System.out.println("Seja bem vindo!!! Este livro pertence ao curso " + nomeCurso);
    }

    public float calculaMediaClasse(){
        int i, contAluno = 0;
        this.somaNotas = 0;
        for(i = 0; i < 10; i++){
            contAluno++;
            String temp = JOptionPane.showInputDialog(null, "digite a nota do aluno " + contAluno, JOptionPane.INFORMATION_MESSAGE);
            Float digitado = Float.parseFloat(temp);
            if(digitado < 0 || digitado > 100){
                System.out.println("Nota digitada é inválida");
            } else {
                nota = digitado;
            }
            somaNotas = somaNotas + nota;
        }
        this.media = somaNotas / 10;
        System.out.println("A média da Classe é " + media);

        return media;
    }

    public void calculaConceito(float notaIndividual){
        if((notaIndividual >= 95) && (notaIndividual <= 100)){
            System.out.println("Nota Conceito A");
        } else if((notaIndividual >= 80) && (notaIndividual <= 94)){
            System.out.println("Nota Conceito B");
        } else if((notaIndividual >= 60) && (notaIndividual <= 79)){
            System.out.println("Nota Conceito C");
        } else if((notaIndividual >= 40) && (notaIndividual <= 59)){
            System.out.println("Nota Conceito D");
        } else if((notaIndividual >= 20) && (notaIndividual <= 39)){
            System.out.println("Nota Conceito E");
        } else if((notaIndividual >= 0) && (notaIndividual <= 19)){
            System.out.println("Nota Conceito F");
        }
    }

    /**
     * @return String return the nomeCurso
     */
    public String getNomeCurso() {
        return nomeCurso;
    }

    /**
     * @param nomeCurso the nomeCurso to set
     */
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    /**
     * @return float[] return the nota
     */
    public float getNota() {
        return nota;
    }

    /**
     * @param nota the nota to set
     */
    public void setNota(float nota) {
        this.nota = nota;
    }

    /**
     * @return float return the notaIndividual
     */
    public float getNotaIndividual() {
        return notaIndividual;
    }

    /**
     * @param notaIndividual the notaIndividual to set
     */
    public void setNotaIndividual(float notaIndividual) {
        this.notaIndividual = notaIndividual;
    }

    /**
     * @return float return the media
     */
    public float getMedia() {
        return media;
    }

    /**
     * @param media the media to set
     */
    public void setMedia(float media) {
        this.media = media;
    }

    /**
     * @return float return the somaNotas
     */
    public float getSomaNotas() {
        return somaNotas;
    }

    /**
     * @param somaNotas the somaNotas to set
     */
    public void setSomaNotas(float somaNotas) {
        this.somaNotas = somaNotas;
    }
}