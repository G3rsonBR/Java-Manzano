package pags25ao26;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Você escolheu a Conversão de Dólares para Reais! Clique para continuar.");

        System.out.print("Digite a cotação atual do Dólar (em R$): ");
        double cotacao = sc.nextDouble();

        System.out.print("Digite a quantidade de dólares para conversão em reais: ");
        double quantidade = sc.nextDouble();

        double valorConvertido = cotacao * quantidade;

        System.out.println("O valor convertido em R$: " + valorConvertido);

        sc.close();
    }
}
