package pag50;

public class Exercicio07 {
    public static void main(String[] args) {
        System.out.println("Voc� escolheu o C�lculo do Fatorial dos N�meros �mpares entre 1 e 10! Clique para continuar.");

        int count = 1;
        int fatorial = 1;

        do {
            if (count % 2 == 1) {
                fatorial *= count;
            }
            count++;
        } while (count <= 10);

        System.out.println("Fatorial dos n�meros �mpares entre 1 e 10: " + fatorial);
    }
}
