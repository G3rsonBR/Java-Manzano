package pags41e42;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Você escolheu a Verificação do Intervalo! Clique para continuar.");

        System.out.print("Digite um valor (de 1 a 9): ");
        int num = sc.nextInt();

        if (num < 1 || num > 9)
            System.out.println("Número fora do intervalo permitido");
        else
            System.out.println("Número dentro do intervalo permitido");

        sc.close();
    }
}
