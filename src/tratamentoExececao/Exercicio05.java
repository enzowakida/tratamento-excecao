package tratamentoExececao;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int qtdeAcerto, totalAlunos = 0, somaAcertos = 0;
        String resp;
        String continua = "S";

        while(continua.equals("s") || continua.equals("S")) {
                System.out.println(" ##### Informe o Gabarito ##### ");
                qtdeAcerto = 0;

                System.out.println("Informe a questão I: ");
                resp = ler.next();
                if (resp.equals("A")) {
                    qtdeAcerto++;
                }

                System.out.println("Informe a questão II: ");
                resp = ler.next();
                if (resp.equals("B")) {
                    qtdeAcerto++;
                }

                System.out.println("Informe a questão III: ");
                resp = ler.next();
                if (resp.equals("C")) {
                    qtdeAcerto++;
                }
                somaAcertos = somaAcertos + qtdeAcerto;
                totalAlunos += 1;

                System.out.println("Deseja Continuar? S ou N ");
                continua = ler.next();

        }
        System.out.println("Total de acertos: " + somaAcertos);
        System.out.println("O total de alunos é: " + totalAlunos);
        ler.close();
    }
}
