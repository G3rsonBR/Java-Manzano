package pags41e42;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Voc� escolheu a Sauda��o por G�nero! Clique para continuar.");

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite seu sexo (M/F): ");
        String sexo = sc.nextLine();

        if (sexo.equalsIgnoreCase("M"))
            System.out.println("Ilmo Sr. " + nome);
        else if (sexo.equalsIgnoreCase("F"))
            System.out.println("Ilma Sra.: " + nome);
        else
            System.out.println("Op��o inv�lida");

        sc.close();
    }
}
