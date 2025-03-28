import java.util.ArrayList;
import java.util.List;

class RepositorioTarefa {
    private List<InterfaceTarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(InterfaceTarefa tarefa) {
        tarefas.add(tarefa);
        System.out.println("Tarefa adicionada com sucesso!");
    }

    public void removerTarefa(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.remove(indice);
            System.out.println("Tarefa removida com sucesso!");
        } else {
            System.out.println("Erro: Índice inválido.");
        }
    }

    public void marcarComoConcluida(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.get(indice).marcarComoConcluida();
            System.out.println("Tarefa marcada como concluída!");
        } else {
            System.out.println("Erro: Índice inválido.");
        }
    }

    public void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa encontrada.");
        } else {
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.print(i + ". ");
                tarefas.get(i).exibirTarefa();
            }
        }
    }
}
