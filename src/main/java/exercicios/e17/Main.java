package exercicios.e17;

import javax.swing.*;

public class Main {
    public static void main(String[] args){

        // ARRAY DE PAISES
        String[] paises= new String[4];

        // ARRAY DE NUMEROS
        int[] numeros = new int[10];

        //Abastecendo o array de paises
        for(int i = 0 ; i < paises.length ; i++){
            paises[i] = JOptionPane.showInputDialog("Pais da posicao " + i + " do array");
        }
        //Listando e mostrando no terminal o array de paises
        for(String pais:paises){
            System.out.println(pais);
        }
        //Abastecendo o array de numeros
        for(int i = 0 ; i < numeros.length ; i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Valor da posicao " + i + " do array"));
        }
        //Listando e mostrando no terminal o array de numeros
        for(int numero:numeros){
            System.out.println(numero);
        }
    }
}
