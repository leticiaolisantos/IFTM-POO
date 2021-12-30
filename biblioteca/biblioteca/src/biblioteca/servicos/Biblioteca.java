package biblioteca.servicos;

import biblioteca.classes.AlunoTerceiroAno;
import biblioteca.classes.Aluno;
import biblioteca.classes.AlunoSegundoAno;
import biblioteca.classes.Livro;
import biblioteca.servicos.implementacao.AcaoAlunoSegundoAno;
import biblioteca.servicos.implementacao.AcaoAlunoTerceiroAno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {

    public int quantidadeDeAlunosNaBiblioteca() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a quantidade de alunos dentro da biblioteca: ");

        return Integer.parseInt(sc.nextLine());
    }

    public int quantidadeDeLivroNaBibliotecaParaCadastro() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a quantidade de livros a serem cadastrados: ");

        return Integer.parseInt(sc.nextLine());
    }

    public List<Livro> cadastroDeLivros(int quantidadeDeLivro) {
        List<Livro> livroList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        try {
            if (quantidadeDeLivro <= 0) {
                System.out.println("Nao existe livro(s) para cadastro na biblioteca");
                System.out.println();

                return new ArrayList<>();
            }

            do {
                Livro livro = new Livro();

                System.out.print("Digite o nome do livro: ");
                livro.setNome(sc.nextLine());

                System.out.print("Qual serie escolar o livro se encontra 2 ano ou 3 ano?: ");
                livro.setSerie(Integer.parseInt(sc.nextLine()));

                System.out.println();

                livroList.add(livro);

                quantidadeDeLivro--;

            } while (quantidadeDeLivro > 0);

            return livroList;

        } catch (Exception e) {
            System.out.println("Algo deu errado");
        }

        return new ArrayList<>();
    }

    public List<Aluno> cadastroDeAluno(int quantidadeDeAluno) {
        List<Aluno> alunos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        try {
            if (quantidadeDeAluno <= 0) {
                System.out.println("Nao existe aluno(s) na biblioteca para pegar o(s) livro(s)");
                System.out.println();

                return new ArrayList<>();
            }

            do {
                System.out.print("O aluno a ser cadastrado é do 2 ano ou 3 ano?: ");
                int serie = Integer.parseInt(sc.nextLine());

                System.out.print("Digite o nome do aluno: ");
                String nome = sc.nextLine();

                System.out.print("Digite a idade do aluno: ");
                int idade = Integer.parseInt(sc.nextLine());

                System.out.println();

                Aluno aluno;

                if (2 == serie) {
                    aluno = new AlunoSegundoAno(nome, idade);

                } else {
                    aluno = new AlunoTerceiroAno(nome, idade);
                }

                alunos.add(aluno);

                quantidadeDeAluno--;

            } while (quantidadeDeAluno > 0);

            return alunos;

        } catch (Exception e) {
            System.out.println("Algo deu errado");
        }

        return new ArrayList<>();
    }

    public List<Aluno> distribuirLivros(List<Livro> livros, List<Aluno> alunos) {
        List<Aluno> alunoList = new ArrayList<>();

        if (alunos.isEmpty()) {
            System.out.println("Nao existe aluno(s) na biblioteca para pegar o(s) livro(s)");
            System.out.println();

            return new ArrayList<>();
        }

        if (livros.isEmpty()) {
            System.out.println("Nao existe livro(s) para distribuir");
            System.out.println();

            return new ArrayList<>();
        }

        for (Aluno aluno : alunos) {
            if (2 == aluno.getSerie()) {
                System.out.println("Distribuir livro(s) para o aluno: " + aluno.getNome() + " do segundo ano.");

                AcaoAluno acaoAlunoSegundoAno = new AcaoAlunoSegundoAno();
                List<Livro> livroList = acaoAlunoSegundoAno.pegarLivro(livros);

                if (livroList.isEmpty()) {
                    System.out.println("Náo existe livro(s) do 2 ano para distribuir.");
                    System.out.println();

                } else {
                    aluno.setLivros(livroList);
                }

            } else {
                System.out.println("Distribuir livro(s) para o aluno: " + aluno.getNome() + " do terceiro ano.");

                AcaoAluno acaoAlunoTerceiroAno = new AcaoAlunoTerceiroAno();
                List<Livro> livroList = acaoAlunoTerceiroAno.pegarLivro(livros);

                if (livroList.isEmpty()) {
                    System.out.println("Náo existe livro(s) do 3 ano para distribuir.");
                    System.out.println();

                } else {
                    aluno.setLivros(livroList);
                }
            }

            alunoList.add(aluno);
        }

        return alunoList;
    }

    public void checkDeAlunos(List<Aluno> alunos) {
        System.out.println("Controle de aluno(s) com o(s) livro(s)");

        if (alunos.isEmpty()) {
            System.out.println("Nao existe aluno(s) ou livro(s) para controle");
            System.out.println();

            return;
        }

        for (Aluno aluno : alunos) {
            if (aluno.getLivros() == null || aluno.getLivros().isEmpty()) {
                System.out.println("Aluno " + aluno.getNome() + " nao possui o(s) livro(s) para controle");
                System.out.println();

            } else {
                if (2 == aluno.getSerie()) {
                    System.out.println("Aluno " + aluno.getNome() + " do 2 ano está com o(s) livro(s): ");

                    for (Livro livro : aluno.getLivros()) {
                        System.out.println(livro.getNome());
                        System.out.println();
                    }

                } else {
                    System.out.println("Aluno " + aluno.getNome() + " do 3 ano está com o(s) livro(s): ");

                    for (Livro livro : aluno.getLivros()) {
                        System.out.println(livro.getNome());
                        System.out.println();
                    }
                }
            }
        }
    }
}
