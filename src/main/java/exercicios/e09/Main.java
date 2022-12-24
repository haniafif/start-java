package exercicios.e09;

public class Main {
    public static void main(String[] args){
         // Laços de repetição While / Do while (laco pre testado)

        int quantidadeVezes = 1;

        while (quantidadeVezes <= 10){
            System.out.println("Estou fazendo a" + quantidadeVezes + " vez");
            quantidadeVezes++;
        }

        //Quantidade sai do laco com valor 11

        System.out.println("Saio do laço");

        do{
            System.out.println("Executei uma vez mesmo não batendo a condicao");
        } while(quantidadeVezes <= 10);{
            System.out.println("Também executei uma vez");
            quantidadeVezes++;
        }
    }
}
