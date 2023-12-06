package Exercicios;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] numeros = new float[4];
        float calculo;

        for(int i = 0; i < 4; i++) {
            System.out.println("Digite o número " + (i + 1));
            numeros[i] = input.nextFloat();
        }

        calculo = (numeros[0] * numeros[1]) - (numeros[2] * numeros[3]);

        System.out.println("Diferença: " + calculo);
    }

}
