package pag60;

public class Exercicio07 {
    public static void main(String[] args) {
        System.out.println("Você escolheu o exercício 53! Clique para continuar.");

        int base = 3;
        int calc = 0;

        for (int count = 0; count <= 15; count++) {
            if (count == 0) {
                calc = 1;
            } else {
                calc *= base;
                System.out.println(base + " ^ " + count + " = " + calc);
            }
        }
    }
}
