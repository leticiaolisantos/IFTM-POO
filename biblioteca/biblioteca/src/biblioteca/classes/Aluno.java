package biblioteca.classes;

import java.util.List;

public abstract class Aluno {

    private String nome;
    private Integer idade;
    private Integer serie;
    private List<Livro> livros;

    public Aluno(String nome, Integer idade, Integer serie) {
        this.nome = nome;
        this.idade = idade;
        this.serie = serie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getSerie() {
        return serie;
    }

    public void setSerie(Integer serie) {
        this.serie = serie;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }
}
