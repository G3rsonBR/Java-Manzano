package pag50;

public class Exercicio03 {
    public static void main(String[] args) {
        System.out.println("Você escolheu a Identificação de Números Divisíveis por 4 de 1 a 200! Clique para continuar.");

        int count = 0;

        System.out.println("Exibindo os números divisíveis por 4 de 1 a 200:");
        do {
            count++;
            if (count % 4 == 0) System.out.println("O número " + count + " é divisível por 4");
        } while (count <= 200);

    }
}
