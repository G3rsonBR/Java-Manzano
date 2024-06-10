package pags25ao26;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double grausF = sc.nextDouble();

        double conversao = (grausF - 32) / 1.8;

        System.out.println("Em Celsius fica: " + conversao);

        sc.close();
    }
}
