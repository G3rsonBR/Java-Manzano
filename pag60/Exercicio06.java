package pag60;

public class Exercicio06 {
    public static void main(String[] args) {

        for (int count = 1; count <= 200; count++) {
            if (count % 4 == 0) {
                System.out.println("O número " + count + " é divisível por 4");
            }
        }
    }
}
