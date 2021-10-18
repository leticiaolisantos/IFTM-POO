package br.edu.iftm.encapsulamento.classes;

public class Cliente {

    private String nome;
    private String endereco;
    private String cpf;
    private int idade;

    //método construtor
    public Cliente(String nome, String endereco, String cpf, int idade){
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.idade =  idade;
    }

    //métodos da classe
    public boolean validaCPF(){
        if(this.cpf.length() == 11){
            System.out.format("%s informou um CPF válido.\n", this.nome);
            return true;
        } else{
            System.out.format("%s informou um CPF com %s dígitos. É necessário que tenha 11 dígitos.\n", this.nome, this.cpf.length());
            return false;
        }
    }

    //métoddos get e set

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return String return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return String return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return int return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }
}