package pags25ao26;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Voc� escolheu a Convers�o de D�lares para Reais! Clique para continuar.");

        System.out.print("Digite a cota��o atual do D�lar (em R$): ");
        double cotacao = sc.nextDouble();

        System.out.print("Digite a quantidade de d�lares para convers�o em reais: ");
        double quantidade = sc.nextDouble();

        double valorConvertido = cotacao * quantidade;

        System.out.println("O valor convertido em R$: " + valorConvertido);

        sc.close();
    }
}
