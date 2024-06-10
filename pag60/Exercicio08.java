package pag60;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        System.out.println("Você escolheu o exercício 54! Clique para continuar.");

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a base: ");
        int base = sc.nextInt();
        System.out.print("Digite o expoente: ");
        int expoente = sc.nextInt();
        
        sc.close();

        int calc = 0;
        for (int count = 0; count <= expoente; count++) {
            if (count == 0) {
                calc = 1;
            } else {
                calc *= base;
            }
            System.out.println(base + " ^ " + count + " = " + calc);
        }
    }
}
