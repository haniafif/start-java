package exercicios.e06;

public class Main {
    public static void main(String[] args){
         //Relacionadores operacionais ==
         int num1,num2;
         num1 = 10;
         num2 = 10;

         if (num1 == num2){
            System.out.println("numero 1 e numero 2 são iguais.");
         }

         //testando desigualdade

        num1 = 10;
        num2 = 20;

        if (num1 != num2){
            System.out.println("numero 1 e numero 2 são diferentes.");
        }

        //testando maior

        num1 = 10;
        num2 = 20;

        if (num1 > num2){
            System.out.println("numero 1 é maior que numero 2");
        } else{
            System.out.println("numero 2 é maior que numero 1");
        }

        //Operadores lógicos && ||

        num1 = 50;
        num2 = 5;
        int num3 = 30,num4 = 5;

        if (num1 < num3 && num2 == num4){
            System.out.println("Satisfeita");
        }

        if (num1 < num3 || num2 == num4){
            System.out.println("Satisfeita");
        }
    }
}
