package pags41e42;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Voc� escolheu a Verifica��o do Intervalo! Clique para continuar.");

        System.out.print("Digite um valor (de 1 a 9): ");
        int num = sc.nextInt();

        if (num < 1 || num > 9)
            System.out.println("N�mero fora do intervalo permitido");
        else
            System.out.println("N�mero dentro do intervalo permitido");

        sc.close();
    }
}
