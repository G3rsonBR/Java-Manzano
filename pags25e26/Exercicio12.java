package pags25ao26;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Você escolheu o Cálculo dos Quadrados! Clique para continuar.");

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double num3 = sc.nextDouble();

        double quadradoNum1 = Math.pow(num1, 2);
        double quadradoNum2 = Math.pow(num2, 2);
        double quadradoNum3 = Math.pow(num3, 2);

        double somaQuadrados = quadradoNum1 + quadradoNum2 + quadradoNum3;

        System.out.println("O Quadrado do primeiro: " + quadradoNum1);
        System.out.println("O Quadrado do segundo: " + quadradoNum2);
        System.out.println("O Quadrado do terceiro: " + quadradoNum3);
        System.out.println("A Soma dos Quadrados: " + somaQuadrados);

        sc.close();
    }
}
