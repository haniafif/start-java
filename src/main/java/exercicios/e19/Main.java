package exercicios.e19;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        //ARRAY LIST

        LinkedList<String> carros =  new LinkedList<>();

        carros.add("Audi");
        carros.add("Renaut");
        carros.add("Ferrari");
        carros.add("Fusca");
        carros.add("HB20");
        carros.add("Sandero");

        carros.set(0,"Mitsubishi");

        carros.remove("Sandero");
        System.out.println(carros);
    }
}
