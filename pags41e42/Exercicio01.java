package pags41e42;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Você escolheu o Produto do Maior pelo Menor! Clique para continuar.");

        System.out.print("Digite o primeiro valor: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo valor: ");
        int num2 = sc.nextInt();

        int produto = num1 > num2 ? (num1 - num2) : (num2 - num1);

        System.out.println("O produto do maior pelo menor é: " + produto);

        sc.close();
    }
}
