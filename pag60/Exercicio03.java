package pag60;

public class Exercicio03 {
    public static void main(String[] args) {
        int somados = 0;

        for (int count = 1; count <= 100; count++) {
            somados += count;
        }

        System.out.println("O Somatório dos números de 1 a 100: " + somados);
    }
}
