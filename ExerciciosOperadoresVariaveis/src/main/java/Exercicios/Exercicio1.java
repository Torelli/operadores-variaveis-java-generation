package Exercicios;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double salario, abono, novoSalario;

        System.out.println("Digite o salário:");
        salario = leia.nextDouble();

        System.out.println("Digite o abono:");
        abono = leia.nextDouble();

        novoSalario = salario + abono;

        System.out.println("Novo Salário: " +  novoSalario);
    }

}
