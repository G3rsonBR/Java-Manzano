package pag50;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        System.out.println("Voc� escolheu a calculadora de c�modos! Clique para continuar.");

        Scanner sc = new Scanner(System.in);
        int count = 1;
        double area = 0, largura = 0, comprimento = 0, totalArea = 0;
        String vaiContinuar = "";
        String[] comodos = new String[11];
        double[] areas = new double[11];

        System.out.println("Bem-vindo � sua calculadora de c�modos!");

        do {
            System.out.print("Qual o nome do c�modo: ");
            comodos[count] = sc.nextLine();

            System.out.print("Qual o comprimento do(a) " + comodos[count] + ": ");
            comprimento = Double.parseDouble(sc.nextLine());

            System.out.print("Qual a largura do(a) " + comodos[count] + ": ");
            largura = Double.parseDouble(sc.nextLine());

            area = largura * comprimento;
            areas[count] = area;
            totalArea += area;

            System.out.println("�rea do c�modo " + comodos[count] + ": " + areas[count]);

            count++;

            System.out.print("Deseja adicionar outro c�modo? (s/n): ");
            vaiContinuar = sc.nextLine();
            if (vaiContinuar.toLowerCase().equals("n")) {
                break;
            }

        } while (vaiContinuar.equals("s"));

        count = 1;
        do {
            if (comodos[count] != null && areas[count] > 0) {
                System.out.println("C�modo " + comodos[count] + " tem " + areas[count] + " de �rea.");
            }
            count++;
        } while (count <= 10);

        System.out.println("�rea total da casa: " + totalArea);
        System.out.println("Confira os c�modos na ferramenta de desenvolvedor.");
        
        sc.close();
    }
}
