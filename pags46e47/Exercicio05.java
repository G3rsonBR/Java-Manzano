package pags46e47;

public class Exercicio05 {
    public static void main(String[] args) {
        System.out.println("Você escolheu a Potência de 3 até 15! Clique para continuar.");

        int calc = 0;
        int count = 0;
        final int base = 3;

        while (count <= 15) {
            if (count == 0) {
                calc = 1;
            } else {
                calc *= base;
                System.out.println(base + "^" + count + " = " + calc);
            }
            count++;
        }
    }
}
