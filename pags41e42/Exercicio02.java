package pags41e42;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Voc� escolheu o C�lculo do M�dulo! Clique para continuar.");

        System.out.print("Digite um valor: ");
        int num = sc.nextInt();

        int modulo = num < 0 ? -num : num;

        System.out.println("O m�dulo de " + num + " �: " + modulo);

        sc.close();
    }
}
