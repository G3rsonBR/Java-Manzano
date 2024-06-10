package pags25ao26;

import java.util.Scanner;
public class Exercicio01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double grausC = sc.nextDouble();
        
        double conversao = (9 * grausC + 160) / 5;

        System.out.println("Em Fahrenheit fica: " + conversao);

        sc.close();

	}

}
