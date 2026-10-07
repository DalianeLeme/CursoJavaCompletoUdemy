package Aulas;

public class SaidaDeDados {
    public static void executar(){
        double x = 10.35784;
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.00;

        System.out.println(x);
        System.out.printf("&.2f%n", x); // 2 casas decimais
        System.out.printf("&.4f%n", x); // 4 casas decimais
        System.out.println("Resultado = " + x + "Metros");
        System.out.printf("Resultado = %.2f metros%n", x);
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
    }
}
