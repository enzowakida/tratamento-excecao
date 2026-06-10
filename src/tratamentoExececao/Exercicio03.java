package tratamentoExececao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double x;

        System.out.println("Digite uma nota: ");

        try {
            x = ler.nextDouble();

            if (x >= 6) {
                System.out.println("Você está aprovado");
            } else if (x < 6 && x >= 4) {
                System.out.println("Exame");
            } else {
                System.out.println("Reprovado");
            }
        } catch (InputMismatchException erro) {
            System.out.println("Valor da nota incorreto");
        }
        ler.close();

    }
}
