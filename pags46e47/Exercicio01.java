package pags46e47;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Você escolheu a Tabuada de um Número! Clique para continuar.");

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        System.out.println("Tabuada do número digitado:");
        int mult = 1;
        while (mult <= 10) {
            System.out.println(num + " x " + mult + " = " + (num * mult));
            mult++;
        }

        sc.close();
    }
}
