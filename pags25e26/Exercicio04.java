package pags25ao26;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("Você escolheu o Cálculo da Viagem! Clique para continuar.");

        System.out.print("Digite quanto tempo levou a viagem (em horas): ");
        short temp = sc.nextShort();

        System.out.print("Digite qual era a velocidade média no veículo (em KM/h): ");
        short velocidade = sc.nextShort();

        float distancia = temp * velocidade;
        float litrosUsados = distancia / 12;

        System.out.println("Tempo da viagem: " + df.format(temp) + " horas");
        System.out.println("Velocidade média: " + df.format(velocidade) + " KM/h");
        System.out.println("Distância percorrida: " + df.format(distancia) + " KM");
        System.out.println("Litros usados: " + df.format(litrosUsados) + " L");

        sc.close();
    }
}
