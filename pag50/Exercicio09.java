package pag50;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o dividendo: ");
        int dividendo = sc.nextInt();

        System.out.print("Digite o divisor: ");
        int divisor = sc.nextInt();

        int count = 0;

        while (dividendo >= divisor) {
            dividendo -= divisor;
            count++;
        }

        System.out.println("A parte inteira da divisão é: " + count);
        sc.close();
    }
}

