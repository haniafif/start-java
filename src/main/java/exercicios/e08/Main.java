package exercicios.e08;

public class Main {
    public static void main(String[] args){
         // Switch Case
        char opcao = '2';

        switch (opcao){
            case '1': {
                System.out.println("Chame programa de inclusao");
                break;
            }

            case '2': {
                System.out.println("Chame programa de retirada");
                break;
            }

            case '3': {
                System.out.println("Chame programa de isenção");
                break;
            }

            default:{
                System.out.println("Opcao invalida: " + opcao + " redigite");
                break;
            }
        }
    }
}
