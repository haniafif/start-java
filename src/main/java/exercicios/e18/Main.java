package exercicios.e18;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        //ARRAY LIST

        ArrayList<String> carros =  new ArrayList<>();

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
