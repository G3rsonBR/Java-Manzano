package pags46e47;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Voc� escolheu o C�lculo da �rea de C�modos! Clique para continuar.");

        int count = 0;
        double area, largura, comprimento, totalArea = 0;
        String vaiContinuar = "s";

        String[] comodos = new String[10];
        double[] areas = new double[10];

        System.out.println("Bem-vindo � sua calculadora de c�modos!");

        while (vaiContinuar.equalsIgnoreCase("s")) {
            System.out.print("Qual o nome do C�modo: ");
            comodos[count] = sc.nextLine();

            System.out.print("Qual o comprimento do(a) " + comodos[count] + ": ");
            comprimento = sc.nextDouble();

            System.out.print("Qual a largura do(a) " + comodos[count] + ": ");
            largura = sc.nextDouble();

            area = largura * comprimento;
            areas[count] = area;
            totalArea += area;

            System.out.println("�rea do c�modo " + comodos[count] + ": " + areas[count]);

            count++;

            System.out.print("Deseja adicionar outro c�modo? (s/n): ");
            vaiContinuar = sc.next();

            sc.nextLine(); // Limpar o buffer do teclado

            if (vaiContinuar.equalsIgnoreCase("n")) {
                break;
            }
        }

        count = 0;
        while (count < 10) {
            if (comodos[count] != null && areas[count] > 0) {
                System.out.println("O c�modo " + comodos[count] + " tem " + areas[count] + " de �rea.");
            }
            count++;
        }

        System.out.println("�rea total da casa: " + totalArea);
        System.out.println("Para ver todos os comodos, acesse a ferramenta de desenvolvedor.");

        sc.close();
    }
}
