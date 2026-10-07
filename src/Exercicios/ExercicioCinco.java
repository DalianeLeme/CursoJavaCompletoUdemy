package Exercicios;

import java.util.Scanner;

public class ExercicioCinco {
    public static void executar() {
        // Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
        // código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

        Scanner sc = new Scanner(System.in);

        double cod1, valor1, qtd1, valorTotal;
        double cod2, valor2, qtd2;

        cod1 = sc.nextInt();
        qtd1 = sc.nextInt();
        valor1 = sc.nextDouble();

        cod2 = sc.nextInt();
        qtd2 = sc.nextInt();
        valor2 = sc.nextDouble();

        valorTotal = valor1 * qtd1 + valor2 * qtd2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);

        sc.close();
    }
}
