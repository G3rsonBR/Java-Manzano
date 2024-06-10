package pags41e42;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Voc� escolheu o C�lculo das Ra�zes! Clique para continuar.");

        System.out.print("Digite o valor de A: ");
        double a = sc.nextDouble();

        System.out.print("Digite o valor de B: ");
        double b = sc.nextDouble();

        System.out.print("Digite o valor de C: ");
        double c = sc.nextDouble();

        double delta = (b * b) - 4 * a * c;

        if (a != 0) {
            if (delta != 0) {
                if (delta > 0) {
                    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                    System.out.println("Raiz 1: " + x1);
                    System.out.println("Raiz 2: " + x2);
                } else
                    System.out.println("A Equa��o n�o possui ra�zes reais");
            } else {
                double x1 = -b / (2 * a);
                System.out.println("Ambas as ra�zes s�o: " + x1);
            }
        } else
            System.out.println("A = 0, c�lculo n�o poss�vel");

        sc.close();
    }
}
