package Aulas;

import java.util.Scanner;

public class EntradaDeDados {
    public static void executar(){
        Scanner sc = new Scanner(System.in);
        String y;
        y = sc.next();
        System.out.println("Você digitou: " + y);
        //sc.close();

        char m;
        m = sc.next().charAt(0);
        System.out.println(m);
        sc.close();
    }
}
