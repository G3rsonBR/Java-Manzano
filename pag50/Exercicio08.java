package pag50;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        System.out.println("Você escolheu a calculadora de cômodos! Clique para continuar.");

        Scanner sc = new Scanner(System.in);
        int count = 1;
        double area = 0, largura = 0, comprimento = 0, totalArea = 0;
        String vaiContinuar = "";
        String[] comodos = new String[11];
        double[] areas = new double[11];

        System.out.println("Bem-vindo à sua calculadora de cômodos!");

        do {
            System.out.print("Qual o nome do cômodo: ");
            comodos[count] = sc.nextLine();

            System.out.print("Qual o comprimento do(a) " + comodos[count] + ": ");
            comprimento = Double.parseDouble(sc.nextLine());

            System.out.print("Qual a largura do(a) " + comodos[count] + ": ");
            largura = Double.parseDouble(sc.nextLine());

            area = largura * comprimento;
            areas[count] = area;
            totalArea += area;

            System.out.println("Área do cômodo " + comodos[count] + ": " + areas[count]);

            count++;

            System.out.print("Deseja adicionar outro cômodo? (s/n): ");
            vaiContinuar = sc.nextLine();
            if (vaiContinuar.toLowerCase().equals("n")) {
                break;
            }

        } while (vaiContinuar.equals("s"));

        count = 1;
        do {
            if (comodos[count] != null && areas[count] > 0) {
                System.out.println("Cômodo " + comodos[count] + " tem " + areas[count] + " de área.");
            }
            count++;
        } while (count <= 10);

        System.out.println("Área total da casa: " + totalArea);
        System.out.println("Confira os cômodos na ferramenta de desenvolvedor.");
        
        sc.close();
    }
}
