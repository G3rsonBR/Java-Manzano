package pags46e47;

public class Exercicio04 {
    public static void main(String[] args) {
        System.out.println("Voc� escolheu a Identifica��o dos N�meros �mpares de 1 a 20! Clique para continuar.");

        int count = 1;

        while (count <= 20) {
            if (count % 2 == 1) {
                System.out.println(count + " � �mpar");
            }
            count++;
        }

    }
}
