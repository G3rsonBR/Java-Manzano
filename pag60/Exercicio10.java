package pag60;

public class Exercicio10 {
    public static void main(String[] args) {
        System.out.println("Você escolheu o exercício 56! Clique para continuar.");

        double gFahren;

        for (int gCelsius = 0; gCelsius <= 100; gCelsius += 10) {
            gFahren = (9 * gCelsius + 160) / 5;
            System.out.println(gCelsius + "°C em Graus Fahrenheit: " + gFahren);
        }
    }
}
