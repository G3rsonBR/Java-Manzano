package pags25ao26;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Voc� escolheu a Convers�o de Reais para D�lares! Clique para continuar.");

        System.out.print("Digite a cota��o atual do D�lar (em R$): ");
        double cotacao = sc.nextDouble();

        System.out.print("Digite a quantidade de reais para convers�o em d�lares: ");
        double quantidade = sc.nextDouble();

        double valorConvertido = quantidade / cotacao;

        System.out.println("O valor convertido em US$: " + valorConvertido);

        sc.close();
    }
}
