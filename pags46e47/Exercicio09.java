package pags46e47;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Voc� escolheu o C�lculo da M�dia de 10 N�meros! Clique para continuar.");

        double valor, somatoria = 0;
        int count = 1;

        while (count <= 10) {
            System.out.print("Digite o " + count + "� valor: ");
            valor = sc.nextDouble();
            somatoria += valor;
            count++;
        }

        System.out.println("A m�dia da soma de todos os valores passados: " + (somatoria / 10));

        sc.close();
    }
}
