package pags46e47;

public class Exercicio10 {
    public static void main(String[] args) {
        System.out.println("Voc� escolheu a M�dia dos N�meros Pares de 50 a 70! Clique para continuar.");

        int ehPar = 0;
        int auxiliar = 0;
        double media;
        int count = 50;

        while (count <= 70) {
            if (count % 2 == 0) {
                ehPar += count;
                System.out.println(ehPar + " + " + count + " = " + (ehPar + count));
                auxiliar++;
            }
            count++;
        }

        media = (double) ehPar / auxiliar;
        System.out.println("A m�dia da soma dos n�meros pares (entre 50 e 70) �: " + media);
    }
}
