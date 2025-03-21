import java.util.ArrayList;

class GerenciadorTarefas {
    private ArrayList<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(String descricao) {
        tarefas.add(new TarefaSimples(descricao));
        System.out.println("Tarefa adicionada com sucesso!");
    }

    public void removerTarefa(int indice) {
        try {
            tarefas.remove(indice);
            System.out.println("Tarefa removida com sucesso!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Erro: Índice inválido.");
        }
    }

    public void marcarComoConcluida(int indice) {
        try {
            tarefas.get(indice).marcarComoConcluida();
            System.out.println("Tarefa marcada como concluída!");
        } catch (IndexOutOfBoundsException e) {
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