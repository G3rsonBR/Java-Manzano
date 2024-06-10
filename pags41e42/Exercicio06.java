package pags41e42;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Você escolheu a Ordenação de Três Números! Clique para continuar.");

        System.out.print("Digite o valor de A: ");
        double a = sc.nextDouble();

        System.out.print("Digite o valor de B: ");
        double b = sc.nextDouble();

        System.out.print("Digite o valor de C: ");
        double c = sc.nextDouble();

        String order = "";

        if (a > b && a > c) {
            order = (b > c) ? (c + ", " + b + ", " + a) : (b + ", " + c + ", " + a);
        } else if (b > a && b > c) {
            order = (a > c) ? (c + ", " + a + ", " + b) : (a + ", " + c + ", " + b);
        } else if (c > a && c > b) {
            order = (b > a) ? (a + ", " + b + ", " + c) : (b + ", " + a + ", " + c);
        }

        System.out.println("Em ordem: " + order);

        sc.close();
    }
}
