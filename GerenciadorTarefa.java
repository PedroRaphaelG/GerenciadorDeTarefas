import java.util.Scanner;

public class GerenciadorTarefa {
    private final RepositorioTarefa repositorio;
    private final Scanner scanner;

    public GerenciadorTarefa() {
        this.repositorio = new RepositorioTarefa();
        this.scanner = new Scanner(System.in);
    }

    public void executar() {
        while (true) {
            System.out.println("\n1. Adicionar Tarefa");
            System.out.println("2. Remover Tarefa");
            System.out.println("3. Marcar Tarefa como Concluída");
            System.out.println("4. Listar Tarefas");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                int opcao = Integer.parseInt(scanner.nextLine());
                switch (opcao) {
                    case 1:
                        adicionarTarefa();
                        break;
                    case 2:
                        removerTarefa();
                        break;
                    case 3:
                        concluirTarefa();
                        break;
                    case 4:
                        repositorio.listarTarefas();
                        break;
                    case 5:
                        System.out.println("Saindo...");
                        return;
                    default:
                        System.out.println("Erro: Opção inválida, digite um número de 1 a 5.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: Entrada inválida, digite um número de 1 a 5.");
            }
        }
    }

    private void adicionarTarefa() {
        System.out.print("Descrição da tarefa: ");
        String descricao = scanner.nextLine();
        repositorio.adicionarTarefa(new TarefaSimples(descricao));
    }

    private void removerTarefa() {
        System.out.print("Índice da tarefa a remover: ");
        int indice = Integer.parseInt(scanner.nextLine());
        repositorio.removerTarefa(indice);
    }

    private void concluirTarefa() {
        System.out.print("Índice da tarefa a concluir: ");
        int indice = Integer.parseInt(scanner.nextLine());
        repositorio.marcarComoConcluida(indice);
    }
}
