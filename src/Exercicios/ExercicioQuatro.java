package Exercicios;

import java.util.Scanner;

public class ExercicioQuatro {
    public static void executar() {
        //Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
        //hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais

        Scanner sc = new Scanner(System.in);

        double number, hours, value, salary;

        number = sc.nextDouble();
        hours = sc.nextDouble();
        value = sc.nextDouble();

        salary = hours * value;

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f%n", salary);

        sc.close();
    }
}
