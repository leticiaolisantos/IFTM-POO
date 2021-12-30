package biblioteca;

import biblioteca.classes.Aluno;
import biblioteca.classes.Livro;
import biblioteca.servicos.Biblioteca;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        int quantidadeLivro = biblioteca.quantidadeDeLivroNaBibliotecaParaCadastro();
        List<Livro> livros = biblioteca.cadastroDeLivros(quantidadeLivro);

        int quantidadeAluno = biblioteca.quantidadeDeAlunosNaBiblioteca();
        List<Aluno> alunos = biblioteca.cadastroDeAluno(quantidadeAluno);

        List<Aluno> alunosComLivros = biblioteca.distribuirLivros(livros, alunos);
        biblioteca.checkDeAlunos(alunosComLivros);
    }
}
