package pag50;

public class Exercicio01 {
    public static void main(String[] args) {
        System.out.println("Voc� escolheu o C�lculo do Quadrado dos N�meros de 15 a 200! Clique para continuar.");

        int contadora = 15;

        System.out.println("Exibindo o quadrado dos n�meros de 15 a 200:");
        do {
            System.out.println("O n�mero " + contadora + " ao quadrado �: " + (contadora * contadora));
            contadora++;
        } while (contadora <= 200);

    }
}

