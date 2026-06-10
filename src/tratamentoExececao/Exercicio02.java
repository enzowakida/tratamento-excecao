package tratamentoExececao;

import java.util.ArrayList;

public class Exercicio02 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        try {
            nomes.add("Alice");
            nomes.add("Bob");
            nomes.add("Charlie");

            System.out.println("Nome: " + nomes.get(5));
        } catch(IndexOutOfBoundsException erro) {
            System.out.println("Quantidade de nomes incorreta");
        }


    }
}
