package Exercicios;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float salarioBruto, adcNoturno, horaExtra, descontos, salarioLiquido;

        System.out.println("Digite o salário bruto");
        salarioBruto = input.nextFloat();

        System.out.println("Digite o adicional noturno");
        adcNoturno = input.nextFloat();

        System.out.println("Digite as Horas Extras");
        horaExtra = input.nextFloat();

        System.out.println("Digite os descontos");
        descontos = input.nextFloat();

        salarioLiquido = (salarioBruto + adcNoturno + (horaExtra * 5)) - descontos;

        System.out.println("Salário Líquido: " + salarioLiquido);



    }

}
