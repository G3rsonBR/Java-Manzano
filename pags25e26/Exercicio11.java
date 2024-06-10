package pags25ao26;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Você escolheu a Conversão de Reais para Dólares! Clique para continuar.");

        System.out.print("Digite a cotação atual do Dólar (em R$): ");
        double cotacao = sc.nextDouble();

        System.out.print("Digite a quantidade de reais para conversão em dólares: ");
        double quantidade = sc.nextDouble();

        double valorConvertido = quantidade / cotacao;

        System.out.println("O valor convertido em US$: " + valorConvertido);

        sc.close();
    }
}
