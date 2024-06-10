package pag50;

public class Exercicio07 {
    public static void main(String[] args) {
        System.out.println("Você escolheu o Cálculo do Fatorial dos Números Ímpares entre 1 e 10! Clique para continuar.");

        int count = 1;
        int fatorial = 1;

        do {
            if (count % 2 == 1) {
                fatorial *= count;
            }
            count++;
        } while (count <= 10);

        System.out.println("Fatorial dos números ímpares entre 1 e 10: " + fatorial);
    }
}
