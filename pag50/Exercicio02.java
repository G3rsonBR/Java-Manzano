package pag50;

public class Exercicio02 {
    public static void main(String[] args) {
        System.out.println("Voc� escolheu o C�lculo da Soma dos N�meros Pares de 1 a 500! Clique para continuar.");

        int contadora = 1;
        int somados = 0;

        do {
            if (contadora % 2 == 0) somados += contadora;
            contadora++;
        } while (contadora <= 500);

        System.out.println("O valor da soma dos pares de 1 a 500 �: " + somados);
    }
}

