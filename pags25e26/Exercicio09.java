package pags25ao26;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Voc� escolheu a Diferen�a e o Quadrado! Clique para continuar.");

        System.out.print("Digite o primeiro valor: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo valor: ");
        int num2 = sc.nextInt();

        int diff = num1 - num2;
        int square = diff * diff;

        System.out.println("A diferen�a do primeiro pelo segundo �: " + diff);
        System.out.println("O quadrado da diferen�a �: " + square);

        sc.close();
    }
}
