package tratamentoExececao;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a, b;

        try {
            System.out.println("Informe o primeiro valor: ");
            a = ler.nextInt();

            System.out.println("Informe o segundo valor.: ");
            b = ler.nextInt();

            System.out.println("Resultados");
            System.out.println("Soma: " + (a + b));
            System.out.println("Subtração: " + (a - b));
            System.out.println("Multiplicação: " + (a * b));
            System.out.println("Divisão inteira: " + (a % b));
            System.out.println("Divisão exata: " + ((double) a / b));
        } catch (RuntimeException erro) {
            System.out.println("VALOR INVÁLIDO!");
        }
        ler.close();
    }
}
