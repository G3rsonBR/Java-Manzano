package pags25ao26;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("Você escolheu o Cálculo da Prestação Atrasada! Clique para continuar.");

        System.out.print("Qual é o valor da prestação atrasada: ");
        short valor = sc.nextShort();

        System.out.print("Qual é a taxa aplicada na prestação atrasada (em %): ");
        short taxa = sc.nextShort();

        System.out.print("Digite a quantos dias ela está em atraso: ");
        short temp = sc.nextShort();

        float prestacao = valor + (valor * taxa / 100) * temp;

        System.out.println("O valor da prestação será: " + df.format(prestacao));

        sc.close();
    }
}
