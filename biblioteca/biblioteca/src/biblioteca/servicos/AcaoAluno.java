package biblioteca.servicos;

import biblioteca.classes.Livro;

import java.util.List;

public interface AcaoAluno {

    List<Livro> pegarLivro(List<Livro> livros);
}
