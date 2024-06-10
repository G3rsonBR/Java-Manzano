package pags46e47;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Você escolheu a Potenciação de um Número! Clique para continuar.");

        System.out.print("Digite a Base: ");
        int valor = sc.nextInt();

        System.out.print("Digite o Expoente: ");
        int expoente = sc.nextInt();

        int count = 0;
        int elevado = 1;

        while (count <= expoente) {
            if (count == 0) {
                elevado = 1;
            } else {
                elevado *= valor;
            }
            System.out.println(valor + " elevado a " + count + ": " + elevado);
            count++;
        }

        sc.close();
    }
}
