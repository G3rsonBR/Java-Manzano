package pags41e42;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Você escolheu a Verificação de Números Divisíveis por 2 e 3! Clique para continuar.");

        System.out.print("Digite o valor 1: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o valor 2: ");
        double num2 = sc.nextDouble();

        System.out.print("Digite o valor 3: ");
        double num3 = sc.nextDouble();

        System.out.print("Digite o valor 4: ");
        double num4 = sc.nextDouble();

        String divisibles = "Os números divisíveis por 2 e 3 são:\n";

        if (num1 % 2 == 0 && num1 % 3 == 0) divisibles += (int) num1 + "\n";
        if (num2 % 2 == 0 && num2 % 3 == 0) divisibles += (int) num2 + "\n";
        if (num3 % 2 == 0 && num3 % 3 == 0) divisibles += (int) num3 + "\n";
        if (num4 % 2 == 0 && num4 % 3 == 0) divisibles += (int) num4 + "\n";

        System.out.println(divisibles);

        sc.close();
    }
}
