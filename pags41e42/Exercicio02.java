package pags41e42;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Você escolheu o Cálculo do Módulo! Clique para continuar.");

        System.out.print("Digite um valor: ");
        int num = sc.nextInt();

        int modulo = num < 0 ? -num : num;

        System.out.println("O módulo de " + num + " é: " + modulo);

        sc.close();
    }
}
