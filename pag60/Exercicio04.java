package pag60;

public class Exercicio04 {
    public static void main(String[] args) {
        System.out.println("Voc� escolheu o exerc�cio 50! Clique para continuar.");

        int somados = 0;

        for (int count = 1; count <= 500; count++) {
            if (count % 2 == 0) {
                somados += count;
            }
        }

        System.out.println("O Somat�rio dos pares de 1 a 500: " + somados);
    }
}

