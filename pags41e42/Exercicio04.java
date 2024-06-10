package pags41e42;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Você escolheu a Verificação da Média! Clique para continuar.");

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        System.out.print("Digite a quarta nota: ");
        double nota4 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7)
            System.out.println("Aluno aprovado!");
        else {
            System.out.print("Digite a nota de Exame: ");
            double exam = sc.nextDouble();

            media = (media + exam) / 2;
            if (media >= 5)
                System.out.println("Aluno em Exame!");
            else
                System.out.println("Aluno não foi Aprovado");
        }

        System.out.println("Média: " + media);

        sc.close();
    }
}
