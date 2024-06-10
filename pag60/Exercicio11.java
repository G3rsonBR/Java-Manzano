package pag60;

public class Exercicio11 {
    public static void main(String[] args) {

        int fatorial = 1;
        int fatorial1;

        for (int count = 1; count <= 10; count += 2) {
            fatorial1 = fatorial;
            fatorial *= count;
            System.out.println(count + " x " + fatorial1 + " = " + fatorial);
        }
    }
}
