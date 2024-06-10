package pags46e47;

public class Exercicio03 {
    public static void main(String[] args) {
        System.out.println("Você escolheu a Soma dos Números Pares de 1 a 500! Clique para continuar.");

        int count = 1;
        int soma = 0;

        while (count <= 500) {
            if (count % 2 == 0) {
                System.out.println(soma + " + " + count + " = " + (soma + count));
                soma += count;
            }
            count++;
        }

        System.out.println("A soma dos pares de 1 a 500: " + soma);
    }
}
