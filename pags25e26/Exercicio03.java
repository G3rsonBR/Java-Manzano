package pags25ao26;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("Você escolheu o Volume da Lata de Óleo! Clique para continuar.");

        System.out.print("Digite a altura da Lata de óleo (em cm): ");
        double altura = sc.nextDouble();

        System.out.print("Digite o raio da Lata de óleo (em cm): ");
        double raio = sc.nextDouble();

        double pii = 3.14;
        double vol = pii * Math.pow(raio, 2) * altura;

        System.out.println("O Volume é: " + df.format(vol) + " cm³");

        sc.close();
    }
}


