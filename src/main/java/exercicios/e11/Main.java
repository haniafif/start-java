package exercicios.e11;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        // Classe conceito
        Pessoa pes = new Pessoa(); //Instanciamento
        pes.setNome("João do nascimento");
        pes.setIdade(15);
        System.out.println(pes.toString());
    }
}
