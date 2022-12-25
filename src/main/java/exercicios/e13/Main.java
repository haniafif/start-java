package exercicios.e13;
public class Main {
    public static void main(String[] args){
        Mamifero mamifero1 = new Elefante();
        System.out.println("Cota de leite de um elefante " + mamifero1.cotaDiariaLeite());

        Mamifero mamifero2 = new Rato();
        System.out.println("Cota de leite de um rato " + mamifero2.cotaDiariaLeite());
    }
}
