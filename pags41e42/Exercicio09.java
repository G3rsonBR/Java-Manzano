package pags41e42;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int num = sc.nextInt();

        if (num % 2 == 0)
            System.out.println("O valor é par");
        else
            System.out.println("O valor é ímpar");

        sc.close();
    }
}
