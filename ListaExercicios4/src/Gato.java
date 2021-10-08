public class Gato {
    String nome;
    String raca;
    char sexo;
    int idade;
    int idadeHumana;
    float peso;

    public Gato(String nome, String raca, char sexo, int idade, float peso) {
        this.nome = nome;
        this.raca = raca;
        this.sexo = sexo;
        this.idade = idade;
        this.peso = peso;
    }
    
    public void miar(){
        System.out.format("O gato %s está miando", nome);
    }

    public static int calculoIdadeHumana(int idade) {
        int idadeHumana = idade * 7;
        return idadeHumana;
    }
}