package Exercicios;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float notas[] = new float[4];
        float media = 0;

        for (int i = 0; i < 4; i++) {
            System.out.println("Digite a nota " + (i + 1));
            notas[i] = input.nextFloat();
            media += notas[i];
        }

        media /= 4;

        System.out.println("Média final: " + String.format("%.1f", media));



    }

}
