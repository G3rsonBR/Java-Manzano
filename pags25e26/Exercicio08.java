package pags25ao26;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do comprimento da caixa: ");
        short comprimento = sc.nextShort();

        System.out.print("Digite o valor da altura da caixa: ");
        short altura = sc.nextShort();

        System.out.print("Digite o valor da largura da caixa: ");
        short largura = sc.nextShort();

        float vol = comprimento * altura * largura;

        System.out.println("O Volume da caixa é: " + vol);

        sc.close();
    }
}
