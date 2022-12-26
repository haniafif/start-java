package exercicios.e15;
public class Main {
    public static void main(String[] args){
        // ARRAY

        String[] paises= new String[5];

        paises[0] = "Alemanha";
        paises[1] = "Brasil";
        paises[2] = "Argentina";
        paises[3] = "Noruega";
        paises[4] = "Russia";

        for(String pais: paises){
            System.out.println(pais);
        }
    }
}
