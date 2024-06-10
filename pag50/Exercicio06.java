package pag50;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        System.out.println("Você escolheu o Cálculo da Soma e Média de Valores até Digitar um Negativo! Clique para continuar.");

        Scanner sc = new Scanner(System.in);
        int count = 1;
        double valor, somatorio = 0, media = 0;

        System.out.println("Você poderá digitar quantos valores quiser, mas se for negativo, o programa encerra.");

        do {
            System.out.print("Digite o " + count + "º valor: ");
            valor = sc.nextDouble();

            if (valor >= 0) {
                somatorio += valor;
                count++;
            } else {
                System.out.println("Valor digitado é negativo. Encerrando o programa.");
            }

        } while (valor >= 0);

        if (count > 1) {
            media = somatorio / (count - 1);
        }

        System.out.println("Soma de todos os valores: " + somatorio);
        System.out.println("Média da soma: " + media);
        System.out.println("Quantidade de elementos: " + (count - 1));

        sc.close();
    }
}
