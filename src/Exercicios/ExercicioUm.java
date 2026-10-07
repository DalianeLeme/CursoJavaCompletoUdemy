package Exercicios;

import java.util.Scanner;

public class ExercicioUm {
    public static void executar() {

        //Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa, conforme exemplos.
        Scanner sc = new Scanner(System.in);

        int x, y, soma;
        x = sc.nextInt();
        y = sc.nextInt();

        soma = x + y;

        System.out.printf("Soma = ", soma);

        sc.close();
    }
}
