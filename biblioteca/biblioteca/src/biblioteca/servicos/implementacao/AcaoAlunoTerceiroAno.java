package biblioteca.servicos.implementacao;

import biblioteca.classes.Livro;
import biblioteca.servicos.AcaoAluno;
import java.util.ArrayList;
import java.util.List;

public class AcaoAlunoTerceiroAno implements AcaoAluno {

    @Override
    public List<Livro> pegarLivro(List<Livro> livros) {
        System.out.println("Aluno da serie: " + 3 + " pegando livro(s)");

        List<Livro> livroListEscolhidos = new ArrayList<>();

        try {
            if (livros == null || livros.isEmpty()) {
                System.out.println("Nao existe livro(s) para pegar");

                throw new Exception();
            }

            for (Livro livro : livros) {
                if (3 == livro.getSerie()) {
                    System.out.println("Livro escolhido: " + livro.getNome());
                    System.out.println();

                    livroListEscolhidos.add(livro);

                }
            }

            return livroListEscolhidos;

        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
}
