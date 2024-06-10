package pag50;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        System.out.println("Voc� escolheu o C�lculo da Soma e M�dia de Valores at� Digitar um Negativo! Clique para continuar.");

        Scanner sc = new Scanner(System.in);
        int count = 1;
        double valor, somatorio = 0, media = 0;

        System.out.println("Voc� poder� digitar quantos valores quiser, mas se for negativo, o programa encerra.");

        do {
            System.out.print("Digite o " + count + "� valor: ");
            valor = sc.nextDouble();

            if (valor >= 0) {
                somatorio += valor;
                count++;
            } else {
                System.out.println("Valor digitado � negativo. Encerrando o programa.");
            }

        } while (valor >= 0);

        if (count > 1) {
            media = somatorio / (count - 1);
        }

        System.out.println("Soma de todos os valores: " + somatorio);
        System.out.println("M�dia da soma: " + media);
        System.out.println("Quantidade de elementos: " + (count - 1));

        sc.close();
    }
}
