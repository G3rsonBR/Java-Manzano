package pags25ao26;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Voc� escolheu o C�lculo de Troca de Valores! Clique para continuar.");

        System.out.print("Digite o primeiro valor: ");
        short a = sc.nextShort();

        System.out.print("Digite o segundo valor: ");
        short b = sc.nextShort();

        short temp = a;
        a = b;
        b = temp;

        System.out.println("Os valores trocados, s�o respectivamente: " + a + ", " + b);

        sc.close();
    }
}
