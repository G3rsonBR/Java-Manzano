package pags25ao26;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Você escolheu o Cálculo da Soma e do Quadrado! Clique para continuar.");

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double num3 = sc.nextDouble();

        double soma = num1 + num2 + num3;
        double quadradoDaSoma = Math.pow(soma, 2);

        System.out.println("A Soma dos 3 termos: " + soma);
        System.out.println("O Quadrado da Soma: " + quadradoDaSoma);

        sc.close();
    }
}

