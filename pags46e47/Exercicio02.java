package pags46e47;

public class Exercicio02 {
    public static void main(String[] args) {
        System.out.println("Você escolheu a Soma dos Primeiros 100 Números! Clique para continuar.");

        int count = 1;
        int soma = 0;

        while (count <= 100) {
            System.out.println(soma + " + " + count + " = " + (soma + count));
            soma += count;
            count++;
        }

    }
}
