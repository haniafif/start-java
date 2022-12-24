package exercicios.e07;

public class Main {
    public static void main(String[] args){
         //If else
        int num1 =10,num2=20;

        if(num1>num2){
            System.out.println("Num1 é maior que Num2");
        } else {
            System.out.println("Num 2 é maior que Num1");
        }

        //Condicao intemediaria tem que satisfazer o segundo argumento

        if(num1>num2){
            System.out.println("Num1 é maior que Num2");
        } else if (num2>num1) {
            System.out.println("Num 2 é maior que Num1");
        }
    }
}
