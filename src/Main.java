import Aulas.EntradaDeDados;
import Aulas.FuncoesMatematicas;
import Aulas.HelloWorld;
import Aulas.SaidaDeDados;
import Exercicios.*;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Runnable> exercicios = new LinkedHashMap<>();

        // Aulas
        exercicios.put("Primeiro Programa", HelloWorld::executar);
        exercicios.put("Saída de dados", SaidaDeDados::executar);
        exercicios.put("Entrada de dados", EntradaDeDados::executar);
        exercicios.put("Operações Matematicas", FuncoesMatematicas::executar);

        // Exercicios práticos
        exercicios.put("Exercicio Inicial - Saída de dados", ExercicioInicial::executar);
        exercicios.put("Exercicio 1", ExercicioUm::executar);
        exercicios.put("Exercicio 2", ExercicioDois::executar);
        exercicios.put("Exercicio 3", ExercicioTres::executar);
        exercicios.put("Exercicio 4", ExercicioQuatro::executar);
        exercicios.put("Exercicio 5", ExercicioCinco::executar);
        exercicios.put("Exercicio 6", ExercicioSeis::executar);

        new CentralDeExercicios(exercicios).selecionarEExecutar();
    }
}