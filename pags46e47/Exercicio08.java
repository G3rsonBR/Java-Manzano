package pags46e47;

public class Exercicio08 {
    public static void main(String[] args) {
        System.out.println("Você escolheu a Conversão de Graus Celsius para Fahrenheit! Clique para continuar.");

        int gCelsius = 10;
        int count = 0;

        while (count < 10) {
            double gFahren = (9 * gCelsius + 160) / 5.0;
            System.out.println(gCelsius + "º em Fahrenheit: " + gFahren);

            gCelsius += 10;
            count++;
        }

    }
}

