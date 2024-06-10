package pags46e47;

public class Exercicio07 {
    public static void main(String[] args) {
        System.out.println("Você escolheu a Sequência de Fibonacci! Clique para continuar.");

        int n1 = 0, n2 = 1, count = 0, nth;

        while (count < 15) {
            if (count == 0) {
                nth = 0;
            } else if (count == 1) {
                nth = 1;
            } else {
                nth = n1 + n2;
                n1 = n2;
                n2 = nth;
            }
            System.out.println("Passo " + (count + 1) + "º: " + nth);
            count++;
        }
    }
}
