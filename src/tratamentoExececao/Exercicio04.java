package tratamentoExececao;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double v1, v2, v3;

        try {
            System.out.println("Informe o valor 1: ");
            v1 = ler.nextDouble();
            System.out.println("Informe o valor 2: ");
            v2 = ler.nextDouble();
            System.out.println("Informe o valor 3: ");
            v3 = ler.nextDouble();

            if (v1 == v2 && v1 == v3) {
                System.out.println("Todos iguais");
            } else if (v1 > v2 && v1 > v3) {
                System.out.println("O 1° Valor é o maior " + v1);
            } else if (v2 > v3) {
                System.out.println("O 2° valor é o maior " + v2);
            } else {
                System.out.println("O 3° valor é o maior " + v3);
            }
        } catch (RuntimeException erro) {
            System.out.println("O valor deve ser numérico e com vírgula");
        }
        ler.close();
    }
}
