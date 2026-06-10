package tratamentoExececao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a;
        int b;

        try {
            System.out.println("Informe o primeiro valor: ");
            a = ler.nextInt();

            System.out.println("Informe o segundo valor.: ");
            b = ler.nextInt();


            System.out.println("Resultados");
            System.out.println("Soma: " + (a + b));
            System.out.println("Subtração: " + (a - b));
            System.out.println("Multiplicação: " + (a * b));


            try {
                System.out.println("Divisão inteira: " + (a % b));
                System.out.println("Divisão exata: " + ((double) a / b));
            } catch (ArithmeticException erro) {
                System.out.println("Não é possível dividir por zero");
            }
        } catch (InputMismatchException erro) {
            System.out.println("Digite apenas números");
        }
        ler.close();
    }
}
