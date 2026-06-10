package tratamentoExececao;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double x;

        try {
            System.out.println("Digite uma nota: ");
            x = ler.nextDouble();

            if (x >= 6) {
                System.out.println("Você está aprovado");
            } else if (x < 6 && x >= 4) {
                System.out.println("Exame");
            } else {
                System.out.println("Reprovado");
            }
        } catch (RuntimeException erro) {
            System.out.println("O valor deve ser numérico e com vírgula");
        }
        ler.close();

    }
}
