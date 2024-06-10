package pags25ao26;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Você escolheu o Cálculo de Somas e Multiplicações! Clique para continuar.");

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
            "A soma de A com B é: %d\n" +
            "A soma de A com C é: %d\n" +
            "A soma de A com D é: %d\n" +
            "A soma de B com C é: %d\n" +
            "A soma de B com D é: %d\n" +
            "A soma de C com D é: %d\n",
            a + b, a + c, a + d, b + c, b + d, c + d
        );

        // Resultados das multiplicações
        String multResults = String.format(
            "Resultados Das Multiplicações:\n" +
            "A multiplicação de A com B é: %d\n" +
            "A multiplicação de A com C é: %d\n" +
            "A multiplicação de A com D é: %d\n" +
            "A multiplicação de B com C é: %d\n" +
            "A multiplicação de B com D é: %d\n" +
            "A multiplicação de C com D é: %d\n",
            a * b, a * c, a * d, b * c, b * d, c * d
        );

        System.out.println(plusResults + "\n" + multResults);

        sc.close();
    }
}
