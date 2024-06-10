package pags25ao26;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("Voc� escolheu o C�lculo da Presta��o Atrasada! Clique para continuar.");

        System.out.print("Qual � o valor da presta��o atrasada: ");
        short valor = sc.nextShort();

        System.out.print("Qual � a taxa aplicada na presta��o atrasada (em %): ");
        short taxa = sc.nextShort();

        System.out.print("Digite a quantos dias ela est� em atraso: ");
        short temp = sc.nextShort();

        float prestacao = valor + (valor * taxa / 100) * temp;

        System.out.println("O valor da presta��o ser�: " + df.format(prestacao));

        sc.close();
    }
}
