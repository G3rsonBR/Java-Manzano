package pags41e42;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Você escolheu a Identificação do Maior e Menor Número! Clique para continuar.");

        System.out.print("Digite o valor 1: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o valor 2: ");
        int num2 = sc.nextInt();

        System.out.print("Digite o valor 3: ");
        int num3 = sc.nextInt();

        System.out.print("Digite o valor 4: ");
        int num4 = sc.nextInt();

        System.out.print("Digite o valor 5: ");
        int num5 = sc.nextInt();

        int maior = num1;
        int menor = num1;

        if (num2 > maior) maior = num2;
        else if (num2 < menor) menor = num2;

        if (num3 > maior) maior = num3;
        else if (num3 < menor) menor = num3;

        if (num4 > maior) maior = num4;
        else if (num4 < menor) menor = num4;

        if (num5 > maior) maior = num5;
        else if (num5 < menor) menor = num5;

        System.out.println("O menor é: " + menor);
        System.out.println("O maior é: " + maior);

        sc.close();
    }
}
