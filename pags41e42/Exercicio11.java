package pags41e42;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Você escolheu a Verificação de um Número Menor que 3! Clique para continuar.");

        System.out.print("Digite um valor (menor que 3): ");
        int num = sc.nextInt();

        if (num > 3) System.out.println("Número maior que 3!");
        else System.out.println("Número é: " + num);

        sc.close();
    }
}
