package pags46e47;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Você escolheu a Identificação do Menor e Maior Valor! Clique para continuar.");

        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        int valor = 0;
        int count = 0;
        String continuar = "s";

        System.out.println("Você pode digitar quantos valores quiser.\nMas valores negativos encerram!");

        while (continuar.equalsIgnoreCase("s")) {
            System.out.print("Digite o valor: ");
            valor = sc.nextInt();

            if (count == 0) {
                maior = valor;
                menor = valor;
            } else {
                if (valor < 0) {
                    System.out.println("Valor negativo! O programa irá encerrar");
                    continuar = "n";
                } else {
                    if (valor > maior) maior = valor;
                    if (valor < menor) menor = valor;
                }
            }
            count++;
        }

        System.out.println("O menor valor foi: " + menor);
        System.out.println("O maior valor foi: " + maior);
        System.out.println("Último valor digitado: " + valor);

        sc.close();
    }
}
