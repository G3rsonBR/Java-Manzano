package pag60;

public class Exercicio09 {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 1;
        int nth;

        for (int count = 0; count <= 15; count++) {
            if (count == 0 || count == 1) {
                nth = 1;
            } else {
                nth = n1 + n2;
                n1 = n2;
                n2 = nth;
            }
            System.out.println(count + "º termo de Fibonacci: " + nth);
        }
    }
}

