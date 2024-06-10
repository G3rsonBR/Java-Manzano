package pag60;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        for (int count = 1; count <= 10; count++) {
            System.out.println(num + " x " + count + " = " + (num * count));
        }
        
        sc.close();
    }
}
