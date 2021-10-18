package main;

import br.edu.iftm.encapsulamento.classes.Cliente;

public class Teste {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Leticia", "Rua teste", "33322211199", 30);
        Cliente cliente2 = new Cliente("Maria", "Rua teste 22", "333222111", 20);

        cliente1.validaCPF();
        cliente2.validaCPF();
    }    
}