package pag50;

public class Exercicio04 {
    public static void main(String[] args) {
        System.out.println("Você escolheu o Cálculo da Soma dos Grãos de Xadrez! Clique para continuar.");

        int count = 0;
        long atual = 0;

        do {
            atual += Math.pow(2, count);
            count++;
        } while (count <= 64);

        System.out.println("(Considere o enunciado da questão...)");
        System.out.println("A soma dos números de grãos em um tabuleiro de xadrez é: " + atual);
    }
}
