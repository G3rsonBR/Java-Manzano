package pags46e47;

public class Exercicio02 {
    public static void main(String[] args) {
        System.out.println("Voc� escolheu a Soma dos Primeiros 100 N�meros! Clique para continuar.");

        int count = 1;
        int soma = 0;

        while (count <= 100) {
            System.out.println(soma + " + " + count + " = " + (soma + count));
            soma += count;
            count++;
        }

    }
}
