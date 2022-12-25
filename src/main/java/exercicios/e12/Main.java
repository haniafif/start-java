package exercicios.e12;


public class Main {
    public static void main(String[] args){
        Fisica fis = new Fisica();
        fis.nome =  "joao";
        fis.cpf = "131313";
        fis.situacaoPessoa = "A";
        fis.identidade = "12134134";


        Juridica jur = new Juridica();
        jur.nome =  "joao";
        jur.cnpj =  "9399393";
        jur.situacaoPessoa = "I";
        jur.inscEstadual = "123123";

        System.out.println("Dados da pessoa fisica" + fis.toString());

        System.out.println("Dados da pessoa juridica" + jur.toString());



    }
}
