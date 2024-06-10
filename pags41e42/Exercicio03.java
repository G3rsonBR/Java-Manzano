package pags41e42;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Você escolheu o Cálculo da Média! Clique para continuar.");

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        System.out.print("Digite a quarta nota: ");
        double nota4 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Média: " + media);
        if (media >= 5)
            System.out.println("Aluno aprovado!");
        else
            System.out.println("Aluno não foi aprovado");

        sc.close();
    }
}
