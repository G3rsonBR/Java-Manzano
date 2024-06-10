package pags25ao26;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Voc� escolheu o C�lculo de Somas e Multiplica��es! Clique para continuar.");

        System.out.print("Digite o valor de A: ");
        short a = sc.nextShort();

        System.out.print("Digite o valor de B: ");
        short b = sc.nextShort();

        System.out.print("Digite o valor de C: ");
        short c = sc.nextShort();

        System.out.print("Digite o valor de D: ");
        short d = sc.nextShort();

        // Resultados das somas
        String plusResults = String.format(
            "Resultados Das Somas:\n" +
            "A soma de A com B �: %d\n" +
            "A soma de A com C �: %d\n" +
            "A soma de A com D �: %d\n" +
            "A soma de B com C �: %d\n" +
            "A soma de B com D �: %d\n" +
            "A soma de C com D �: %d\n",
            a + b, a + c, a + d, b + c, b + d, c + d
        );

        // Resultados das multiplica��es
        String multResults = String.format(
            "Resultados Das Multiplica��es:\n" +
            "A multiplica��o de A com B �: %d\n" +
            "A multiplica��o de A com C �: %d\n" +
            "A multiplica��o de A com D �: %d\n" +
            "A multiplica��o de B com C �: %d\n" +
            "A multiplica��o de B com D �: %d\n" +
            "A multiplica��o de C com D �: %d\n",
            a * b, a * c, a * d, b * c, b * d, c * d
        );

        System.out.println(plusResults + "\n" + multResults);

        sc.close();
    }
}
