package pag50;

public class Exercicio04 {
    public static void main(String[] args) {
        System.out.println("Voc� escolheu o C�lculo da Soma dos Gr�os de Xadrez! Clique para continuar.");

        int count = 0;
        long atual = 0;

        do {
            atual += Math.pow(2, count);
            count++;
        } while (count <= 64);

        System.out.println("(Considere o enunciado da quest�o...)");
        System.out.println("A soma dos n�meros de gr�os em um tabuleiro de xadrez �: " + atual);
    }
}
