package pag50;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        System.out.println("Voc� escolheu o C�lculo do Somat�rio dos Fatoriais de 15 N�meros! Clique para continuar.");

        Scanner sc = new Scanner(System.in);
        int count = 0;
        int valor, somatorio = 0, fatorial;

        do {
            count++;
            System.out.print("Digite o " + count + "� valor: ");
            valor = sc.nextInt();

            fatorial = valor;
            for (int i = valor - 1; i > 1; i--) {
                fatorial *= i;
            }

            somatorio += fatorial;
        } while (count < 15);

        System.out.println("O somat�rio de todos os fatoriais dos n�meros solicitados �: " + somatorio);

        sc.close();
    }
}
