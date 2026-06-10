package tratamentoExececao;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int fat = 1, num = 0;

        try {
            System.out.println("Informe o Fatorial: ");
            num = ler.nextInt();
        } catch (ArithmeticException erro) {
            System.out.println("O valor digitado deve ser um número inteiro");
        }

        if (num < 0) {
            System.out.println("Não existe fatorial de número negativo");
            System.exit(0);
        }
        for (int i = 1; i <= num; i++) {
            fat *= i;
        }
        System.out.println("O fatorial de " + num + " é: " + fat);
        ler.close();
    }
}
