package tratamentoExececao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int fat = 1, num;

        try {
            System.out.println("Informe o Fatorial: ");
            num = ler.nextInt();

            if (num < 0) {
                System.out.println("Não existe fatorial de número negativo");
                System.exit(0);
            }
            for (int i = 1; i <= num; i++) {
                fat *= i;
            }
            System.out.println("O fatorial de " + num + " é: " + fat);
        } catch (InputMismatchException erro) {
            System.out.println("Digite um valor que possa ser fatorado");
        }
        ler.close();
    }
}
