import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CentralDeExercicios {
    private final Map<String, Runnable> exercicios;

    public CentralDeExercicios(Map<String, Runnable> exercicios) {
        this.exercicios = exercicios;
    }

    public void selecionarEExecutar() {
        List<String> titulos = new ArrayList<>(exercicios.keySet());
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== MENU DE EXERCÍCIOS =====");
            for (int i = 0; i < titulos.size(); i++) {
                System.out.printf("%d - %s%n", i + 1, titulos.get(i));
            }
            System.out.println("0 - Sair");
            System.out.print("Escolha um exercício: ");

            String entrada = scanner.nextLine().trim();

            int opcao;
            try {
                opcao = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Digite um número válido.");
                continue;
            }

            if (opcao == 0) {
                System.out.println("Até mais!");
                break;
            }

            if (opcao < 1 || opcao > titulos.size()) {
                System.out.println("Opção inexistente.");
                continue;
            }

            String titulo = titulos.get(opcao - 1);
            System.out.println("\n>>> " + titulo + "\n");
            exercicios.get(titulo).run();
        }

        scanner.close();
    }
}
