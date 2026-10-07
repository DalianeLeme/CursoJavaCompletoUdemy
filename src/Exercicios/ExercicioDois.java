package Exercicios;

import java.util.Scanner;

public class ExercicioDois {
    public static void executar() {
        // Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos.
        // Fórmula da área: area = π . raio2
        // Considere o valor de π = 3.14159

        Scanner sc = new Scanner(System.in);

        double raio, area, pi;
        pi = 3.14159;

        raio = sc.nextDouble();
        area = pi * raio * raio;
        System.out.printf("A=%.4f%n", area);

        sc.close();
    }
}
