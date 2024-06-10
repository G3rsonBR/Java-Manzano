package pag50;

public class Exercicio01 {
    public static void main(String[] args) {
        System.out.println("Você escolheu o Cálculo do Quadrado dos Números de 15 a 200! Clique para continuar.");

        int contadora = 15;

        System.out.println("Exibindo o quadrado dos números de 15 a 200:");
        do {
            System.out.println("O número " + contadora + " ao quadrado é: " + (contadora * contadora));
            contadora++;
        } while (contadora <= 200);

    }
}

