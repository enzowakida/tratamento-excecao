package tratamentoExececao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int a[] = new int[2];
        int b[] = new int[2];
        int c[] = new int[4];

        try {
            // Ler vetor 1:
            for (int i = 0; i < 2; i++) {
                System.out.println("Informe o " + i + "° valor..: ");
                a[i] = ler.nextInt();
            }
            // Ler vetor 2:
            for (int i = 0; i < 2; i++) {
                System.out.println("Informe o " + i + "° valor..: ");
                b[i] = ler.nextInt();
            }
            // Juntar vetores:
            for (int i = 0; i < 2; i++) {
                c[i] = a[i];
                c[i + 2] = b[i];
            }
            for (int i = 0; i < 4; i++) {
                System.out.println("Informe o " + i + "° valor..: " + c[i]);
            }
        } catch (InputMismatchException erro) {
            System.out.println("Digite um valor para adicionar ao vetor!");
        }
        ler.close();
    }
}
