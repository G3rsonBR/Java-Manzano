package pag50;

public class Exercicio03 {
    public static void main(String[] args) {
        System.out.println("Voc� escolheu a Identifica��o de N�meros Divis�veis por 4 de 1 a 200! Clique para continuar.");

        int count = 0;

        System.out.println("Exibindo os n�meros divis�veis por 4 de 1 a 200:");
        do {
            count++;
            if (count % 4 == 0) System.out.println("O n�mero " + count + " � divis�vel por 4");
        } while (count <= 200);

    }
}
