package pags25ao26;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Você escolheu a Diferença e o Quadrado! Clique para continuar.");

        System.out.print("Digite o primeiro valor: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo valor: ");
        int num2 = sc.nextInt();

        int diff = num1 - num2;
        int square = diff * diff;

        System.out.println("A diferença do primeiro pelo segundo é: " + diff);
        System.out.println("O quadrado da diferença é: " + square);

        sc.close();
    }
}
